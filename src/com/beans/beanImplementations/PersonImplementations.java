package com.beans.beanImplementations;

import com.DAO.PatientDao;
import com.DAO.PersonDao;
import com.Interfaces.*;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.beans.pojo.Patient;
import com.beans.pojo.Person;

import java.util.Iterator;
import java.util.List;

@Stateless(name = "patient")
public class PersonImplementations implements PersonInterface {
    @PersistenceContext(unitName = "stevo")
    private EntityManager em;
    public void save(Person person) {
        PersonDao p=new PersonDao(em);
        p.add(person);
    }
    public List<Patient> viewPatient() {
        PatientDao pat=new PatientDao(em);
        return pat.findAll();

    }
}
