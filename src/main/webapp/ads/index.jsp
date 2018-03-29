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


<input type="button" value="Log Out" onclick="window.location='/login'" >

<table class="table">
    <thead>
    <tr>
        <th>ID</th>
        <th>User Id</th>
        <th>Title</th>
        <th>Description</th>
    </tr>
    </thead>
    <tbody>
        <c:forEach var="ad" items="${ads}">
            <tr>
                <th scope="row">${ad.id} </th>
                <td>${ad.userId}</td>
                <td>${ad.title}</td>
                <td>${ad.description}</td>
                <td>
                    <form action="/ads/show" method="get">
                        <input type="hidden" value="${ad.id}" name="adButton">
                        <button  type="submit" >View</button>
                    </form>
                    <%--<a href="/show" >${ads.id}</a>--%>
                </td>
            </tr>
        </c:forEach>
    </tbody>
</table>
    </div>

<jsp:include page="../partials/foot.jsp" />
</body>
</html>



