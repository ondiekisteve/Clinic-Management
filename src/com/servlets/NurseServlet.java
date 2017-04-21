package com.servlets;

import com.Interfaces.DatabaseOperationsInterface;
import com.Interfaces.DbInterface;
import com.beans.pojo.Nurse;

import javax.inject.Inject;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class NurseServlet extends HttpServlet {
    @Inject
    //@Named("MySql")
    @DbInterface(DbInterface.Type.MYSQL)
    DatabaseOperationsInterface connurse;

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Nurse nurse = new Nurse();
        HttpSession session = request.getSession();
        String name = (String) session.getAttribute("username");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String drugs = request.getParameter("drugs");
        int idno = Integer.parseInt(request.getParameter("idno"));
        nurse.setDrugs(drugs);
        nurse.setName(name);
        connurse.connect();
        String giveDrugs = "UPDATE patient_records SET drugs_given='" + nurse.getDrugs() + "', nurse='" + nurse.getName() + "' WHERE idNo='" + request.getParameter("idno") + "'";
        if (connurse.Update(giveDrugs)) {
            out.println("Data successfully updated");
        } else {
            out.println("Error occured in updating data");
        }
    }
}