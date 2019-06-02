<%-- 
    Document   : login
    Created on : 01/06/2019, 03:03:32 PM
    Author     : bluq1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>INDEX</title>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        
        <!-- Bootstrap core CSS -->
        <link href="assets/bootstrap/css/bootstrap.min.css" rel="stylesheet"/>
        <!-- Custom styles for this template -->
        <link href="assets/css/floating-labels.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <form class="form-signin">
            <div class="text-center mb-4">
                <img class="mb-4" src="/assets/img/bootstrap-solid.svg" alt="" width="72" height="72">
                <h1 class="h3 mb-3 font-weight-normal">Floating labels</h1>
                <p>Build form controls with floating labels via the <code>:placeholder-shown</code> pseudo-element. <a href="https://caniuse.com/#feat=css-placeholder-shown">Works in latest Chrome, Safari, and Firefox.</a></p>
            </div>

            <div class="form-label-group">
                <input type="email" id="inputEmail" class="form-control" placeholder="Email address" required autofocus>
                <label for="inputEmail">Email address</label>
            </div>

            <div class="form-label-group">
                <input type="password" id="inputPassword" class="form-control" placeholder="Password" required>
                <label for="inputPassword">Password</label>
            </div>

            <div class="checkbox mb-3">
                <label>
                    <input type="checkbox" value="remember-me"> Remember me
                </label>
            </div>
            <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
            <p class="mt-5 mb-3 text-muted text-center">&copy; 2017-2018</p>
        </form>
    </body>
</html>
