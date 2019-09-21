package com.arcesium.archetypewar.dao;

import com.arcesium.archetypewar.domain.Booking;
import com.arcesium.archetypewar.domain.utils.SlotUtil;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookingDaoImpl extends SqlSessionDaoSupport implements BookingDao {
    @Override
    public Booking bookSlot(Booking booking) {
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("bookingId", booking.getBookingId());
        param.put("userId", booking.getUser().getUserId());
        List<Integer> slots = SlotUtil.getSlotIds(booking.getSlot());
        param.put("startTime", slots.get(0));
        param.put("endTime", slots.get(1));
        param.put("bookingDate", booking.getSlot().getStartTime().toDate());
        param.put("players", booking.getPlayers());
        getSqlSession().insert("insertBookingData", param);
        return booking;
    }
}
