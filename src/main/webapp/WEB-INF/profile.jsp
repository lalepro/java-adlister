<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Your Profile" />
    </jsp:include>
</head>
<body>
    <jsp:include page="/WEB-INF/partials/navbar.jsp" />

    <div class="container">
        <h1>Welcome, ${sessionScope.user.username}!</h1>
        <h2>Create a Ad</h2>
<%--MADE A BUTTON THAT CONNECTS TO THE CREATE PAGE FROM PROFILE PAGE--%>
        <a href="/ads/create"><button style="padding: 15px; background-color: darkcyan">ADD</button></a>
    </div>

</body>
</html>
