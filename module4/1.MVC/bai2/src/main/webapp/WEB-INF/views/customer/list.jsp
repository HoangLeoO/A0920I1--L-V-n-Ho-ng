<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/14/2021
  Time: 11:20 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Customer</title>
</head>
<body>
<h3>List Customer</h3>
<p><a href="/create">Add New Customer</a></p>
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Age</th>
        <th>Action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="cus" items="${customers}">
        <tr>
            <td><c:out value="${cus.id}"></c:out></td>
            <td><c:out value="${cus.name}"></c:out></td>
            <td><c:out value="${cus.age}"></c:out> </td>
            <td>
                <a href="/delete/<c:out value='${cus.id}'/>">Delete</a> |
                <a href="#">Edit</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
