<%-- 
    Document   : header
    Created on : Nov 17, 2019, 5:11:41 PM
    Author     : M. Yofi Indrawan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

    <head>
        <!-- Bootstrap CSS -->
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="../template/css/bootstrap.min.css">
        <title>Sistem Penjualan Apotek</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-light fixed-top">
            <div class="container">
                <a class="navbar-brand" href="/PWEB1/web/index.jsp">Sistem Penjualan Apotek</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <%role.LoginData login = (role.LoginData) session.getAttribute("loginData");%>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <% if(login==null){%>
                    <ul class="navbar-nav mr-auto">
                        <li class="nav-item disabled">
                            <a class="nav-link disabled" href="/PWEB1/web/gudang.jsp">Gudang</a>
                        </li>
                        <li class="nav-item disabled">
                            <a class="nav-link disabled" href="/PWEB1/web/kasir.jsp">Kasir</a>
                        </li>
                        <li class="nav-item disabled">
                            <a class="nav-link disabled" href="/PWEB1/web/pemilik.jsp">Laporan</a>
                        </li>
                    </ul>
                    <a href="login.jsp"><button class="btn btn-outline-success my-2 my-sm-0">Login</button></a>
                    <%} else {%>
                    <ul class="navbar-nav mr-auto">
                        <li class="nav-item active">
                            <a class="nav-link active" href="/PWEB1/web/gudang.jsp">Gudang</a>
                        </li>
                        <li class="nav-item active">
                            <a class="nav-link active" href="/PWEB1/web/kasir.jsp">Kasir</a>
                        </li>
                        <li class="nav-item active">
                            <a class="nav-link active" href="/PWEB1/web/pemilik.jsp">Laporan</a>
                        </li>
                    </ul>
                    <a href="/PWEB1/web/logout.jsp"><button class="btn btn-outline-success my-2 my-sm-0">Logout</button></a>
                    <%}%>
                </div>
            </div>                    
        </nav>
                <br/>
    <br/>
        <!-- End Header-->