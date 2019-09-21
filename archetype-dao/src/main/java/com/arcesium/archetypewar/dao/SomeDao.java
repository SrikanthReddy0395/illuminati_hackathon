package com.arcesium.archetypewar.dao;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.arcesium.archetypewar.domain.SomeObject;

public class SomeDao {

    private static final Logger LOG = LoggerFactory.getLogger(SomeDao.class);

    @Inject
    private SomeMapper someMapper;

    public SomeObject getSomeObject(int id) {
        // TODO: For testing, Fix it.
        final SomeObject someObject = someMapper.getSomeObject(id);
        LOG.info("Got object: {}", someObject);
        return null;
    }

}
