<%-- 
    Document   : principal-user
    Created on : 13-jun-2019, 17:19:56
    Author     : LaboratorioFISI
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, minimum-scale=1.0, maximum-scale=1.0" />
        <title>Panamericanos Lima 2019</title>

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

        <link rel="stylesheet" href="/proyecto/assets/css/vistaprincipal.css">

        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
                    aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <div class="d-xl-none d-lg-none d-xl-block my-2"></div>
                    <li class="nav-item active">
                        <a class="p-2 text-white" href="/proyecto/principal/voluntarios" style="font-size: 20px;">Voluntarios</a>
                    </li>
                    <li class="nav-item">
                        <a class="p-2 text-white" href="/proyecto/principal/eventos" style="font-size: 20px;">Eventos</a>
                    </li>
                    <li class="nav-item">
                        <a class="p-2 text-white" href="/proyecto/principal" style="font-size: 20px;">Cerrar sesión</a>
                    </li>                   
                    <div class="d-xl-none d-lg-none d-xl-block my-2"></div>
                </ul>
                <li class="text-white font-weight-normal" style="font-size: 20px;">Panamericanos Lima 2019</li>
            </div>
        </nav>

        <section class="deportes" id="deportes">
            <div class="row relative">
                <div class="center-absolute mt-3">
                    <div class="title-disciplines">
                        DEPORTES Y DISCIPLINAS
                    </div>
                </div>
                <div class="section section-blue col-xl-6">
                    <div class="section-bg-image"></div>
                    <!--<div class="points points-white"></div>-->
                    <div class="section-content text-center">
                        <img src="/proyecto/assets/img/logo-panamericanos.png" class="img-responsive">
                        <div class="title title-white d-flex justify-content-center">
                            <form action="/proyecto/principal/disciplinas" method="POST">
                                <input class="title-text transparent-input" type="submit" name="panamericanos" value="Panamericanos"/>
                            </form>
                        </div>
                        <p>Anima a los 6680 atletas de 41 naciones diferentes y no te pierdas ninguno <br> de los 39 deportes - 61 disciplinas - del 26 de julio al 11 de agosto</p>
                    </div>
                </div>
                <div class="section section-purple col-xl-6">
                    <div class="section-bg-image"></div>
                    <!--<div class="points points-white"></div>-->
                    <div class="section-content text-center">
                        <img src="/proyecto/assets/img/logo-parapanamericanos.png" class="img-responsive">
                        <div class="title title-white d-flex justify-content-center">
                            <form action="/proyecto/principal/disciplinas" method="POST">
                                <input class="title-text transparent-input" type="submit" name="parapanamericanos" value="Parapanamericanos"/>
                            </form>
                        </div>
                        <p>Alienta a los 1890 Para atletas y asómbrate con los 17 Para deportes <br> 18 disciplinas - del 23 de agosto al 01 de septiembre</p>
                    </div>          
                </div>
            </div>
        </section>
    </body>
</html>
