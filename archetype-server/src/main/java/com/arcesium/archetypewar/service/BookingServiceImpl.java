package com.arcesium.archetypewar.service;

import com.arcesium.archetypewar.dao.BookingDao;
import com.arcesium.archetypewar.dao.SearchDao;
import com.arcesium.archetypewar.domain.Booking;
import com.arcesium.archetypewar.domain.Game;
import com.arcesium.archetypewar.domain.Slot;

import javax.inject.Inject;
import java.util.Date;
import java.util.List;

public class BookingServiceImpl implements BookingService {

    @Inject
    private BookingDao bookingDao;

    @Inject
    private SearchDao searchDao;

    @Override
    public Booking bookSlot(Booking booking) {
        if(booking == null || booking.getUser().getUserId() == null || booking.getGame() == null || booking.getStartTime() == null || booking.getEndTime() == null)
            return null;

        int playCount = (booking.getPlayers() != null && booking.getPlayers().size() > 0) ? booking.getPlayers().size() : booking.getPlayerCount();
        if(playCount > booking.getGame().getMaxCapacity() || playCount < booking.getGame().getMinCapacity()) return null;
        booking.setPlayerCount(playCount);
        return bookingDao.bookSlot(booking);
    }

    @Override
    public List<Slot> checkAvailability(Booking booking) throws Exception {
        if(booking == null){
            return null;
        }
        Integer startSlot = booking.getStartTime();
        Integer endSlot = booking.getEndTime();
        final Date date = booking.getDate();
        if(booking.getGame()== null){
            throw new Exception("Game is not selected");
        }
        searchDao.checkSlot(startSlot, endSlot, booking.getGame().getId(), booking.getPlayerCount(), date);
        return null;
    }

    @Override
    public List<Game> getGames() {
        return searchDao.getGames();
    }

    @Override
    public Booking cancelSlot(Booking booking) {
        if(booking == null || booking.getUser().getUserId() == null || booking.getGame() == null || booking.getStartTime() == null || booking.getEndTime() == null)
            return null;
        return bookingDao.cancelSlot(booking);
    }
}
