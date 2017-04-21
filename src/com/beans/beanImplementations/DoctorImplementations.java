package com.beans.beanImplementations;

import com.DAO.DoctorDao;
import com.Interfaces.DatabaseOperationsInterface;
import com.Interfaces.DoctorInterface;
import com.beans.pojo.Doctor;
import com.beans.pojo.Patient;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;

/**
 * Created by steve 2013 on 4/11/2017.
 */
@Stateless(name = "doctor")
public class DoctorImplementations implements DoctorInterface{
//    @EJB
//    DatabaseOperationsInterface db;
@PersistenceContext(unitName = "stevo")
private EntityManager em;
    public void prescribeAndDiagonise(Patient p, Doctor d,int id) {
        DoctorDao doctorDao=new DoctorDao(em);
        doctorDao.merge(p);
//        String update = "UPDATE patient_records SET diagnosis='" + p.getDiagnosis() + "',prescription='" + p.getPrescription() + "',doctor='" + d.getName() + "' WHERE idNo='" + p.getIdNo() + "' AND timeOut IS NULL";
//        if (db.Update(update)) {
//            System.out.println("Successfully updated");
//        } else {
//            System.out.println("Error");
//        }
    }
}
