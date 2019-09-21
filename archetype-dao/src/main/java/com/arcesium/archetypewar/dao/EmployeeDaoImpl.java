/*
 * Copyright (c) 2019 Arcesium LLC. All rights reserved.
 *
 * This software is the confidential and proprietary information of Arcesium LLC. ("Confidential Information"). You
 * shall not disclose such Confidential Information and shall use it only in accordance with the terms of the license
 * agreement you entered into with Arcesium LLC.
 */

package com.arcesium.archetypewar.dao;

import com.arcesium.archetypewar.domain.Employee;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.Collections;
import java.util.List;

/**
 * This class is to fetch the sample data from database.
 *
 * @author afaque
 */
public class EmployeeDaoImpl extends SqlSessionDaoSupport implements EmployeeDao {

    @Override
    public List<Employee> getAllEmployeeDataList() {

        return getSqlSession().selectList("getEmployeeData", Collections.emptyMap());
    }

    @Override
    public Employee getEmployeeDataById(int id) {
        return getSqlSession().selectOne("getEmployeeData", Collections.singletonMap("id", id));
    }

}