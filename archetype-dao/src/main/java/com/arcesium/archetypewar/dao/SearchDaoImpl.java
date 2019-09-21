package com.arcesium.archetypewar.dao;

import com.arcesium.archetypewar.domain.Game;
import com.arcesium.archetypewar.domain.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.TreeMap;

public class SearchDaoImpl extends SqlSessionDaoSupport implements SearchDao {

    @Override
    public Map checkSlot(Integer startId, Integer endId, Game game, int playerCount, Date date) {
        Map<String, Object> result = new HashMap<String, Object>();
        Map<String, Object> map = new HashMap<>();
        map.put("startId", startId);
        map.put("endId", endId);
        map.put("gameId", game.getId());
        map.put("date", date);
        if(getSqlSession().selectList("GetAvailableSlots", map).get(0).equals("No")){
            result.put("Availability", false);
            for(int i = startId ; i< endId ; i++){
                Map<String, Object> mapOfUsers = new HashMap<>();
                mapOfUsers.put("id", i);
                mapOfUsers.put("gameId", game.getId());
                mapOfUsers.put("date", date);
                mapOfUsers.put("playerCount", playerCount);
                List<User> users = getSqlSession().selectList("GetUsersForSlotId", mapOfUsers);
                if(users == null || (game.getMaxCapacity() - users.size()) >= playerCount) {
                    if(!result.containsKey("AvailableSlots")) {
                        result.put("AvailableSlots", new TreeMap());
                    }
                    ((Map)result.get("AvailableSlots")).put(startId, users);
                } else {
                    if(!result.containsKey("OccupiedSlots")) {
                        result.put("OccupiedSlots", new TreeMap());
                    }
                    ((Map)result.get("OccupiedSlots")).put(startId, users);
                }
            }
            return result;
        }
        else {
            result.put("Availability", true);
            return result;
        }

    }

    @Override
    public List<Game> getGames() {
        return getSqlSession().selectList("GetAllGames");
    }
}
