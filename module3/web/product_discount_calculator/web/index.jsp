<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 3/26/2021
  Time: 7:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
  </head>
  <body>
  <form  action="test" method="get">
    <label>Product Description</label><br>
    <input type="text" name="PD" ><br>
    <label>List Price</label><br>
    <input type="text" name="LP" ><br>
    <label>Discount Percent</label><br>
    <input type="number" name="DP" ><br>
    <input type="submit" id="submit" value="CalculateDiscount">
  </form>
  </body>
</html>
