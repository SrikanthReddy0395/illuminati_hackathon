package com.arcesium.archetypewar.dao;

import com.arcesium.archetypewar.domain.Game;
import com.google.common.collect.ImmutableMap;
import org.apache.ibatis.session.ResultContext;
import org.apache.ibatis.session.ResultHandler;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.*;

import static com.google.common.collect.ImmutableMap.of;

public class SearchDaoImpl extends SqlSessionDaoSupport implements SearchDao {

    @Override
    public String checkSlot(Integer startId, Integer endId, int gameId, int playerCount, Date date) {
        Map<String, Object> map = new HashMap<>();
        map.put("startId", startId);
        map.put("endId", endId);
        map.put("gameId", gameId);
        map.put("date", date);
        if(getSqlSession().selectList("GetAvailableSlots", map).get(0).equals("No")){
            for(int i = startId ; i< endId ; i++){
                Map<String, Object> mapOfUsers = new HashMap<>();
                mapOfUsers.put("id", i);
                mapOfUsers.put("gameId", gameId);
                mapOfUsers.put("date", date);
                mapOfUsers.put("playerCount", playerCount);
                getSqlSession().selectList("GetUsersForSlotId", mapOfUsers);
            }
        }
        return null;

    }

    @Override
    public List<Game> getGames() {
        return getSqlSession().selectList("GetAllGames");
    }
}
