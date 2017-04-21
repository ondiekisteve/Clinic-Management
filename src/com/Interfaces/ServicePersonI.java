package com.Interfaces;

import com.beans.pojo.Patient;
import com.beans.pojo.Person;

import javax.ejb.Local;
import java.util.ArrayList;

/**
 * Created by steve 2013 on 4/10/2017.
 */
@Local
public interface ServicePersonI {
  public ArrayList<Patient> registerPatient(Patient p);
  public ArrayList<Patient> getPatientRecords();
  public void deletePatient(Patient p);
  public void updatePatient(Patient p);
  public void checkOut(Patient p, int id);
}
