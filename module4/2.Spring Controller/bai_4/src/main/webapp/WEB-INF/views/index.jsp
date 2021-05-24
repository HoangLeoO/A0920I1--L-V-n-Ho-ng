<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Sand Wich Condiments</h1>
<form action="/sandwich" method="post">
    <input type="checkbox" name="condiment" value="lettuce">
    <input type="checkbox" name="condiment" value="tomato">
    <input type="checkbox" name="condiment" value="mustard">
    <input type="checkbox" name="condiment" value="sprouts">
    <button type="submit">Submit</button>
</form>
</body>
</html>