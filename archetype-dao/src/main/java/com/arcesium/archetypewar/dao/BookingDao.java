package com.arcesium.archetypewar.dao;

import com.arcesium.archetypewar.domain.Booking;

public interface BookingDao {

    Booking bookSlot(Booking booking);

    Booking cancelSlot(Booking booking);
}
