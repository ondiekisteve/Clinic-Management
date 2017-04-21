package com.servlets;

import com.Interfaces.DatabaseOperationsInterface;
import com.Interfaces.DbInterface;
import com.Interfaces.DoctorInterface;
import com.Interfaces.PersonInterface;
import com.beans.pojo.Doctor;
import com.beans.pojo.Patient;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class PrescribeAndDiagnos extends HttpServlet {
      @EJB(name = "doctor")
//    DoctorInterface di;
   DoctorInterface doctorInterface;
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        Patient patient = new Patient();
        Doctor doctor = new Doctor();
        int idNo = Integer.parseInt(request.getParameter("idno"));
        String diagnos = request.getParameter("diagnos");
        String prescribe = request.getParameter("prescribe");
        patient.setIdNo(idNo);
        patient.setDiagnosis(diagnos);
        patient.setPrescription(prescribe);
        HttpSession session = request.getSession();
        String name = (String) session.getAttribute("username");
        patient.setDoctor(name);
        doctorInterface.prescribeAndDiagonise(patient,doctor,patient.getIdNo());
    }
}
