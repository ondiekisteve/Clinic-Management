package com.beans.beanImplementations;

import com.DAO.PatientDao;
import com.Interfaces.PatientInterface;
import com.beans.pojo.Patient;
import com.beans.pojo.Person;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by steve 2013 on 4/21/2017.
 */
public class PatientImplementations implements PatientInterface{
    @PersistenceContext(unitName = "stevo")
    private EntityManager em;
    public void save(Patient p) {

    }

    public List<Patient> viewPatient() {
        PatientDao pat=new PatientDao(em);
        return pat.findAll();

    }
}
