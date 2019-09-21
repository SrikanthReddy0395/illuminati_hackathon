package com.arcesium.archetypewar.domain;

import java.util.Date;
import java.sql.Time;
import java.util.Calendar;

public class Slot {
    private Time startTime;
    private Time endTime;
    private Date date;

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getTime(int timeSlot, Date date){
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.HOUR_OF_DAY, timeSlot/2);
        cal.set(Calendar.MINUTE, (timeSlot%2)*30);
        return cal.getTime();
    }
}
