package com.servlets;

import com.Interfaces.PersonInterface;
import com.Interfaces.ServicePersonI;
import com.beans.pojo.Patient;

import javax.ejb.EJB;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class RegisterPatient extends HttpServlet {
    @EJB(name = "patient")
            //ServicePersonI servicePersonI;
    PersonInterface personInterface;

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        Patient patient = new Patient();
        try {
            patient.setIdNo(Integer.parseInt(request.getParameter("idno")));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        patient.setName(request.getParameter("name"));
        try {
            patient.setAge(Integer.parseInt(request.getParameter("age")));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        patient.setDob(request.getParameter("dob"));
        patient.setPhone(request.getParameter("phone"));
        patient.setEmail(request.getParameter("email"));
        patient.setGender(request.getParameter("gender"));
        personInterface.save(patient);
        //servicePersonI.registerPatient(patient);
    }
}
