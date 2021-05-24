<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/24/2021
  Time: 10:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add New Customer</title>
</head>
<body>
<h1>Add Customer</h1>
<form action="/create" method="post">
    <label>STT</label>
    <input type="text" name="id">
    <label>Ten</label>
    <input type="text" name="name">
    <label>Dia Chi</label>
    <input type="text" name="address">
    <label>Tuoi</label>
    <input type="text" name="age">
    <button>Submit</button>

</form>
</body>
</html>
