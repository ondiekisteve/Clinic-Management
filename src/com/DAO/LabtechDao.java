package com.DAO;

import com.beans.pojo.Labtech;
import com.beans.pojo.Patient;

import javax.persistence.EntityManager;

/**
 * Created by steve 2013 on 4/20/2017.
 */
public class LabtechDao extends GenericDao<Patient,Long> {
    public LabtechDao(EntityManager entityManager) {
        super(Patient.class, entityManager);
    }
}
