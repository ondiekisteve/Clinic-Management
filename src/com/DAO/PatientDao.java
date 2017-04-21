package com.DAO;

import com.beans.pojo.Patient;
import com.beans.pojo.Person;

import javax.persistence.EntityManager;

/**
 * Created by steve 2013 on 4/21/2017.
 */
    public class PatientDao extends GenericDao<Patient, Long>{
    public PatientDao(EntityManager entityManager) {

        super(Patient.class, entityManager);
    }
}
