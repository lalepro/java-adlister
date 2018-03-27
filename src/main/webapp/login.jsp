<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%! int counter = 0; %>
<% counter += 1; %>

<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    if(username == null || password == null){
        username = " ";
    }
    if (username.toLowerCase().trim().equals("admin") && password.toLowerCase().trim().equals("password")){
        response.sendRedirect("/profile.jsp");
    }
%>

<html>
<head>
    <title><%="Login"%></title>
    <jsp:include page="partials/head.jsp"/>
</head>
<body style="background-color: rgba(244,244,244,0.25)" class="container">
<div style="color: #8c8c8c">

</div>

<jsp:include page="partials/navbar.jsp" />

<p>
    <a class="btn btn-primary" data-toggle="collapse" href="#collapseExample" role="button" aria-expanded="false" aria-controls="collapseExample">
        Login
    </a>
    <%--<button class="btn btn-primary" type="button" data-toggle="collapse" data-target="#collapseExample" aria-expanded="false" aria-controls="collapseExample">--%>
        <%--Button with data-target--%>
    <%--</button>--%>
</p>
<div class="collapse" id="collapseExample">
    <div class="card card-body">
        <form method="post" action="/login.jsp">
            <table>
                <tr>
                    <td> Username: </td><td> <input name="username" size=15 type="text" placeholder="username" /> </td>
                </tr>
                <tr>
                    <td> Password: </td><td> <input name="password" size=15 type="text" placeholder="password" /> </td>
                </tr>
            </table>
            <input type="submit" value="Login" />
        </form>

    </div>
</div>





<h6>Visitors: <%= counter%></h6>
<jsp:include page="partials/foot.jsp"/>
</body>
</html>

<%--https://stackoverflow.com/questions/18214670/create-a-simple-login-page-using-jsp-and-session--%>
<%--https://www.codemiles.com/jsp-examples/login-using-jsp-t3417.html--%>
<%--https://stormpath.com/blog/java-webapp-instant-user-management--%>