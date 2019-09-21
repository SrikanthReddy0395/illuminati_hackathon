package com.arcesium.archetypewar.dao;

import java.util.Date;

public interface SearchDao {
    public String checkSlot(Integer startId, Integer endId, int id,int playerCount, Date date);
}
