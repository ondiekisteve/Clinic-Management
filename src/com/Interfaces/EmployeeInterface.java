package com.Interfaces;

import com.beans.pojo.Employee;

import javax.ejb.Local;
import java.util.ArrayList;

/**
 * Created by steve 2013 on 4/12/2017.
 */
@Local
public interface EmployeeInterface {
    public void registerEmployee(Employee employee);
    public ArrayList<Employee> deleteEmployee();
}
