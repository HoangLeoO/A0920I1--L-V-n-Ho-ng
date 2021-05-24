<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/24/2021
  Time: 10:19 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1><a href="/create">List Customer</a></h1>
<table>
    <thead>
    <tr>
        <th>STT</th>
        <th>Ten</th>
        <th>Dia Chi</th>
        <th>Tuoi</th>
        <th>Hanh Dong</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="cus" items="${customer}">
        <tr>
            <td><c:out value="${cus.id}"></c:out></td>
            <td><c:out value="${cus.name}"></c:out></td>
            <td><c:out value="${cus.address}"/></td>
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
