package com.arcesium.archetypewar.dao;

import com.arcesium.archetypewar.domain.Booking;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class BookingDaoImpl extends SqlSessionDaoSupport implements BookingDao {
    @Override
    public Booking bookSlot(Booking booking) {
        getSqlSession().update("insertBookingData", booking);
        return booking;
    }
}
