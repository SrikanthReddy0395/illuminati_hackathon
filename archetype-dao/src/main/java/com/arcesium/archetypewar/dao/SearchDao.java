package com.arcesium.archetypewar.dao;

import com.arcesium.archetypewar.domain.Game;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface SearchDao {
    List<Game> getGames();
    public Map checkSlot(Integer startId, Integer endId, Game game, int playerCount, Date date);
}
