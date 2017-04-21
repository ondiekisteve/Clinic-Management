package com.beans.beanImplementations;

import com.DAO.LabtechDao;
import com.Interfaces.DatabaseOperationsInterface;
import com.Interfaces.LabtechInterface;
import com.beans.pojo.Labtech;
import com.beans.pojo.Patient;

import javax.ejb.*;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

/**
 * Created by steve 2013 on 4/11/2017.
 */
@Stateless(name = "labtech")
public class LabtechImplementations implements LabtechInterface {
//    @EJB
//    DatabaseOperationsInterface db;
@PersistenceContext(unitName = "stevo")
private EntityManager em;
    public void produceTestReport(Patient p) {
        LabtechDao labtechDao=new LabtechDao(em);
        labtechDao.merge(p);
//        String insertTestReport = "UPDATE patient_records SET Weight='" + p.getWeight() + "',height='" + p.getHeight() + "',labtech='" + t.getName() + "' WHERE idNo='" + p.getIdNo() + "'";
//
//        if (db.Update(insertTestReport) == true) {
//            System.out.println("Data successfully inserted");
//        } else
//
//        {
//            System.out.println("Error occured in inserting");
//        }
    }
}
