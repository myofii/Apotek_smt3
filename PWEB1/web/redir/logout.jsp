<%-- 
    Document   : logout
    Created on : Nov 14, 2019, 9:52:28 PM
    Author     : Winnie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            session.invalidate();
            response.sendRedirect("index.html");
        %>
    </body>
</html>
