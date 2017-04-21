package com.Interfaces;

import com.beans.pojo.Patient;
import com.beans.pojo.Person;

import java.util.List;

/**
 * Created by steve 2013 on 4/21/2017.
 */
public interface PatientInterface {
    public void save(Patient p);
    //    public ArrayList<Patient> delete();
    public List<Patient> viewPatient();
}
