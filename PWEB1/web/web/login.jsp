<%-- 
    Document   : login
    Created on : Nov 17, 2019, 5:23:22 PM
    Author     : M. Yofi Indrawan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="header.jsp" %>
<div class="container py-4" align="center">
    <h2 class="h2">Login Form</h2>
</div>
<div class="container py-5" align="center">
    <form action="../olahLogin" method="post">
        <div class="form-group w-25">
            <label for="username">Username</label>
            <input type="text" class="form-control" name="user" id="username" aria-describedby="username" placeholder="Enter username">
        </div>
        <div class="form-group w-25">
            <label for="password">Password</label>
            <input type="password" class="form-control" name="pwd" id="password" placeholder="Password">
        </div>
        <button type="submit" class="btn btn-primary">Log in</button>
    </form>
</div>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<%@include file="footer.html" %>
