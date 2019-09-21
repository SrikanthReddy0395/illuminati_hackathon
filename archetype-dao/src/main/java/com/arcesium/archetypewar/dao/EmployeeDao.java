/*
 * Copyright (c) 2019 Arcesium LLC. All rights reserved.
 *
 * This software is the confidential and proprietary information of Arcesium LLC. ("Confidential Information"). You
 * shall not disclose such Confidential Information and shall use it only in accordance with the terms of the license
 * agreement you entered into with Arcesium LLC.
 */

package com.arcesium.archetypewar.dao;

import com.arcesium.archetypewar.domain.Employee;
import java.util.List;

/**
 * Interface defines the contract to interact with database for sample data.
 */
public interface EmployeeDao {

    /**
     * Gets all sample data
     *
     * @return List pf sample data
     */
    List<Employee> getAllEmployeeDataList();

    /**
     * Gets the sample data for specified ID
     *
     * @param id
     *               ID for which the sample data to be fetched.
     *
     * @return Required sample data.
     */
    Employee getEmployeeDataById(int id);
}