package com.arcesium.archetypewar.dao;

import com.arcesium.archetypewar.domain.Game;

import java.util.Date;
import java.util.List;

public interface SearchDao {
    public String checkSlot(Integer startId, Integer endId, int id,int playerCount, Date date);

    List<Game> getGames();
}
