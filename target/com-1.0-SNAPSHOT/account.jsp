<%--
  Created by IntelliJ IDEA.
  User: steve 2013
  Date: 4/3/2017
  Time: 8:52 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link type="text/css" rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-sm-2">

        </div><!--End of col-->
        <div class="col-sm-8">
            <h1><p align="center"><font size="6" color="#800000">Bank Transaction Request Form</h1>
            <hr>
            <table bgcolor="#FFFFCC" align="center" class="table table-bordered">
                <form action="WebClient.jsp" method="POST">
                    <tr>
                        <td>
                    </tr>
                    </td>
                    <tr>
                        <td>Enter the amount in Ksh:
                            <input type="text" name="amt" size="10" class="form-control">
                    </tr>
                    </td>
                    <br>
                    <tr>
                        <td><b>Select your choice:</b>
                    </tr>
                    </td>
                    <tr>
                        <td><input type="radio" name="operation" value="deposit">Deposit
                    </tr>
                    </td>
                    <tr>
                        <td><input type="radio" name="operation" value="withdraw">Withdraw<br>
                    </tr>
                    </td>

                    <tr>
                        <td>
                            <input type="submit" value="Transmit" class="btn btn-success">
                            <input type="reset" value="Reset" class="btn btn-danger">
                    </tr>
                    </td>
                    <tr>
                        <td>
                    </tr>
                    </td>

                </form>
            </table>
        </div><!--End of col-->
    </div><!--End of roe-->
</div>
</body>
</html>
