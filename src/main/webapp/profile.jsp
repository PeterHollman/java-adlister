<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Your Profile" />
    </jsp:include>
</head>
<body>
    <jsp:include page="partials/navbar.jsp" />

    <%
        String message = null;
        String sessionID = null;
        Cookie[] cookies = request.getCookies();
        if(cookies != null){
            for(Cookie cookie : cookies){
                if(cookie.getName().equals("message")) message = cookie.getValue();
                if(cookie.getName().equals("JSESSIONID")) sessionID = cookie.getValue();
            }
        }
    %>

</body>
</html>
