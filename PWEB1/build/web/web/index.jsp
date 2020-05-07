<%-- 
    Document   : index
    Created on : Nov 17, 2019, 4:43:28 PM
    Author     : M. Yofi Indrawan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>   
<%@include file="header.jsp" %>

<%
    if (login!=null) {%>
    <center>
        <h1>Selamat Datang di Sistem Penjualan Apotek</h1>
        <img class="img-fluid" src="../template/wall.jpg">
    </center>
        <%} else {
%>
<center>
    <div class="w-75 p-3">
        <h1>Selamat Datang di Sistem Penjualan Apotek</h1>
        <div class="container alert alert-danger alert-dismissible fade show" role="alert">
            Silahkan Login
            untuk mengakses!!<br/>
        </div>
    </div>
    <img class="img-fluid" src="../template/wall.jpg">
</center>
<%}%>
<%@include file="footer.html" %>
