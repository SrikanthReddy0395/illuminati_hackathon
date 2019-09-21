package com.arcesium.archetypewar.dao;

import com.arcesium.archetypewar.domain.Booking;
import com.arcesium.archetypewar.domain.Slot;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import javax.inject.Inject;
import java.util.HashMap;
import java.util.Map;

public class BookingDaoImpl extends SqlSessionDaoSupport implements BookingDao {

    @Inject
    private Slot slot;

    @Override
    public Booking bookSlot(Booking booking) {
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("bookingId", booking.getBookingId());
        param.put("userId", booking.getUser().getUserId());
        param.put("startTime", slot.getTime(booking.getStartTime(), booking.getDate()));
        param.put("endTime", slot.getTime(booking.getEndTime(), booking.getDate()));
        param.put("bookingDate", booking.getDate());
        param.put("players", booking.getPlayers());
        getSqlSession().insert("insertBookingData", param);
        return booking;
    }
}
