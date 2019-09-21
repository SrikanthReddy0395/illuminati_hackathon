package com.arcesium.archetypewar.service;

import com.arcesium.archetypewar.dao.BookingDao;
import com.arcesium.archetypewar.domain.Booking;
import com.arcesium.archetypewar.domain.Game;
import com.arcesium.archetypewar.domain.Slot;
import com.arcesium.archetypewar.domain.User;
import com.arcesium.archetypewar.utils.SlotUtil;

import javax.inject.Inject;
import java.util.List;

public class BookingServiceImpl implements BookingService {

    @Inject
    private BookingDao bookingDao;

    @Override
    public Booking bookSlot(User user, Game game, Slot slot, List<User> players, int playerCount) {
        if(user == null || game == null || slot == null) return null;
        int playCount = (players != null && players.size() > 0) ? players.size() : playerCount;
        if(user.getUserId().isEmpty() || playCount > game.getMaxCapacity() || playCount < game.getMinCapacity()) return null;
        Booking booking = new Booking();
        booking.setGame(game);
        booking.setPlayerCount(playCount);
        booking.setPlayers(players);
        booking.setUser(user);
        booking.setSlot(slot);
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
