package com.servlets;

import com.Interfaces.DatabaseOperationsInterface;
import com.Interfaces.DbInterface;
import com.Interfaces.ServicePersonI;
import com.beans.beanImplementations.ServicePerson;
import com.beans.pojo.Patient;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CheckoutServlet extends HttpServlet {
    @EJB(name = "ServicePersonI")
    ServicePersonI servicePersonI;

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Patient patient = new Patient();
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        int idNo = Integer.parseInt(request.getParameter("idno"));
        patient.setIdNo(idNo);
        servicePersonI.checkOut(patient,patient.getIdNo());

    }
}
