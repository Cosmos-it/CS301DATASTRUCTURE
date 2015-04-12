<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 3/4/15
  Time: 7:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<html>
    <% String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ((username.equals("taban") && password.equals("cosmos"))) {

            session.setAttribute("username", username);
            response.sendRedirect("Home.jsp");
        } else response.sendRedirect("Error.jsp");
    %>
</html>

