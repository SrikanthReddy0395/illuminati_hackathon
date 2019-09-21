package com.arcesium.archetypewar.service;

import com.arcesium.archetypewar.domain.Booking;
import com.arcesium.archetypewar.domain.Game;
import com.arcesium.archetypewar.domain.Slot;
import com.arcesium.archetypewar.domain.User;
import com.arcesium.frames.service.ServiceClass;
import com.arcesium.frames.service.ServiceMethod;

import java.util.List;

@ServiceClass(appName = "employee-application", contactGroup = "reddyman@arcesium.com", format = "json", path = "bookingService")
public interface BookingService {

    @ServiceMethod
    public Booking bookSlot(User user, Game game, Slot slot, List<User> players, int playerCount);

}
