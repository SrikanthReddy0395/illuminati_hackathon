package com.arcesium.archetypewar.domain;

import java.time.Instant;
import java.time.ZonedDateTime;

public class SomeObject {

    private int someInt;

    private String someString;

    private Instant someTime;

    private ZonedDateTime zonedDateTime;

    public SomeObject(int someInt, String someString, Instant someTime, ZonedDateTime zonedDateTime) {
        super();
        this.someInt = someInt;
        this.someString = someString;
        this.someTime = someTime;
        this.zonedDateTime = zonedDateTime;
    }

    public int getSomeInt() {
        return someInt;
    }

    public void setSomeInt(int someInt) {
        this.someInt = someInt;
    }

    public String getSomeString() {
        return someString;
    }

    public void setSomeString(String someString) {
        this.someString = someString;
    }

    public Instant getSomeTime() {
        return someTime;
    }

    public void setSomeTime(Instant someTime) {
        this.someTime = someTime;
    }

    public ZonedDateTime getZonedDateTime() {
        return zonedDateTime;
    }

    public void setZonedDateTime(ZonedDateTime zonedDateTime) {
        this.zonedDateTime = zonedDateTime;
    }
}
