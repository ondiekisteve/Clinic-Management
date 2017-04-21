package com.Interfaces;

import com.beans.pojo.Doctor;
import com.beans.pojo.Patient;

import javax.ejb.Local;
import java.util.ArrayList;

/**
 * Created by steve 2013 on 4/11/2017.
 */
@Local
public interface DoctorInterface {
    public void prescribeAndDiagonise(Patient p, Doctor d,int id);
}
