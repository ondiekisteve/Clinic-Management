package com.beans.beanImplementations;

import com.Interfaces.DatabaseOperationsInterface;
import com.Interfaces.ServicePersonI;
import com.beans.pojo.Patient;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by steve 2013 on 4/10/2017.
 */
@Stateless (name = "dbOperations")
public class ServicePerson implements ServicePersonI {
    @EJB
    DatabaseOperationsInterface operations;
         public ArrayList<Patient> registerPatient(Patient patient) {
        ArrayList<Patient> patients = new ArrayList<Patient>();
        operations.connect();
        String getPerson = "SELECT * FROM person WHERE idNo='" + patient.getIdNo() + "'";
        int count = 0;
        try {
            ResultSet rs = operations.Read(getPerson);
            while (rs.next()) {
                count++;

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (count == 0) {
            String insert = "INSERT INTO Person(idNo,name,age,dob,phone,email,gender)VALUES('" + patient.getIdNo() + "','" + patient.getName() + "','" + patient.getAge() + "','" + patient.getDob() + "','" + patient.getPhone() + "','" + patient.getEmail() + "','" + patient.getGender() + "')";
            if (operations.write(insert) == true) {
                System.out.println("Data successfully inserted");
            } else

            {
                System.out.println("Error occured in inserting data");
            }
        } else

        {
            System.out.println("The person with idNo " + patient.getIdNo() + " Already exists But checkin details have been captured");
        }
        Date dNow = new Date();
        SimpleDateFormat time = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

        String currentTime = time.format(dNow);
        patient.setTimeIn(currentTime);
        String recordDetails = "INSERT INTO patient_records(idNo,timeIn)VALUES('" + patient.getIdNo() + "','" + patient.getTimeIn() + "')";
        operations.write(recordDetails);
        return patients;
    }

    public ArrayList<Patient> getPatientRecords(){
        operations.connect();
        ArrayList<Patient> patients = new ArrayList<Patient>();
        String getEmployees = "SELECT * FROM person JOIN patient_records ON person.idNo=patient_records.idNo";
        ResultSet rs = operations.Read(getEmployees);
        try {
            while (rs.next()) {
                Patient p=new Patient();
                p.setIdNo(rs.getInt("person_id"));
                p.setPhone(rs.getString("phone"));
                p.setEmail(rs.getString("email"));
                p.setName(rs.getString("name"));
                p.setAge(rs.getInt("age"));
                p.setDiagnosis(rs.getString("diagnosis"));
                p.setPrescription(rs.getString("prescription"));
                p.setTimeIn(rs.getString("timeIn"));
                p.setTimeOut(rs.getString("timeOut"));
                p.setGender(rs.getString("gender"));
                p.setHeight(rs.getFloat("height"));
                p.setWeight(rs.getFloat("weight"));
                patients.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return patients;
    }

    public void deletePatient(Patient patient) {
        operations.connect();
        String deletePatient = "DELETE FROM patient_records WHERE idNo='" + patient.getIdNo() + "'";
        operations.Update(deletePatient);
    }

    public void updatePatient(Patient p) {

    }

    public void checkOut(Patient p, int id) {
        operations.connect();
        Date dNow = new Date();
        SimpleDateFormat time = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

        String currentTime = time.format(dNow);
        p.setTimeIn(currentTime);

        String checkoutPatient = "UPDATE patient_records SET timeOut='" + p.getTimeOut() + "' WHERE idNo='" + p.getIdNo() + "'";

        if (operations.Update(checkoutPatient) == true) {
            System.out.println(p.getTimeOut()+"Data successfully inserted");
        } else

        {
            System.out.println("Error occured in inserting");
        }
    }
}
