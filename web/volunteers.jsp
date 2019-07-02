<%-- 
    Document   : voluntary
    Created on : 18-jun-2019, 15:08:11
    Author     : LaboratorioFISI
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Voluntarios</title>
        
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
                        <a class="p-2 text-white" href="/proyecto/principal/eventos">Eventos</a>
                    </li>
                    <li class="nav-item">
                        <a class="p-2 text-white" href="/proyecto/principal/disciplinas?num=0">Disciplinas Panamericanas</a>
                    </li>
                    <li class="nav-item">
                        <a class="p-2 text-white" href="/proyecto/principal/disciplinas?num=1">Disciplinas Parapanamericanas</a>
                    </li>
                     <li class="nav-item active">
                        <a class="p-2 text-white" href="/proyecto/principal/">Cerrar Sesion</a>
                    </li>
                </ul>
            </div>
        </nav>

        <div class="container py-5">

            <div class="jumbotron p-2 p-md-5 text-white rounded bg-dark" style="background-image: url(https://cdn.futbolperuano.com/sdi/2018/09/11/lanzan-programa-de-voluntariado-para-los-juegos-panamericanos-2019-670374.jpg); background-size: 100%;">
                <div class="col-md-6 px-0 py-5">
                    <h1 class="display-4 font-italic">Se Voluntario Lima 2019 </h1>
                    <p class="lead my-3">Seran mas de 19 000 voluntarios para los juegos panamericanos y parapanamericanos</p>
                    <p class="lead mb-0"><span class="text-white font-weight-bold">Te esperamos...</span></p>
                </div>
            </div>

            <div class="album py-5 bg-light">
                <div class="container">

                    <div class="row">

                        <c:forEach items="${list}" var="volunteer">

                            <div class="col-md-4">
                                <div class="card mb-4 shadow-sm">
                                    <img src="${volunteer.photo}" alt="" class="img-fluid">
                                    </svg>
                                    <div class="card-body">
                                        <p class="card-text">El voluntario <c:out value="${volunteer.name}"/> <c:out value="${volunteer.lastname}"/> es <c:out value="${volunteer.job}"/> 
                                        y se encuentra laborando en <c:out value="${volunteer.place}"/> </p>
                                    </div>
                                </div>
                            </div>

                        </c:forEach>
                    </div>
                </div>
            </div>

            
        </div>


    </body>
</html>
