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
        <!-- Bootstrap core CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
              integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

        <title>Panamericanos 2019</title>
        
    </head>
    <body>

        <div class="d-flex flex-column flex-md-row align-items-center p-2 px-md-3 mb-2 bg-white border-bottom shadow-sm">
            <h5 class="my-0 mr-md-auto font-weight-normal">Panamericanos 2019</h5>
            <nav class="my-1 my-md-0 mr-md-3">
                <form class="form-row" action="/proyecto/principal/inicial" method="post">
                    <div class="col-md-4">
                        <label for="inputUser">Usuario :</label>
                        <input type="text" id="inputUser" class="form-control" name="iduser">
                    </div>
                    <div class="col-md-4">
                        <label for="inputPassword">Contraseña :</label>
                        <input type="text" id="inputPassword" class="form-control" name="password">
                    </div>
                    <button type="submit" class="btn btn-primary mt-md-auto ml-5" value="Send">Iniciar Session</button>
                </form>
            </nav>
        </div>


        <div class="container py-5">
            <div class="row py-2">
                <div class="col-md-4 text-center">
                    <img src="assets/img/Logo_oficial_Juegos_Panamericanos_Lima_2019.png" class="img-responsive" alt="">
                </div>
                <div class="col-md-6 order-md-1">
                    <h4 class="mb-3 text-center">REGISTRARSE</h4>
                    <form class="form" action="/proyecto/principal/index" method="post">
                        <div class="row">
                            <div class="col-md-6 mb-3">
                                <label for="firstName">Nombres</label>
                                <input type="text" class="form-control" id="firstName" name="nombre">
                            </div>

                            <div class="col-md-6 mb-3">
                                <label for="lastName">Apellidos</label>
                                <input type="text" class="form-control" id="lastName" name="apellido">
                            </div>
                        </div>
                        <div class="mb-3">
                            <label for="email">Email</label>
                            <div class="input-group">
                                <input type="text" class="form-control" id="email" name="email">
                            </div>
                        </div>
                        <div class="mb-3">
                            <label for="password">Password</label>
                            <div class="input-group">
                                <input type="password" class="form-control" id="password" name="password">
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6 mb-3">
                                <label for="birthdate">Fecha de Nacimiento</label>
                                <input type="date" class="form-control" id="birthdate" name="date">
                            </div>

                            <div class="col-md-6 mb-3">
                                <label for="genero">Genero</label>
                                <select class="custom-select" id="genero" name="genero">
                                    <option value="M">Masculino</option>
                                    <option value="F">Femenino</option>
                                </select>

                            </div>
                        </div>
                        <button class="btn btn-primary btn-lg btn-block" type="submit" ><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Realizar compra</font></font></button>
                    </form>
                </div>
            </div>
        </div>
    </div>

</body>
</html>
