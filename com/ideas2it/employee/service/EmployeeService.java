package com.ideas2it.employee.service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.ideas2it.employee.model.Employee;

/**
 * This class is used for sent input to Employee 
 * @version 24/2/21
 * @author  danveer
 */
public class EmployeeService {
    Map<Integer, Employee> employees = new HashMap<Integer, Employee>();
    Integer employeeId = 1;

    /**
     * This Method is used to create employee
     */
    public int createEmployee(String name, String dob, String joinYear,
            long salary, long phoneNumber) throws ParseException {
        Employee newEmployee = new Employee(name, 
                new SimpleDateFormat("dd/MM/yyyy").parse(dob),
                new SimpleDateFormat("dd/MM/yyyy").parse(joinYear),
                salary, phoneNumber);
        if (null != employees.put(employeeId, newEmployee)) {
            ++employeeId;
            return 1;
        } else {
            return 0;
        }
    }
   
    /**
     * This method is use for updatename
     */
    public boolean updateName(String name, Integer employeeId) {
        Employee employee = employees.get(employeeId);
        if (null != employee) {
            employee.setName(name);
            return true;
        } else {
            return false;        
        }           
    }

    /**
     * This method is used for updateDob 
     */
    public boolean updateDob(String dob, Integer employeeId) 
            throws ParseException {
        Employee employee = employees.get(employeeId);
        if (null != employee) {
            employee.setDob(new SimpleDateFormat("dd/MM/yyyy").parse(dob));
            return true;        
        } else {
            return false;        
        }        
    }

    /**
     * This method is used for updateJoinYear
     */
    public boolean updateJoinYear(String joinYear, Integer employeeId)
            throws ParseException {
        Employee employee = employees.get(employeeId);
        if (null != employee) {
            employee.setJoinYear(new SimpleDateFormat("dd/MM/yyyy").
                    parse(joinYear));
            return true;        
        } else {
            return false;        
        }        
    }

    /**
     * This method is used for updateSalary
     */
    public boolean updateSalary(long salary, Integer employeeId) {
        Employee employee = employees.get(employeeId);
        if (null != employee) {
            employee.setSalary(salary);
            return true;
        } else {
            return false;
        }        
    }

    /**
     * This method is used for updatePhoneNumber
     */
    public boolean updatePhoneNumber(long phoneNumber, Integer employeeId) {
        Employee employee = employees.get(employeeId);
        if (null != employee) {
            employee.setPhoneNumber(phoneNumber);
            return true;        
        } else {
            return false;   
        }        
    }
     
    /**
     * This Method is used for Delect Employee Details
     */
    public boolean deleteEmployee(Integer employeeId) {
        return (null == employees.remove(employeeId)) ? true : false;
    }      
    
    /**
     * This Method is used for display Employee Details
     */
    public Employee retrieveEmployee(Integer employeeId) {
        return employees.get(employeeId);
    }
}