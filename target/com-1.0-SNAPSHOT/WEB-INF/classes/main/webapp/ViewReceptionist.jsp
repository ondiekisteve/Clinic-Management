<%@ page import="java.sql.*" %>
<%@ page import="javax.sql.*" %>
<%@ page import="com.Interfaces.PersonInterface" %>
<%@ page import="com.beans.beanImplementations.Mysql" %>
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
                        <th>S/N</th>
                        <th>Name</th>
                        <th>ID Number</th>
                        <th>Phone</th>
                        <th>Email</th>
                        <th>Gender</th>
                        <th>Role</th>
                        <th>Operation</th>
                    </tr>
                    </thead>
                    <%! int counter = 0; %>
                    <%
                        PersonInterface personInterface= (PersonInterface) request.getAttribute("personInterface");
                        personInterface
//                        Mysql viewDoc = new Mysql();
//                        ResultSet rs = null;
//                        viewDoc.connect();
//                        String getEmployees = "SELECT * FROM person WHERE role='Receptionist'";
//                        rs = viewDoc.Read(getEmployees);
//                        while (rs.next()) {
//                            int personId = rs.getInt("person_id");
//                            String name = rs.getString("name");
//                            int idNo = rs.getInt("idNo");
//                            String phone = rs.getString("phone");
//                            String email = rs.getString("email");
//                            String gender = rs.getString("gender");
//                            String role = rs.getString("role");
//                            counter++;

                    %>
                    <tr>
                        <td><%=counter %>
                        </td>
                        <td><%=name %>
                        </td>
                        <td><%=idNo %>
                        </td>
                        <td><%=phone %>
                        </td>
                        <td><%=email %>
                        </td>
                        <td><%=gender %>
                        </td>
                        <td><%=role %>
                        </td>
                        <td><a href="delete.jsp?deleteId=<%=personId %>" class="btn"
                               style="background-color: #81bc00;color: white;">Delete</a></td>
                    </tr>
                    <% } %>
                </table>
            </div><!-- End of panel body -->
        </div><!-- End of panel -->
    </div><!-- End of col-sm-8 -->
</div>
<!-- End of row -->
<%@ include file="footer.jsp" %>