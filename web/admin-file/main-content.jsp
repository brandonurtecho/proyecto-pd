<%-- 
    Document   : main-content
    Created on : 09/06/2019, 09:47:56 AM
    Author     : RDR
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contenido Principal</title>
        <!-- Bootstrap CSS CDN -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
        <!-- Our Custom CSS -->
        <link rel="stylesheet" href="/proyecto/assets/css/main-content.css">

        <!-- Font Awesome JS -->
        <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/solid.js" integrity="sha384-tzzSw1/Vo+0N5UhStP3bvwWPq+uvzCMfrN1fEFe+xBmv1C/AtVX5K0uZtmcHitFZ" crossorigin="anonymous"></script>
        <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js" integrity="sha384-6OIrr52G08NpOFSZdxxz1xdNSndlD4vdcf/q2myIUVO0VsqaGHJsB0RaBE01VTOY" crossorigin="anonymous"></script>

    </head>
    <body>
       
        
        <div class="wrapper">
            <!-- Sidebar  -->
            <nav id="sidebar">
                <div align="center" class="sidebar-header">
                    <h3>ADMIN</h3>

                    <div align="center">
                        <a class="nav-link" href="/proyecto/admin/view-profile"><img src="/proyecto/assets/img/Users-Administrator-icon.png" height="150" width="150"></a><br>
                    </div>

                    <p>Administrador</p>
                </div>
                <div class="sidebar-b">
                    <ul class="list-unstyled components">                
                        
                        <li>
                            <c:set var="sports">ATLETISMO,BADMINTON,BALONCESTO,BALONMANO,BEISBOL,BOWLING,BOXEO,CANOTAJE SLALOM,CANOTAJE SLALOM EXTREMO,
                                CANOTAJE VELOCIDAD,CICLISMO BMX,CICLISMO DE MONTAÑA,Ciclismo de Pista,Ciclismo de Ruta,Clavados,Deportes Ecuestres,
                                Esgrima,Esquí Acuático y Wakeboard,Fisicoculturismo,Fútbol,Gimnasia Artística,Gimnasia Rítmica,Gimnasia Trampolín,
                                Golf,Hockey,Judo,Karate,Levantamiento de Pesas,Lucha, Natación,Natación Aguas Abiertas,Natación Artística,Patinaje Artístico,
                                Patinaje de Velocidad,Pelota Vasca,Pentatlón Moderno,Ráquetbol,Remo,Rugby 7,Softbol,Squash,Surf,Taekwondo,Tenis,Tenis de Mesa,
                                Tiro,Tiro con Arco,Triatlón,Vela,Voleibol,Voleibol de Playa,Water Polo</c:set>
                            <a href="#pageSubmenu" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">Comentarios deportes</a>
                            <ul class="collapse list-unstyled" id="pageSubmenu">
                                <c:forTokens items="${sports}" delims="," var="sport">
                                    <li><a href="/proyecto/admin/sport-commentaries?sport=${sport}">${sport}</a></li>
                                </c:forTokens>
                            </ul>
                        </li>
                        <li>
                            <a href="/proyecto/admin/venue-attendees">Ver asistentes</a>
                        </li>
                    </ul>
                </div>
            </nav>

            <!-- Page Content  -->
            <div id="content">
                <nav class="navbar navbar-expand-lg navbar-light bg-light" >
                    <div class="container-fluid">


                        <div class="collapse navbar-collapse" id="navbarSupportedContent">
                            <ul class="nav navbar-nav ml-auto">
                                <li class="nav-item active">
                                    <a class="nav-link" href="/proyecto/admin/login-admin"><strong>Cerrar Sesión</strong></a>
                                </li>
                            </ul>
                        </div>

                    </div>
                </nav>

                <section>
                    <div class="container">
                        <div class="row">
                            <!-- Team Member 1 -->
                            <div class="col-xl-3 col-md-6 mb-4">
                                <div class="card border-0 shadow">
                                    <img src="https://source.unsplash.com/TMgQMXoglsM/500x350" class="card-img-top" alt="...">
                                    <div class="card-body text-center">
                                        <h5 class="card-title mb-0">Diego Vera</h5>
                                        <div class="card-text text-black-50">Web Developer</div>
                                    </div>
                                </div>
                            </div>
                            <!-- Team Member 2 -->
                            <div class="col-xl-3 col-md-6 mb-4">
                                <div class="card border-0 shadow">
                                    <img src="https://source.unsplash.com/TMgQMXoglsM/500x350" class="card-img-top" alt="...">
                                    <div class="card-body text-center">
                                        <h5 class="card-title mb-0">Renato Martin</h5>
                                        <div class="card-text text-black-50">Web Developer</div>
                                    </div>
                                </div>
                            </div>
                            <!-- Team Member 3 -->
                            <div class="col-xl-3 col-md-6 mb-4">
                                <div class="card border-0 shadow">
                                    <img src="https://source.unsplash.com/sNut2MqSmds/500x350" class="card-img-top" alt="...">
                                    <div class="card-body text-center">
                                        <h5 class="card-title mb-0">Brandon Urtecho</h5>
                                        <div class="card-text text-black-50">Web Developer</div>
                                    </div>
                                </div>
                            </div>
                            <!-- Team Member 4 -->
                            <div class="col-xl-3 col-md-6 mb-4">
                                <div class="card border-0 shadow">
                                    <img src="https://source.unsplash.com/sNut2MqSmds/500x350" class="card-img-top" alt="...">
                                    <div class="card-body text-center">
                                        <h5 class="card-title mb-0">Franco Tasso</h5>
                                        <div class="card-text text-black-50">Web Developer</div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- /.row -->
                        <div class="row">
                            <!-- Team Member 1 -->
                            <div class="col-xl-3 col-md-6 mb-4">
                                <div class="card border-0 shadow">
                                    <img src="https://source.unsplash.com/TMgQMXoglsM/500x350" class="card-img-top" alt="...">
                                    <div class="card-body text-center">
                                        <h5 class="card-title mb-0">Jeanpier Ullauri</h5>
                                        <div class="card-text text-black-50">Web Developer</div>
                                    </div>
                                </div>
                            </div>
                            
                        </div>

                    </div>
                </section>

            </div>
        </div>

        <!-- jQuery CDN - Slim version (=without AJAX) -->
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <!-- Popper.JS -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js" integrity="sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ" crossorigin="anonymous"></script>
        <!-- Bootstrap JS -->
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js" integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm" crossorigin="anonymous"></script>

        <script type="text/javascript">
            $(document).ready(function () {
                $('#sidebarCollapse').on('click', function () {
                    $('#sidebar').toggleClass('active');
                });
            });
        </script>
    </body>
</html>
