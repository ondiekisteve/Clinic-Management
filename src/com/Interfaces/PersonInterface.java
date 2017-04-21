package com.Interfaces;

import com.beans.pojo.Patient;
import com.beans.pojo.Person;

import javax.ejb.Local;
import java.util.List;

/**
 * Created by steve 2013 on 4/19/2017.
 */
@Local
public interface PersonInterface {
    public void save(Person person);
//    public ArrayList<Patient> delete();
     public List<Patient> viewPatient();


}
