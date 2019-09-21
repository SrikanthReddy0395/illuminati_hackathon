/*
 * Copyright (c) 2019 Arcesium LLC. All rights reserved.
 *
 * This software is the confidential and proprietary information of Arcesium LLC. ("Confidential Information"). You
 * shall not disclose such Confidential Information and shall use it only in accordance with the terms of the license
 * agreement you entered into with Arcesium LLC.
 */

package com.arcesium.archetypewar.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Domain to store details of a Trade executed in the market
 */
public class Trade {

    private Long tradeId;

    private String securityIdentifier;

    private BigDecimal quantity;

    private BigDecimal costPrice;

    private String currencyCode;

    private BigDecimal commission;

    private String brokerAccount;

    private LocalDate settleDate;

    private LocalDate tradeDate;

    private String trader;

    private String portfolioBook;

    public String getSecurityIdentifier() {
        return securityIdentifier;
    }

    public void setSecurityIdentifier(String securityIdentifier) {
        this.securityIdentifier = securityIdentifier;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public BigDecimal getCommission() {
        return commission;
    }

    public void setCommission(BigDecimal commission) {
        this.commission = commission;
    }

    public String getBrokerAccount() {
        return brokerAccount;
    }

    public void setBrokerAccount(String brokerAccount) {
        this.brokerAccount = brokerAccount;
    }

    public LocalDate getSettleDate() {
        return settleDate;
    }

    public void setSettleDate(LocalDate settleDate) {
        this.settleDate = settleDate;
    }

    public LocalDate getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(LocalDate tradeDate) {
        this.tradeDate = tradeDate;
    }

    public String getTrader() {
        return trader;
    }

    public void setTrader(String trader) {
        this.trader = trader;
    }

    public String getPortfolioBook() {
        return portfolioBook;
    }

    public void setPortfolioBook(String portfolioBook) {
        this.portfolioBook = portfolioBook;
    }

    public Long getTradeId() {
        return tradeId;
    }

    public void setTradeId(Long tradeId) {
        this.tradeId = tradeId;
    }
}
