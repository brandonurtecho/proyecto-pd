<%-- 
    Document   : login
    Created on : 08/06/2019, 10:06:56 AM
    Author     : TASSO-PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width">
        <title>Login Admin</title>       
        <link href="/proyecto/assets/bootstrap/css/main.css" rel="stylesheet"/>
        <link href="/proyecto/assets/bootstrap/css/util.css" rel="stylesheet"/>
        <link href="/proyecto/assets/bootstrap/css/bootstrap.min.css" rel="stylesheet"/>
    </head>
    <body>
        <div class="limiter">
            <div class="container-login100">
                <div class="p-l-85 p-r-85 p-t-55 p-b-55 col-lg-3 col-md-6 col-sm-6 col-xs-12">
                    <form class="login100-form validate-form flex-sb flex-w" method="POST" action="/proyecto/admin/admin/login-admin">
                        <span class="login100-form-title p-b-32">
                            Login Administrador
                        </span>
                        <span class="txt1 p-b-11">
                            Usuario
                        </span>
                        <div class="wrap-input100 validate-input m-b-36" data-validate = "Username is required">
                            <input class="input100" type="text" name="username" >
                            <span class="focus-input100"></span>
                        </div>
                        <span class="txt1 p-b-11">
                            Contraseña
                        </span>
                        <div class="wrap-input100 validate-input m-b-12" data-validate = "Password is required">
                            <span class="btn-show-pass">
                                <i class="fa fa-eye"></i>
                            </span>
                            <input class="input100" type="password" name="password" >
                            <span class="focus-input100"></span>
                        </div>
                        <div class="container-login100-form-btn">
                            <input type="submit" class="btn btn-outline-dark" value="Ingresar"/>
                        </div>
                    </form>                 
                </div>
                <div class="small-msg">
                    <small>Todos los derechos reservados - Lima 2019</small>
                </div>
            </div>
        </div>
        <div id="dropDownSelect1"></div>
    </body>
</html>
