package com.arcesium.archetypewar.action.filter;

import javax.servlet.FilterConfig;
import javax.servlet.ServletException;

import com.arcesium.commons.logging.publisher.DatadogMetric;
import com.arcesium.commons.logging.publisher.DatadogPublishCallback;
import com.arcesium.commons.logging.publisher.DatadogPublishMeta;
import com.arcesium.commons.logging.publisher.DatadogPublisher;
import com.arcesium.commons.metrics.DatadogMetricsFactory;
import com.arcesium.commons.metrics.Metrics;
import com.arcesium.commons.metrics.MetricsFactory;
import com.arcesium.commons.servlet.utils.filter.RequestThreadLogFilter;

import java.util.concurrent.TimeUnit;

public class LoggingFilter extends RequestThreadLogFilter {

    private MetricsFactory metricFactory = new DatadogMetricsFactory();
    private DatadogPublishMeta meta = DatadogPublishMeta.builder()
            .withIncludeOperationTag(true)
            .withIncludeServiceTag(true)
            .build();
    private DatadogPublisher publisher = new DatadogPublisher(meta, getDefaultDatadogCallback());

    public void init(FilterConfig filterConfig) throws ServletException {
        super.init(filterConfig);
    }

    @Override
    protected void publish() {
        super.publish();
        publisher.publish(getPublishMeta());
    }


    public DatadogPublishCallback getDefaultDatadogCallback() {

        return e -> {
            try {
                try (Metrics datadogMetrics = metricFactory.getMetrics()) {

                    for (DatadogMetric m : e) {
                        if (m.getType() == DatadogMetric.MetricType.TIME) {
                            datadogMetrics.addTimeMetric(m.getName(), m.getValue(), TimeUnit.MILLISECONDS, m.getTags());
                        } else {
                            datadogMetrics.addHistogramMetric(m.getName(), m.getValue(), m.getTags());
                        }
                    }
                }
            } catch (Exception ex) {
                //LOG.warn("Metric not logged to datadog " + ex.getClass().getName() + ' ' + ex.getMessage());
            }
        };
    }
}