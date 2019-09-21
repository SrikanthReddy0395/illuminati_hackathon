/*
 * Copyright (c) 2019 Arcesium LLC. All rights reserved.
 *
 * This software is the confidential and proprietary information of Arcesium LLC. ("Confidential Information"). You
 * shall not disclose such Confidential Information and shall use it only in accordance with the terms of the license
 * agreement you entered into with Arcesium LLC.
 */

package com.arcesium.archetypewar.dao;

import com.arcesium.archetypewar.domain.Trade;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @author viswanat
 */
public class TradeDaoImpl extends SqlSessionDaoSupport implements TradeDao {

    @Override
    public void saveTrade(Trade trade) {
        //TODO: use the sql session to insert trade
    }

    @Override
    public List<Trade> searchTrade(Trade tradeFilter) {
        return null;
    }

    @Override
    public Trade getTradeById(long tradeId) {
        return null;
    }
}
