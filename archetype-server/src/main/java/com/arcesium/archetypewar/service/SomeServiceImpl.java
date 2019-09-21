package com.arcesium.archetypewar.service;

import java.time.Instant;
import java.time.ZonedDateTime;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.arcesium.archetypewar.domain.SomeObject;

@Named("SomeService")
public class SomeServiceImpl implements SomeService{

    private static final Logger LOG = LoggerFactory.getLogger(SomeServiceImpl.class);

    @Override
    public SomeObject getSomeObject(int objectId) {
        return new SomeObject(objectId, "Some String", Instant.now(), ZonedDateTime.now());
    }

    @Override
    public void processSomeObject(SomeObject someObject) {
        LOG.info("Received {} ", someObject);
        if (someObject != null) {
            someObject.setSomeString("processed " + someObject.getSomeString());
        }
        LOG.info("Processed {} ", someObject);
    }

}
