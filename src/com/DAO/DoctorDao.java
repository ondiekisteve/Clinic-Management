package com.DAO;

import com.beans.pojo.Person;

import javax.persistence.EntityManager;

/**
 * Created by steve 2013 on 4/19/2017.
 */
public class DoctorDao extends GenericDao <Person, Long>{
    public DoctorDao(EntityManager entityManager) {
        super(Person.class, entityManager);
    }
}
