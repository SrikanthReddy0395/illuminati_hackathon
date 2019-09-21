package com.arcesium.archetypewar.service;

import com.arcesium.archetypewar.dao.BookingDao;
import com.arcesium.archetypewar.dao.SearchDao;
import com.arcesium.archetypewar.domain.Booking;
import com.arcesium.archetypewar.domain.Game;
import com.arcesium.archetypewar.domain.Slot;
import com.arcesium.archetypewar.domain.utils.SlotUtil;

import javax.inject.Inject;
import java.util.List;

public class BookingServiceImpl implements BookingService {

    @Inject
    private BookingDao bookingDao;

    @Inject
    private SearchDao searchDao;

    @Override
    public Booking bookSlot(Booking booking) {
        if(booking == null || booking.getUser().getUserId() == null || booking.getGame() == null || booking.getSlot() == null) return null;
        int playCount = (booking.getPlayers() != null && booking.getPlayers().size() > 0) ? booking.getPlayers().size() : booking.getPlayerCount();
        if(playCount > booking.getGame().getMaxCapacity() || playCount < booking.getGame().getMinCapacity()) return null;
        booking.setPlayerCount(playCount);
        return bookingDao.bookSlot(booking);
    }

    @Override
    public List<Slot> checkAvailability(Game game, Slot slot) {
        List<Integer> slotIds = SlotUtil.getSlotIds(slot);
        for(Integer slotId : slotIds){

        }
        return null;
    }
}
