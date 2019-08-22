<%--
  Created by IntelliJ IDEA.
  User: peter
  Date: 2019-08-21
  Time: 11:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="partials/navbar.jsp"></jsp:include>
<%
    if (request.getMethod().equalsIgnoreCase("post")){

    if(request.getParameter("username").equals("admin") && request.getParameter("password").equals("password")) {
    response.sendRedirect("/profile.jsp");
    }
}%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="" method="post" name="login-form">
    Username<br>
    <input type="text" name="username">
    <br>
    Password <br>
    <input type="password" name="password">
    <br>
    <input type="submit" name="submit">

    <p>
        ${param.username}

    </p>
    <p>
        ${param.password}
    </p>
</form>




</body>
</html>