<%-- 
    Document   : disciplinas
    Created on : 13-jun-2019, 17:34:54
    Author     : LaboratorioFISI
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <link rel="stylesheet" href="/proyecto/assets/css/vistaSportsman.css">

        <!-- BOOTSTRAP -->
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

        
        <title>Juegos Panamericanos 2019</title>
    </head>
    <body>

       <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
                    aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="p-2 text-white" href="/proyecto/principal/voluntarios" style="font-size: 20px;">Voluntarios</a>
                    </li>
                    <li class="nav-item">
                        <a class="p-2 text-white" href="/proyecto/principal/eventos" style="font-size: 20px;">Eventos</a>
                    </li>
                    <li class="nav-item">
                        <a class="p-2 text-white" href="/proyecto/principal/" style="font-size: 20px;">Cerrar sesion</a>
                    </li>
                </ul>
            </div>
        </nav>

        <div style="background-size: cover; background-image: url(http://www.cherishpr.com/wp-content/uploads/2013/03/Colorful-Wallpaper-High-Definition-Images-4098-Awesome.jpg);">
        <div class="container py-5">

            <div class="jumbotron p-2 p-md-5 text-white font-weight-bold rounded bg-dark" style="background-size: cover; background-image: url(https://www.comune.cimadolmo.tv.it/wp-content/uploads/2018/04/giornata-dello-sport-19-aprile-2018.png); background-size: 100%;">
                  <div style="color: #000;" class="col-md-6 px-0 py-5">
                      <h1 class="display-4 font-italic" style="font-weight: 500; font-size: 50px;"><span>Somos el corazón del movimiento olímpico en América</span></h1>
                    <p style="font-weight: 500;" class="lead my-3">Se parte de las ceremonias de Lima 2019 y vive una experiencia increíble. A partir de
                    este 26 de Julio hasta el 11 de Agosto, donde participarán deportistas de los 41 paises de América en 39
                    deportes.</p><br>
                    <p  class="lead mb-0"><span style="color: #000;" class="text-black font-weight-bold">Te esperamos...</span></p>
                </div>
            </div>

            <div class="album py-5 bg-light">
                <div class="container">

                    <div class="row">

                        <c:forEach items="${list}" var="sport">

                            <div class="col-md-4">
                                <div class="card mb-4 shadow-sm">
                                    <img src="${sport.image}" alt="" class="img-fluid">
                                    </svg>
                                    <div class="card-body">
                                        <div align="center" ><h1 style="font-size: 25px;">${sport.title}</h1></div>
                                        <div style="overflow: hidden; height: 150px;" class="content-sport">
                                            <p class="card-text">${sport.overView}</p>
                                        </div>
                                        <div class="d-flex justify-content-between align-items-center">
                                            <div class="btn-group">
                                                <form method="post" action="/proyecto/principal/deportistas?Sport=<c:out value="${sport.title}"/>">
                                                    <input type="submit" class="btn btn-sm btn-outline-secondary" value="Ver mas">
                                                </form>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                    </div>
                </div>
            </div>

            
        </div>
            
        </div>


    </body>
</html>
