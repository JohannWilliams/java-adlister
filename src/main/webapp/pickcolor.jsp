<%--
  Created by IntelliJ IDEA.
  User: alaniz
  Date: 7/19/23
  Time: 4:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Pick A Color" />
    </jsp:include>
</head>
<body>
<header>
    <jsp:include page="partials/navbar.jsp" />
    <form action="/viewcolor" method="post">
        <label for="color">Favorite Color: </label>
        <input type="text" name="color" id="color">

        <hr>

        <input type="submit">
    </form>
</header>
</body>
</html>
