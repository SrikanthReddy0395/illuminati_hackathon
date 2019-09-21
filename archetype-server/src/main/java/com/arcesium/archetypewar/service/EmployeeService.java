package com.arcesium.archetypewar.service;


import com.arcesium.archetypewar.domain.Employee;
import com.arcesium.frames.service.ServiceClass;
import com.arcesium.frames.service.ServiceMethod;

import java.util.List;

@ServiceClass(appName = "employee-application", contactGroup = "arcsquare@arcesium.com", format = "json", path = "employeeService")
public interface EmployeeService {

    @ServiceMethod
    List<Employee> getAllEmployees();

    @ServiceMethod
    Employee getEmployeeById(int employeeId);

}