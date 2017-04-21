package com.Interfaces;

import com.beans.pojo.Labtech;
import com.beans.pojo.Patient;

import javax.ejb.Local;

/**
 * Created by steve 2013 on 4/11/2017.
 */
@Local
public interface LabtechInterface {
    public void produceTestReport(Patient p);
}
