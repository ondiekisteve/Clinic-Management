<%@ page import="com.beans.pojo.Patient" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="com.Interfaces.PatientInterface" %>

<%@ include file="header.jsp" %>
<div class="row">
    <div class="col-sm-4">
        <%@ include file="admin_sidebar.jsp" %>
    </div>
    <div class="col-sm-8">
        <div class="panel">
            <div class="panel-heading" style="background-color: #81bc00;color: white;">
                <h3 style="text-align:center;font-family:lucida bright;">View Doctor</h3>
            </div><!-- end of panel heading -->
            <div class="panel-body">
                <table class="table">
                    <thead>
                    <tr>
                        <th>Name</th>
                        <th>ID Number</th>
                        <th>Phone</th>
                        <th>Email</th>
                        <th>Gender</th>
                        <th>Operation</th>
                    </tr>
                    </thead>

                    <%
                        PatientInterface patientInterface= (PatientInterface) request.getAttribute("view");
                        if(patientInterface==null) {

                        }
                        else {
                           // Iterator<Patient> iterator=personInterface.viewPatient();
                            Iterator <Patient> iterator =patientInterface.viewPatient().iterator();
                            while (iterator.hasNext()) {
                                Patient patient=iterator.next();


                    %>
                    <tr>
                        </td>
                        <td><%=patient.getName() %>
                        </td>
                        <td><%=patient.getIdNo() %>
                        </td>
                        <td><%=patient.getPhone() %>
                        </td>
                        <td><%=patient.getEmail() %>
                        </td>
                        <td><%=patient.getGender() %>
                        </td>
                        <td><a href="delete.jsp?deleteId=<%=patient.getIdNo() %>" class="btn"
                               style="background-color: #81bc00;color: white;">Delete</a></td>
                    </tr>
                    <% }
                    }%>
                </table>
            </div><!-- End of panel body -->
        </div><!-- End of panel -->
    </div><!-- End of col-sm-8 -->
</div>
<!-- End of row -->
<%@ include file="footer.jsp" %>