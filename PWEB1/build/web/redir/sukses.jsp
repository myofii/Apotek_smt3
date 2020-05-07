<%-- 
    Document   : sukses
    Created on : Nov 14, 2019, 9:49:53 PM
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
            String name = (String)session.getAttribute("user");
            if(name!=null){
                out.println("<h1>Hello "+name+"</h1>");
                out.println("<p>Id "+session.getId()+"</p>");
                out.println("<p>Waktu "+session.getCreationTime()+"</p>");
                out.println("<p>Waktu terakhir "+session.getLastAccessedTime()+"</p>");
                out.println("<p>Hash Code "+session.hashCode()+"</p>");
                out.println("<p>Apakah Baru "+session.isNew()+"</p>");
                out.println("<a href=logout.jsp>Logout</a>");
            }
        %>
    </body>
</html>
