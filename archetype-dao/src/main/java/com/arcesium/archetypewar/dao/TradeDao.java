
/*
 * Copyright (c) 2019 Arcesium LLC. All rights reserved.
 *
 * This software is the confidential and proprietary information of Arcesium LLC. ("Confidential Information"). You
 * shall not disclose such Confidential Information and shall use it only in accordance with the terms of the license
 * agreement you entered into with Arcesium LLC.
 */

package com.arcesium.archetypewar.dao;

import com.arcesium.archetypewar.domain.Trade;

import java.util.List;

/**
 * @author viswanat
 */
public interface TradeDao {

    void saveTrade(Trade trade);

    List<Trade> searchTrade(Trade tradeFilter);

    Trade getTradeById(long tradeId);
}
