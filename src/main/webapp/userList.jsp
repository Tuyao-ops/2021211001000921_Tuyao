<%@ page import="java.sql.ResultSet" %><%--
  Created by IntelliJ IDEA.
  User: Hail
  Date: 2023/4/4
  Time: 19:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<h1>User List</h1>
<table border="1">
    <tr>
        <td>Username</td><td>password</td><td>Email</td><td>Gender</td><td>Birthday</td>
    </tr>
    <%
        ResultSet rs = (ResultSet) request.getAttribute("rsname");
        if (rs==null){
    %>
    <tr>
        <td>No data!!! </td>
    </tr>
    <%}else {


    }%>
</table>
<%@include file="footer.jsp"%>
