<%-- 
    Document   : pagos-user
    Created on : 15/06/2019, 05:47:34 PM
    Author     : jeanpieralex
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagos</title>
        
         <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
        integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <body>
        

        
         <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
                    aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item">
                        <a class="p-2 text-white" href="/proyecto/principal/voluntarios" style="font-size: 20px;">Voluntarios</a>
                    </li>
                    <li class="nav-item">
                        <a class="p-2 text-white" href="/proyecto/principal/disciplinas?num=0" style="font-size: 20px;">Disciplinas Panamericanas</a>
                    </li>
                    <li class="nav-item">
                        <a class="p-2 text-white" href="/proyecto/principal/disciplinas?num=1" style="font-size: 20px;">Disciplinas Parapanamericanas</a>
                    </li>
                    <li class="nav-item active">
                        <a class="p-2 text-white" href="/proyecto/principal/" style="font-size: 20px;">Cerrar Sesion</a>
                    </li>
                </ul>
            </div>
        </nav>
        

        <div style="background-size: cover; background-image: url(https://tubikstudio.com/wp-content/uploads/2018/02/illustration-olympic-games-2-1.png);">
        
        <div class="container p-4">
            <div class="py-5 text-center">
                <h2><font style="font-size: 45px; font-weight: 600;"><font style="vertical-align: inherit;">Formulario de pago</font></font></h2>
                
            </div>

            <div class="col-md-8 order-md-1 mx-auto">

                <img class="d-block mx-auto mb-4" src="/proyecto/assets/img/milco-6.png" alt="" width="120" height="150">
                <form action="/proyecto/principal/pagos" class="needs-validation" method="post">
                    
                    <h4 class="mb-3"><font style="vertical-align: inherit; font-size: 20px; font-weight: 600;"><font style="vertical-align: inherit;">Datos Personales</font></font></h4>
                    <div class="row">
                        <div class="col-md-6 mb-3">
                            <input type="text" class="form-control" id="firstName" name="firstname" placeholder="Nombre">
                            <div class="invalid-feedback">
                                Campo invalido
                            </div>
                        </div>
                        <div class="col-md-6 mb-3">
                            
                            <input type="text" class="form-control" id="lastName" name="lastname" placeholder="Apellido">
                            <div class="invalid-feedback">
                                Campo invalido
                            </div>
                        </div>
                    </div>

                    <div class="mb-3">
                        
                        <input type="email" class="form-control" id="email" name="email" placeholder="Email">
                        <div class="invalid-feedback">
                            Campo invalido
                        </div>
                    </div>

                    <div class="mb-3">
                        <input type="text" class="form-control" id="address" name="address" placeholder="Dirección">
                        <div class="invalid-feedback">
                            Campo invalido
                        </div>
                    </div>

                    <div class="mb-3">
                        <input type="text" class="form-control" id="address2" name="address2" placeholder="Dirección opcional">
                    </div>

                    <div class="row">
                        <div class="col-md-5 mb-3">
                            <input type="text" class="form-control" id="address2" name="country" placeholder="País">
                            <div class="invalid-feedback">
                                Please select a valid country.
                            </div>
                        </div>
                        <div class="col-md-4 mb-3">
                            <input type="text" class="form-control" id="address2" name="state" placeholder="Estado">
                            <div class="invalid-feedback">
                                Please provide a valid state.
                            </div>
                        </div>
                        <div class="col-md-3 mb-3">
                            <input type="text" class="form-control" id="zip" name="zip" placeholder="Código Postal">
                            <div class="invalid-feedback">
                                Zip code required.
                            </div>
                        </div>
                    </div>

                    <h4 class="mb-3"><font style="vertical-align: inherit; font-size: 20px; font-weight: 600;"><font style="vertical-align: inherit;">Pago</font></font></h4>
                    
                    <div class="row">
                        <div class="col-md-5 mb-3">
                            <input type="text" class="form-control" id="pay" name="creditcard" placeholder="Tarjeta de Crédito">
                            <div class="invalid-feedback">
                                Please select a valid country.
                            </div>
                        </div>
                        <div class="col-md-7 mb-3">
                            <input type="email" class="form-control" id="pay" name="paypal" placeholder="Paypal">
                            <div class="invalid-feedback">
                                Please select a valid country.
                            </div>
                        </div>
                    </div>
                    
                    <input class="btn btn-primary btn-lg btn-block" type="submit" name="payEvent" value="Realizar pago"/>
                </form>
            </div>
        </div>
            
        </div>
    </body>
</html>
