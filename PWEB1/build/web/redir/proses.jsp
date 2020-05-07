<%-- 
    Document   : proses
    Created on : Nov 14, 2019, 9:46:10 PM
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
            String nama = request.getParameter("nama");
            session.setAttribute("user", nama);
            out.println(session.getAttributeNames());
            response.sendRedirect("sukses.jsp");
        %>
    </body>
</html>
