<%-- 
    Document   : disciplinas
    Created on : 13-jun-2019, 17:34:54
    Author     : LaboratorioFISI
--%>

<%@page import="com.unmsm.patrones.util.Cast"%>
<%@page import="com.unmsm.patrones.util.iterator.CustomIterator"%>
<%@page import="com.unmsm.patrones.dto.Commentary"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, minimum-scale=1.0, maximum-scale=1.0" />
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

        <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">

        <title>Comentarios</title>
    </head>
    <body style="overflow-x: hidden;">

        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
                    aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <form action="/proyecto/principal/inicial" method="POST">
                            <input style="font-size: 20px; outline: 0px; background-color: rgba(255,0,0,0.0); color: white; border: 0;" type="submit" name="fromSportman" value="Inicio"/>
                        </form>
                    </li>
                    <li class="nav-item">
                        <a class="p-2 text-white" href="/proyecto/principal/eventos" style="font-size: 20px; text-decoration: none;">Eventos</a>
                    </li>
                    <li class="nav-item">
                        <a class="p-2 text-white" href="/proyecto/principal/voluntarios" style="font-size: 20px; text-decoration: none;">Voluntarios</a>
                    </li>
                    <li class="nav-item mr-2">
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

        <div style="background-size: cover; background-image: url(http://www.cherishpr.com/wp-content/uploads/2013/03/Colorful-Wallpaper-High-Definition-Images-4098-Awesome.jpg);">
            <div class="container py-5">

                <div class="jumbotron p-2 p-md-5 text-white rounded bg-dark" style="background-image: url(${imgsport}); background-size: 100%;">
                    <div class="col-md-6 px-0 py-5">
                        <h1 class="display-4 font-italic" style="font-weight: 600; font-size: 40px;">Somos el corazón del movimiento olímpico en América</h1>
                        <p class="lead my-3"></p>Se parte de las ceremonias de Lima 2019 y vive una experienicia increible. A partir de
                        este 26 de Julio hasta el 11 de Agosto, donde participaran deportistas de los 41 paises de America en 39
                        deportes.</p>
                        <p class="lead mb-0"><span class="text-white font-weight-bold">Te esperamos...</span></p>
                    </div>
                </div>

                <div class="album py-5 bg-light">
                    <div class="container">

                        <div class="row">

                            <c:forEach items="${sportmanlist}" var="sportman">

                                <div class="col-md-4">
                                    <div class="card mb-4 shadow-sm">
                                        <img src="${sportman.photo}" alt="" class="img-fluid">

                                        <div class="card-body">
                                            <p class="card-text">El deportista <c:out value="${sportman.name}"/> <c:out value="${sportman.lastname}"/> es proveniente de 
                                                <c:out value="${sportman.country}"/>, actualmente cuenta con <c:out value="${sportman.age}"/> años de edad</p>
                                            <div class="d-flex justify-content-between align-items-center">
                                                <small class="text-muted">15 min</small>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </c:forEach>


                        </div>
                    </div>
                </div>

                <div>
                    <div>
                        <c:if test="${it!=null}">  
                            <div class="comments-container">
                                <ul id="comments-list" class="comments-list">
                                    <c:forEach var="i" begin="1" end="${it.size()}">
                                        <c:set var="c" value="${it.next()}" />                                        
                                        <li class="d-flex justify-content-between">
                                            <div class="comment-main-level">
                                                <!-- Avatar -->
                                                <div class="comment-avatar d-none d-sm-block mr-3"><img src="https://cdn5.dibujos.net/dibujos/pintar/chico-con-perilla_163.png" alt=""></div>
                                                <!-- Contenedor del Comentario -->
                                                <div class="comment-box">
                                                    <div class="comment-head">
                                                        <h6 class="comment-name by-author">${c.nameUser} ${c.lastNameUser}</h6>
                                                        <span>${cast.dateToString(c.getDate())}</span>
                                                        <i>${c.like} likes</i>
                                                        <form action="/proyecto/principal/deportistas" method="POST" >
                                                            <input class="like" name="like" type="submit" value="        "/>    
                                                            <p style="display : inline-block; font-size: 15px; color: #fff"  class="card-text" > ${c.getLike()}</p>
                                                            <input type="hidden" name="likecomment" value="${c}">
                                                            <input type="hidden" name="Sport" value="${sport}">
                                                        </form>

                                                    </div>
                                                    <div class="comment-content">
                                                        ${c.body}
                                                    </div>
                                                </div>
                                            </div>
                                        </li>
                                    </c:forEach>
                                </ul>
                            </div>
                        </c:if>    
                        <div>
                            <div class="card border-info mb-3 mx-auto" style="width: 100%;">
                                <div class="card-header">Deja tu mensaje</div>
                                <div class="card-body text-info">
                                    <h5 class="card-title">Porque tu opinión nos importa</h5>
                                    <form action="/proyecto/principal/deportistas" method="POST">
                                        <input type="hidden" name="Sport" value="${sport}">
                                        <span class="text">
                                            <textarea id="comment" name="comment" class="form-control" placeholder="Escribe tu comentario..." data-value="game-1708"></textarea><br>
                                        </span>
                                        <span class="date"> 
                                            <div id="spiner-comment" style="display: none;">
                                                <div class="comments__spinner"></div>
                                            </div>
                                            <div class="text-right px-3 py-1" >

                                                <input type="submit" class="btn btn-primary" value="Enviar comentario" name="commentary">
                                            </div>
                                        </span>
                                    </form>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>
            </div>

        </div>


    </body>
</html>