<%--
  Created by IntelliJ IDEA.
  User: alaniz
  Date: 7/25/23
  Time: 3:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <jsp:include page="/WEB-INF/partials/head.jsp">
    <jsp:param name="title" value="Register" />
  </jsp:include>
</head>
<body>
<header>
  <jsp:include page="/WEB-INF/partials/navbar.jsp" />
</header>
<main>
  <div class="container">
    <h1>Please Register</h1>
    <form action="/register" method="POST">
      <div class="form-group">
        <label for="username">Username</label>
        <input id="username" name="username" class="form-control" type="text">
      </div>
      <div class="form-group">
        <label for="email">Username</label>
        <input id="email" name="email" class="form-control" type="email">
      </div>
      <div class="form-group">
        <label for="password">Password</label>
        <input id="password" name="password" class="form-control" type="password">
      </div>
      <input type="submit" class="btn btn-primary btn-block" value="Register">
    </form>
  </div>

</main>
</body>
</html>
