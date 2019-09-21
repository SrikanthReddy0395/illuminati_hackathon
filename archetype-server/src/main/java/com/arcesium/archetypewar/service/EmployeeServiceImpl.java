package com.arcesium.archetypewar.service;

import com.arcesium.archetypewar.dao.EmployeeDao;
import com.arcesium.archetypewar.domain.Employee;

import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.log4j.Logger;

/**
 * Implementation if the employee service
 *
 *
 * @see EmployeeService
 */
public class EmployeeServiceImpl implements EmployeeService {

    private static final Logger LOG = Logger.getLogger(EmployeeServiceImpl.class);

    @Inject
    private EmployeeDao employeeDao;

    private int maxSize;

    @Override
    public List<Employee> getAllEmployees() {
        LOG.info("Getting data of Employee (All)");
        List<Employee> employee =  employeeDao.getAllEmployeeDataList();
        List<Employee> results = employee.stream().limit(maxSize).collect(Collectors.toList());
        return results;
    }

    @Override
    public Employee getEmployeeById(int employeeId)
    {
        LOG.info("Getting employee by ID)");
        return employeeDao.getEmployeeDataById(employeeId);
    }


    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
}