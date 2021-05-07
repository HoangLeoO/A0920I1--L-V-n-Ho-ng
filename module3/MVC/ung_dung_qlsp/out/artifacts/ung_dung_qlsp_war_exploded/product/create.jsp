<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 4/13/2021
  Time: 1:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core_1_1" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Product</title>
</head>
<body>
<h1>Create Product</h1>
<form action="create" method="post">
    <table>
        <tr>
            <td>ID :</td>
            <td><input type="number" name="id"></td>
        </tr>
        <tr>
            <td>Name :</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>Number :</td>
            <td><input type="number" name="number"></td>
        </tr>
        <tr>
            <td>Type :</td>
            <td><input type="text" name="type"></td>
        </tr>
        <tr>
            <td>Price :</td>
            <td><input type="number" name="price"></td>
        </tr>
        <tr>
            <td><button type="submit" >Create Product</button></td>
        </tr>
    </table>
</form>
</body>
</html>
