package com.arcesium.archetypewar.service;

import com.arcesium.archetypewar.domain.Booking;
import com.arcesium.archetypewar.domain.Game;
import com.arcesium.archetypewar.domain.Slot;
import com.arcesium.archetypewar.domain.User;
import com.arcesium.frames.service.ServiceClass;
import com.arcesium.frames.service.ServiceMethod;
import org.joda.time.DateTime;

import java.util.Date;
import java.util.List;

@ServiceClass(appName = "employee-application", contactGroup = "reddyman@arcesium.com", format = "json", path = "bookingService")
public interface BookingService {

    @ServiceMethod
    public Booking bookSlot(Booking booking);

    @ServiceMethod
    public List<Slot> checkAvailability(Booking booking) throws Exception;

}
