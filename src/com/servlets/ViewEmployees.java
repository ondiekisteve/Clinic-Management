package com.servlets;

import com.Interfaces.PersonInterface;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by steve 2013 on 4/21/2017.
 */
public class ViewEmployees extends HttpServlet {
    @EJB(name = "patient")
    PersonInterface personInterface;
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    {
        response.setContentType("text/html");
        request.setAttribute("view",personInterface);
        RequestDispatcher rd=request.getRequestDispatcher("ViewPatient.jsp");
        try {
            rd.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
