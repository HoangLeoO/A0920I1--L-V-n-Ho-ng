<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/7/2021
  Time: 8:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Hello</h1>
<h2>${text}</h2>
<form action="/login" method="post">
    <input type="text" name="username">
    <input type="submit" value="Login">
</form>
</body>
</html>
