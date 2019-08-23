
<%--
  Created by IntelliJ IDEA.
  User: peter
  Date: 2019-08-22
  Time: 15:03
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

    <h1>Here are all the ads</h1>
    <c:forEach var = "ad" items="${ads}">
        <div class = "ad"></div>
            <h2>${ad.title}</h2>
            <p>${ad.description}</p>
    </c:forEach>

</body>
</html>
