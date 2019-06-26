<%-- 
    Document   : disciplinas
    Created on : 13-jun-2019, 17:34:54
    Author     : LaboratorioFISI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <link rel="stylesheet" href="assets/css/vistaSportsman.css">

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
                        <a class="p-2 text-white" href="#">Inicio</a>
                    </li>
                    <li class="nav-item">
                        <a class="p-2 text-white" href="#">Perfil</a>
                    </li>
                    <li class="nav-item">
                        <a class="p-2 text-white" href="#">Inicio</a>
                    </li>
                </ul>
            </div>
        </nav>

        <div class="container py-5">

            <div class="jumbotron p-2 p-md-5 text-white rounded bg-dark">
                <div class="col-md-6 px-0 py-5">
                    <h1 class="display-4 font-italic">Somos el corazon del movimiento olimplico en America</h1>
                    <p class="lead my-3"></p>Se parte de las ceremonias de Lima 2019 y vive una experienicia increible. A partir de
                    este 26 de Julio hasta el 11 de Agosto, donde participaran deportistas de los 41 paises de America en 39
                    deportes.</p>
                    <p class="lead mb-0"><span class="text-white font-weight-bold">Te esperamos...</span></p>
                </div>
            </div>

            <div class="album py-5 bg-light">
                <div class="container">

                    <div class="row">
                        
                        <div class="col-md-4">
                            <div class="card mb-4 shadow-sm">
                                <img src="assets/img/juegos-panamericanos-lima-2019-este-es-el-cos-889204-453724-jpg_604x0.jpg" alt="" class="img-fluid">
                                </svg>
                                <div class="card-body">
                                    <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional
                                        content. This content is a little bit longer.</p>
                                    <div class="d-flex justify-content-between align-items-center">
                                        <div class="btn-group">
                                            <form action="/..........">
                                                <button type="subbmit" class="btn btn-sm btn-outline-secondary">Ver mas</button>
                                            </form>
                                        </div>
                                        <small class="text-muted">9 mins</small>
                                    </div>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>
            </div>

            <div class="">

                <div id="comments " class="comments">
                    
                    

                    <div id="comment-1">
                        <div class="comment my-2">
                            <div class="media-left">
                                <img src="https://www.zona-leros.net/storage/image/default.png" alt="" class="img ">
                            </div>
                            <div class="media-body">
                                <div class="media-content" style=" ">
                                    <span class="media-heading"> titulo </span>
                                    <span class="date" style="display: inline;"> • date.</span>
                                    <span class="text"> Body <br>
                                    </span>
                                    <div class="date">
                                        <span class="up">
                                            <span id="upvotes-9393">likes</span> <i class="fa fa-fw fa-chevron-up " onclick="  " id="up-9393"></i>
                                        </span> 
                                    </div>
                                </div>
                            </div>
                        </div>
                        
                        
                        // comentar
                        
                        <div class="comment my-2">
                            <div class="media-left">
                                <img src="https://www.zona-leros.net/storage/image/default.png" alt="" class="img ">
                            </div>
                            <div class="media-body">
                                <div class="media-content" style=" ">
                                    <span class="text">  
                                        <br><br><br>
                                    </span>
                                </div>
                            </div>
                        </div>
                      
                        <div class="text-right px-3">
                            <form action="/proyecto/principal/deportistas?commentary=0" method="post">
                                <input type="submit" class="btn btn-danger" value="Comentar">
                            </form>
                        </div>
                        
                                                
                    </div>

                </div>
            </div>
        </div>


    </body>
</html>