<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/14/2021
  Time: 12:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create</title>
</head>
<body>
<h3>Add Customer</h3>
<form action="/create" method="post">
    <p>ID : <input type="number" name="id"></p>
    <p>Name: <input type="text" name="name"></p>
    <p>Age: <input type="text" name="age"></p>
    <input type="submit" value="Create">
</form>
</body>
</html>
