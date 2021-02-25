package com.ideas2it.employee.controller;
 
import java.text.ParseException;
import java.util.Date;

import com.ideas2it.employee.model.Employee;
import com.ideas2it.employee.service.EmployeeService;

/**
 * This class is used as controller
 * @version 24/2/21
 * @author  danveer
 */
public class EmployeeController {   
    EmployeeService employeeService = new EmployeeService();
   
    /**
     * This method is used for sending details to service
     */
    public int createEmployee(String name, String dob, String joinYear, 
        long salary, long phoneNumber) throws ParseException {
        return employeeService.createEmployee(name, dob, joinYear, salary, phoneNumber);
    }
    
    /**
     * This method is use for sending updatename to sevice
     */
    public boolean updateName(String name, Integer employeeId) {
        return employeeService.updateName(name, employeeId);
    }

    /**
     * This method is use for sending updateDob to sevice
     */
    public boolean updateDob(String dob, Integer employeeId)
            throws ParseException {
        return employeeService.updateDob(dob, employeeId);
    }

    /**
     * This method is use for sending updatejoinYear to sevice
     */
    public boolean updateJoinYear(String joinYear, Integer employeeId) 
            throws ParseException {
        return employeeService.updateJoinYear(joinYear, employeeId);
    }

    /**
     * This method is use for sending updateSalary to sevice
     */
    public boolean updateSalary(long salary, Integer employeeId) {
        return employeeService.updateSalary(salary, employeeId);
    }

    /**
     * This method is use for sending updatePhoneNumber to sevice
     */
    public boolean updatePhoneNumber(long phoneNumber, Integer employeeId) {
        return employeeService.updatePhoneNumber(phoneNumber, employeeId);
    }

    /**
     * This method is use for sending DeleteEmployee to sevice
     */
    public boolean deleteEmployee(Integer employeeId) {
        return employeeService.deleteEmployee(employeeId);
    }
  
    /**
     * This method is use for sending displayEmployee to sevice
     */
    public Employee retrieveEmployee(Integer employeeId) {
       return  employeeService.retrieveEmployee(employeeId);
    }
}