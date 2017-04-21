package com.beans.beanImplementations;

import com.DAO.EmployeeDao;
import com.Interfaces.DatabaseOperationsInterface;
import com.Interfaces.EmployeeInterface;
import com.beans.pojo.Employee;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;

/**
 * Created by steve 2013 on 4/12/2017.
 */
@Stateless(name = "employee")
public class EmployeeImplementations implements EmployeeInterface {
    //@EJB
    //DatabaseOperationsInterface db;
    @PersistenceContext(unitName = "stevo")
    private EntityManager em;
    public void registerEmployee(Employee employee) {
        EmployeeDao employeeDao=new EmployeeDao(em);
        employeeDao.add(employee);
//        String registerEmployee = "INSERT INTO person(idNo,name,age,dob,phone,email,gender,role,pass,username)VALUES('" + employee.getIdNo() + "','" + employee.getName() + "','" + employee.getAge() + "','" + employee.getDob() + "','" + employee.getPhone() + "','" + employee.getEmail() + "','" + employee.getGender() + "','" + employee.getRole() + "','" + employee.getPassword() + "','" + employee.getUsername() + "')";
//        if (db.write(registerEmployee)) {
//            System.out.println("Employee Successfully created");
//        } else {
//            System.out.println("invalid credentials");
//        }
    }

    public ArrayList<Employee> deleteEmployee() {
        return null;
    }
}
