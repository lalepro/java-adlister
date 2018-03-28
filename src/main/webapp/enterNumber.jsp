<%--
  Created by IntelliJ IDEA.
  User: lalepro
  Date: 3/28/18
  Time: 10:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Enter Number</title>
</head>
<body>

<form action="/guess" method="post">
    <div class="form-group">
        <label for="usernumber">Enter A Number between 1 and 100</label>
        <input id="usernumber" name="usernumber" class="form-control" type="text">
    </div>
</form>

</body>
</html>
