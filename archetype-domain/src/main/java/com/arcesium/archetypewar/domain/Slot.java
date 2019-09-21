package com.arcesium.archetypewar.domain;

import org.joda.time.DateTime;

import java.sql.Date;

public class Slot {
    private DateTime startTime;
    private DateTime endTime;

    public DateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(DateTime startTime) {
        this.startTime = startTime;
    }

    public DateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(DateTime endTime) {
        this.endTime = endTime;
    }
}
