package com.DAO;

import com.beans.pojo.Patient;
import com.beans.pojo.Person;

import javax.persistence.EntityManager;

/**
 * Created by Administrator on 3/24/2017.
 */
public class ReceptionistDao extends GenericDao<Patient, Long> {
    public ReceptionistDao(EntityManager entityManager) {
        super(Patient.class, entityManager);
    }
}
