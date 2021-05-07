<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 4/13/2021
  Time: 3:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit</title>
</head>
<body>
<h1>Edit Product</h1>
<p>
    <a href="list" >Back to Product list</a>
</p>
<form  method="post">
    <table>
        <tr>
            <td>Id :</td>
            <td><input type="number" id="id" name="id" value="${requestScope["products"].getId}"></td>
        </tr>
        <tr>
            <td>Name :</td>
            <td><input type="text" id="name" name="name" value="${requestScope["products"].getNameProduct}"></td>
        </tr>
        <tr>
            <td>Number :</td>
            <td><input type="number" id="number" name="number" value="${requestScope["products"].getNumberProduct}"></td>
        </tr>
        <tr>
            <td>Type :</td>
            <td><input type="text" id="type" name="type" value="${requestScope["products"].getTypeProduct}"></td>
        </tr>
        <tr>
            <td>Price :</td>
            <td><input type="number" id="price" name="price" value="${requestScope["products"].getPrice}"></td>
        </tr>
    </table>
</form>
</body>
</html>
