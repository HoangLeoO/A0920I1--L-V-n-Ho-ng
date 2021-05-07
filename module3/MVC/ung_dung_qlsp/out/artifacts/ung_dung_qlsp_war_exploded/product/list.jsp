<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 4/13/2021
  Time: 1:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Product</title>
</head>
<body>
<a href="create">Create New Product</a>
<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Number</th>
        <th>Type</th>
        <th>Price</th>
    </tr>
    <c:forEach items="${products}" var="product">
        <tr>
            <td>${product.id}</td>
            <td>${product.nameProduct}</td>
            <td>${product.numberProduct}</td>
            <td>${product.typeProduct}</td>
            <td>${product.price}</td>
            <td><a href="delete?id=${product.id}">Delete</a></td>
            <td><a href="edit">Edit</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
