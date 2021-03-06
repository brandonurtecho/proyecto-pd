<%-- 
    Document   : customer-form
    Created on : 02-abr-2019, 16:32:22
    Author     : LaboratorioFISI
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
        <meta name="viewport" content="width=device-width, minimum-scale=1.0, maximum-scale=1.0" />
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

        <title>Panamericanos Lima 2019</title>

    </head>
    <body style="background: url(https://fondos.io/wp-content/uploads/2019/01/fondo-blanco-42.jpg) no-repeat; background-size: cover;">

        <nav class="navbar navbar-expand-lg navbar-dark bg-dark d-flex justify-content-around">
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
                    aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <h5 class="mx-2 my-0 text-white mr-md-auto font-weight-normal">Panamericanos Lima 2019</h5>

            <form class="form-row" action="/proyecto/principal/inicial" method="post">

                <div class="collapse navbar-collapse" id="navbarSupportedContent">

                    <ul class="navbar-nav">
                        <li class="nav-item">
                            <label class=" px-md-3 py-1 text-white" for="inputUser">Usuario </label>
                        </li>
                        <li>
                            <input type="text" id="inputUser" class="form-control" name="iduser">
                        </li>
                        <li>
                            <label class=" px-md-3 py-1 text-white" for="inputPassword">Contraseña </label>
                        </li>
                        <li>
                            <input type="password" id="inputPassword" class="form-control" name="password">
                        </li>
                        <div class="d-xl-none d-lg-none d-xl-block my-2"></div>
                        <li>
                            <button type="submit" class="btn btn-primary mt-md-auto ml-5" value="Send">Iniciar Sesión</button>
                        </li>

                    </ul>
                </div>

            </form>
        </nav>

        <div>

            <div class="container py-5">
                <div class="row py-2" >
                    <div class="col-md-4 text-center d-none d-sm-block">
                        <img src="/proyecto/assets/img/Logo_oficial_Juegos_Panamericanos_Lima_2019.png" class="img-responsive" alt="Panamericanos">
                    </div>
                    <div class="col-md-6 order-md-1">
                        <h4 style="font-size: 35px;" class="mb-3 py-3 text-center">REGISTRO</h4>
                        <form class="form" action="/proyecto/principal/index" method="post">
                            <div class="row font-italic">
                                <div class="col-md-6 mb-3">
                                    <label for="firstName"><strong>Nombres</strong></label>
                                    <input type="text" class="form-control" id="firstName" name="nombre">
                                </div>

                                <div class="col-md-6 mb-3">
                                    <label for="lastName"><strong>Apellidos</strong></label>
                                    <input type="text" class="form-control" id="lastName" name="apellido">
                                </div>
                            </div>
                            <div class="mb-3 font-italic">
                                <label for="email"><strong>Email</strong></label>
                                <div class="input-group">
                                    <input type="text" class="form-control" id="email" name="email">
                                </div>
                            </div>
                            <div class="mb-3 font-italic">
                                <label for="password"><strong>Contraseña</strong></label>
                                <div class="input-group">
                                    <input type="password" class="form-control" id="password" name="password">
                                </div>
                            </div>
                            <div class="row font-italic">
                                <div class="col-md-6 mb-3">
                                    <label for="birthdate"><strong>Fecha de Nacimiento</strong></label>
                                    <input type="date" class="form-control" id="birthdate" name="date">
                                </div>

                                <div class="col-md-6 mb-3">
                                    <label for="genero"><strong>Género</strong></label>
                                    <select class="custom-select" id="genero" name="genero">
                                        <option value="M">Masculino</option>
                                        <option value="F">Femenino</option>
                                    </select>

                                </div>
                            </div>
                            <button class="btn btn-primary btn-lg btn-block" type="submit" ><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">REGISTRARSE</font></font></button>

                        </form>
                    </div>
                </div>
            </div>

        </div>



    </body>
</html>
