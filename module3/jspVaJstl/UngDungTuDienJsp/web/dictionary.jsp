<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %><%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 3/29/2021
  Time: 12:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple Dictionary</title>
</head>
<body>
<%!
    Map<String,String> dic = new HashMap<>();
%>
<%
    dic.put("hello","xin chao");
    dic.put("how","the nao");
    dic.put("book","quyen sach");
    dic.put("computer","may tinh");

    String search = request.getParameter("search");

    String result = dic.get(search);

    if (result!=null){
        out.println("Word : " + search);
        out.println("Result :" + result);

    }else {
            out.println("Not found");
    }
%>
</body>
</html>
