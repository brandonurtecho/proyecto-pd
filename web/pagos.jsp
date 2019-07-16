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
        <meta name="viewport" content="width=device-width, minimum-scale=1.0, maximum-scale=1.0" /> 
        <title>Pagos</title>       
        <!-- Bootstrap core CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
              integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
                integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
                integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
                integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>   
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
                        <a class="p-2 text-white" href="/proyecto/principal/voluntarios" style="font-size: 20px; text-decoration: none;">Voluntarios</a>
                    </li>
                    <li class="nav-item">
                        <form action="/proyecto/principal/disciplinas" method="POST">
                            <input style="font-size: 20px; outline: 0px; background-color: rgba(255,0,0,0.0); color: white; border: 0;" type="submit" name="panamericanos" value="Panamericanos"/>
                        </form>
                    </li>
                    <li class="nav-item">
                        <form action="/proyecto/principal/disciplinas" method="POST">
                            <input style="font-size: 20px; outline: 0px; background-color: rgba(255,0,0,0.0); color: white; border: 0;" type="submit" name="parapanamericanos" value="Parapanamericanos"/>
                        </form>
                    </li>
                    <li class="nav-item active">
                        <a class="p-2 text-white" href="/proyecto/principal/" style="font-size: 20px; text-decoration: none;">Cerrar Sesión</a>
                    </li>
                </ul>
                <li class="text-white font-weight-normal" style="font-size: 20px; list-style: none">Panamericanos Lima 2019</li>
            </div>
        </nav>
        

        <div style="background-size: cover; background-image: url(https://tubikstudio.com/wp-content/uploads/2018/02/illustration-olympic-games-2-1.png);">
        
        <div class="container p-4">
            <div class="py-5 text-center">
                <h2><font style="font-size: 45px; font-weight: 600;"><font style="vertical-align: inherit;">Formulario de pago</font></font></h2>
                
            </div>

            <div class="col-md-8 order-md-1 mx-auto">
                <div class="d-none d-sm-block">
                    <img class="d-block mx-auto mb-4" src="/proyecto/assets/img/milco-6.png" alt="" width="120" height="150">
                </div>
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
                                Por favor ingrese un país válido
                            </div>
                        </div>
                        <div class="col-md-4 mb-3">
                            <input type="text" class="form-control" id="address2" name="state" placeholder="Departamento">
                            <div class="invalid-feedback">
                                Por favor ingrese un departamento válido
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
                                Por favor ingrese una tarjeta válida
                            </div>
                        </div>
                        <div class="col-md-7 mb-3">
                            <input type="email" class="form-control" id="pay" name="paypal" placeholder="Paypal">
                            <div class="invalid-feedback">
                                Por favor ingrese una cuenta válida
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
