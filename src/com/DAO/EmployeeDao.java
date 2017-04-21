package com.DAO;

import com.beans.pojo.Employee;

import javax.persistence.EntityManager;

/**
 * Created by steve 2013 on 4/19/2017.
 */
public class EmployeeDao extends GenericDao<Employee,Long> {
    public EmployeeDao(EntityManager entityManager) {
        super(Employee.class, entityManager);
    }
}
