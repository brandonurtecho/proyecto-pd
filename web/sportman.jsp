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
                        <a class="p-2 text-white" href="/proyecto/principal/" style="font-size: 20px;">Inicio</a>
                    </li>
                    <li class="nav-item">
                        <a class="p-2 text-white" href="/proyecto/principal/eventos" style="font-size: 20px;">Eventos</a>
                    </li>
                    <li class="nav-item">
                        <a class="p-2 text-white" href="/proyecto/principal/voluntarios" style="font-size: 20px;">Voluntarios</a>
                    </li>
                    <li class="nav-item">
                        <a class="p-2 text-white" href="/proyecto/principal/disciplinas?num=0" style="font-size: 20px;">Disciplinas Panamericanas</a>
                    </li>
                    <li class="nav-item">
                        <a class="p-2 text-white" href="/proyecto/principal/disciplinas?num=1" style="font-size: 20px;">Disciplinas Parapanamericanas</a>
                    </li>
                </ul>
            </div>
        </nav>

        <div style="background-size: cover; background-image: url(http://www.cherishpr.com/wp-content/uploads/2013/03/Colorful-Wallpaper-High-Definition-Images-4098-Awesome.jpg);">
        <div class="container py-5">

            <div class="jumbotron p-2 p-md-5 text-white rounded bg-dark" style="background-image: url(https://img.bekia.es/galeria/96000/96823_estadounidenses-oro.jpg); background-size: 100%;">
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

            <div class="">

                <div id="comments " class="comments">


                    <c:forEach var="i" begin="1" end="${it.size()}">
                        <div id="comment-${i}">
                            <c:set var="c" value="${it.next()}" />
                            <div class="comment px-2 my-2">
                                <div class="media-left">
                                    <img src="https://www.zona-leros.net/storage/image/default.png" alt="" class="img ">
                                </div>
                                <div class="media-body">
                                    <div class="media-content" style=" ">
                                        <span class="media-heading"> <c:out value="${c.getEmailUser()}" /> </span>
                                        <span class="date" style="display: inline;"> •  <c:out value="${cast.dateToString(c.getDate())}" /> </span>
                                        <span class="text">  <c:out value="${c.getBody()}" /> <br>
                                        </span>
                                        <div class="date">
                                            <span class="up">
                                                <span id="upvotes-9393">  <c:out value="${c.getLike()}" /> </span>
                                                <a href="/proyecto/principal/deportistas?like=Like&likecomment=<c:out value="${c}"/>&Sport=<c:out value="${sport}"/>">
                                                    <i class="fa fa-fw fa-chevron-up " id="up-9393"></i>
                                                </a>
                                            </span> 
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </c:forEach>

                    <div class="comment">
                        <div class="media-left">
                            <img src="https://www.zona-leros.net/storage/image/default.png" alt="" class="img">
                        </div>
                        <div class="media-body">
                            <div class="media-content">
                                <form action="/proyecto/principal/deportistas?Sport=<c:out value="${sport}"/>" method="post">
                                    <span class="text">
                                        <textarea id="comment" name="comment" class="form-control" placeholder="Escribe tu comentario..." data-value="game-1708"></textarea>
                                    </span>
                                    <span class="date"> 
                                        <div id="spiner-comment" style="display: none;">
                                            <div class="comments__spinner"></div>
                                        </div>
                                        <div class="text-right px-3 py-1">
                                            <input type="submit" class="btn btn-danger" value="Comentar" name="commentary">
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
