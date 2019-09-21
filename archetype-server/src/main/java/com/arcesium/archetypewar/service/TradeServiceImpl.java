/*
 * Copyright (c) 2019 Arcesium LLC. All rights reserved.
 *
 * This software is the confidential and proprietary information of Arcesium LLC. ("Confidential Information"). You
 * shall not disclose such Confidential Information and shall use it only in accordance with the terms of the license
 * agreement you entered into with Arcesium LLC.
 */

package com.arcesium.archetypewar.service;

import com.arcesium.archetypewar.dao.TradeDao;
import com.arcesium.archetypewar.domain.Trade;

import java.util.List;

/**
 * @author viswanat
 */
public class TradeServiceImpl implements TradeService {

    private TradeDao tradeDao;

    public TradeServiceImpl(TradeDao tradeDao) {
        this.tradeDao = tradeDao;
    }

    @Override
    public void saveTrade(Trade trade) {
        //TODO: validate trade

        // save the trade using dao layer
        tradeDao.saveTrade(trade);
    }

    @Override
    public List<Trade> searchTrade(Trade tradeFilter) {
        return tradeDao.searchTrade(tradeFilter);
    }

    @Override
    public Trade getTradeById(long tradeId) {
        return tradeDao.getTradeById(tradeId);
    }
}
