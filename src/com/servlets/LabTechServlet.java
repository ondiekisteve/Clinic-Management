package com.servlets;

import com.Interfaces.DatabaseOperationsInterface;
import com.Interfaces.DbInterface;
import com.Interfaces.LabtechInterface;
import com.beans.pojo.Labtech;
import com.beans.pojo.Nurse;
import com.beans.pojo.Patient;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class LabTechServlet extends HttpServlet {
    @EJB(name = "labtech")
    LabtechInterface labtechInterface;

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Patient patient = new Patient();
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        String name = (String) session.getAttribute("username");
        response.setContentType("text/html");
        try {
            int idNo = Integer.parseInt(request.getParameter("idno"));
            float Weight = Float.parseFloat(request.getParameter("Weight"));
            float height = Float.parseFloat(request.getParameter("height"));
            patient.setWeight(Weight);
            patient.setHeight(height);
            patient.setIdNo(idNo);
            patient.setLabtech(name);
        }catch (NumberFormatException e)
        {
            e.printStackTrace();
        }
        patient.setName(name);
        labtechInterface.produceTestReport(patient);
    }
}
