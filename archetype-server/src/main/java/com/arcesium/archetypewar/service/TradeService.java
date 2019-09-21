/*
 * Copyright (c) 2019 Arcesium LLC. All rights reserved.
 *
 * This software is the confidential and proprietary information of Arcesium LLC. ("Confidential Information"). You
 * shall not disclose such Confidential Information and shall use it only in accordance with the terms of the license
 * agreement you entered into with Arcesium LLC.
 */

package com.arcesium.archetypewar.service;

import com.arcesium.archetypewar.domain.Trade;
import com.arcesium.frames.service.ServiceClass;
import com.arcesium.frames.service.ServiceMethod;

import java.util.List;

/**
 * Service to manage executed trades in the platform
 *  
 * @author viswanat
 */
@ServiceClass(appName = "archetypewar", contactGroup = "arcsquare@arcesium.com", format = "json", path = "tradeService",
        docString = "Service to manage CRUD operations on booked trades")
public interface TradeService {

	@ServiceMethod(docString = "Endpoint to persist booked trade")
    void saveTrade(Trade trade);

	@ServiceMethod(docString = "Search trades that match the specified filter values")
    List<Trade> searchTrade(Trade tradeFilter);

	@ServiceMethod(docString = "Endpoint to lookup trade by id")
    Trade getTradeById(long tradeId);
}
