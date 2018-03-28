<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="../partials/head.jsp">
        <jsp:param name="title" value="Welcome to my site!" />
    </jsp:include>
</head>
<body>
    <jsp:include page="../partials/navbar.jsp" />
    <div class="container">
        <h1>Welcome to the Adlister!</h1>
<table>
    <tr>
        <th>id</th>
        <th>userID</th>
        <th>title</th>
        <th>description</th>

    </tr>
        <c:forEach var="ad" items="${ads}">
            <tr>
                <td>${ad.id}</td>
                <td>${ad.userId}</td>
                <td>${title}</td>
                <td>${description}</td>
            </tr>
        </c:forEach>
</table>
    </div>
</body>
</html>
