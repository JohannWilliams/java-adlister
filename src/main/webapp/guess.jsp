<%--
  Created by IntelliJ IDEA.
  User: alaniz
  Date: 7/20/23
  Time: 7:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Guessing Game" />
    </jsp:include>
</head>
<body>
<header>
    <jsp:include page="partials/navbar.jsp" />
</header>
<main>
    <form action="/guess" method="post">
        <h3>Guess a number between 1 and 3!</h3>
        <label for="guess">Guess : </label>
        <input type="text" name="guess" id="guess">

        <hr>

        <input type="submit">
    </form>
</main>
</body>
</html>
