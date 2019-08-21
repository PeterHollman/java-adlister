<%--
  Created by IntelliJ IDEA.
  User: peter
  Date: 2019-08-21
  Time: 11:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="" name="login-form">
    Username<br>
    <input type="text" name="username" id="username">
    <br>
    Password <br>
    <input type="text" name="password">
    <br>
    <input type="submit" name="submit">

    <p>
<% request.getParameter("username");%>

    </p>
    <p>
<% request.getParameter("password");%>

    </p>
</form>
</body>
</html>
