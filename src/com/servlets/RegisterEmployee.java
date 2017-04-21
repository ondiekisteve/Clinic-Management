package com.servlets;

import com.Interfaces.DatabaseOperationsInterface;
import com.Interfaces.DbInterface;
import com.Interfaces.EmployeeInterface;
import com.beans.beanImplementations.EmployeeImplementations;
import com.beans.pojo.Employee;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class RegisterEmployee extends HttpServlet {
    @EJB(name = "employee")
//     EmployeeInterface emp;
    EmployeeInterface employeeInterface;

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Employee employee = new Employee();
        PrintWriter out = response.getWriter();
        employee.setRole(request.getParameter("role"));
        try {
            employee.setIdNo(Integer.parseInt(request.getParameter("idno")));
            employee.setEmployeeNo(Integer.parseInt(request.getParameter("empNo")));
            employee.setAge(Integer.parseInt(request.getParameter("age")));
            employee.setSalary(Float.parseFloat(request.getParameter("salary")));
        }catch (NumberFormatException e)
        {
            e.printStackTrace();
        }
        employee.setQualifications(request.getParameter("qualifications"));
        employee.setName(request.getParameter("name"));
        employee.setDob(request.getParameter("dob"));
        employee.setPhone(request.getParameter("phone"));
        employee.setEmail(request.getParameter("email"));
        employee.setGender(request.getParameter("gender"));
        employee.setUsername(request.getParameter("username"));
        employee.setPassword(request.getParameter("password"));
        //emp.registerEmployee(employee);
        employeeInterface.registerEmployee(employee);
    }
}
