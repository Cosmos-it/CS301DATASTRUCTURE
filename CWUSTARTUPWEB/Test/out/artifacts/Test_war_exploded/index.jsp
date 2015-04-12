<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 3/4/15
  Time: 12:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login page</title>
    <link href="css/paper-bootstrap.min.css" rel="stylesheet"/>
    <link href="css/centering.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <form class="form-signin" action="LoginCheck.jsp" method="post">
        <h2 class="form-signin-heading">Please sign in</h2>
        <label class="sr-only">Username</label>
        <br/>
        <input class="form-control" type="text" name="username" placeholder="user name"/>

        <div class="form-group">
            <br/>Password:<input class="form-control" type="password" name="password">
        </div>

        <button type="submit" class="btn btn-lg btn-primary btn-block">Sign in</button>
    </form>
</div>
</div>

</body>
</html>
