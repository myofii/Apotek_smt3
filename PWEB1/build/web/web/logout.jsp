<%-- 
    Document   : logout
    Created on : Nov 19, 2019, 7:42:11 PM
    Author     : M. Yofi Indrawan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
<%
    session.invalidate();
    response.sendRedirect("/PWEB1/web/index.jsp");
%>
    </body>
</html>
