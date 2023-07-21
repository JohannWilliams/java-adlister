<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="../partials/head.jsp">
        <jsp:param name="title" value="View Ads" />
    </jsp:include>
</head>
<body>
<jsp:include page="../partials/navbar.jsp" />
<h1>Here are all the Ads:</h1>

<c:forEach var="ad" items="${ads}">
    <div class="product">
        <h2>${ad.name}</h2>
        <p> ${ad.price}</p>
    </div>
</c:forEach>

</body>
</html>
