<%-- 
    Document   : venue-attendees
    Created on : 09/06/2019, 11:00:53 AM
    Author     : RDR
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Asistentes</title>
        <!-- Bootstrap CSS CDN -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
        <!-- Our Custom CSS -->
        <link rel="stylesheet" href="/proyecto/assets/css/main-content.css">
        <link href="/proyecto/assets/bootstrap/css/util.css" rel="stylesheet"/>

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
                        <a class="nav-link" href="/proyecto/admin/admin/view-profile"><img src="/proyecto/assets/img/Users-Administrator-icon.png" height="150" width="150"></a><br>
                    </div>

                    <p>Administrador</p>
                </div>
                <div class="sidebar-b">
                    <ul class="list-unstyled components">                
                        <li class="active">
                            <c:set var="venues">Villa Deportiva Regional del Callao,Costa Verde - San Miguel,Estadio Nacional,
                                Villa Deportiva Nacional - Videna,Coliseo Eduardo Dibós,Circuito Ciudad,Escuela de Equitación del Ejército,
                                Complejo Deportivo Villa María del Triunfo,Base Aérea Las Palmas,Escuela Militar de Chorrillos,Playa Chorrillos,
                                Morro Solar Chorrillos,Polideportivo Villa el Salvador,Country Club de Villa,Villa Panamericana y Parapanamericana,
                                Punta Rocas,Puerto Viejo,Laguna Bujama,Río Cañete - Lunahuaná,Yatch Club Peruano Sede Paracas</c:set>
                            <a href="#homeSubmenu" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">Comentarios de sedes</a>
                            <ul class="collapse list-unstyled" id="homeSubmenu">
                                <c:forTokens items="${venues}" delims="," var="venue">
                                    <li><a href="venue-commentaries.jsp">${venue}</a></li>
                                </c:forTokens>
                            </ul>
                        </li>
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
                                    <li><a href="/proyecto/admin/admin/sport-commentaries?sport=${sport}">${sport}</a></li>
                                </c:forTokens>
                            </ul>
                        </li>
                        <li>
                            <a href="/proyecto/admin/admin/venue-attendees">Ver asistentes</a>
                        </li>
                    </ul>
                </div>
            </nav>

            <!-- Page Content  -->
            <div id="content">

                <nav class="navbar navbar-expand-lg navbar-light bg-light">
                    <div class="container-fluid">


                        <div class="collapse navbar-collapse" id="navbarSupportedContent">
                            <ul class="nav navbar-nav ml-auto">
                                <li class="nav-item active">
                                    <a class="nav-link" href="/proyecto/admin/admin/login-admin"><strong>Cerrar Sesion</strong></a>
                                </li>
                            </ul>
                        </div>

                    </div>
                </nav>

                <div align="center">
                    <h2>ASISTENTES</h2><br>
                </div>

                <section>
                    <c:set var="i" value="1"/>
                    <c:forEach items="${attendees}" var="attendee">                       
                        <div class="card my-4">
                            <div class="card-body">
                                <div class="form-group flex-sa">
                                    <div class="w-40">
                                        <label>Nombre:</label>
                                        <input type="text" class="form-control" id="nombre" value="${attendee.name}" readonly><br>
                                    </div>
                                    <div class="w-40">
                                        <label>Apellido:</label>
                                        <input type="text" class="form-control" id="apellido" value="${attendee.lastname}" readonly><br>
                                    </div>
                                </div>
                                <div id="extra${i}">
                                    <div class="form-group flex-sa">
                                        <div class="w-40">
                                            <label>Edad:</label>
                                            <input type="text" class="form-control" id="edad" value="${attendee.birthdate}" readonly><br> 
                                        </div>
                                        <div class="w-40">  
                                            <label>Sexo:</label>
                                            <input type="text" class="form-control" id="sexo" value="${attendee.genre}" readonly><br>
                                        </div>                                   
                                    </div>
                                    <div class="form-group flex-sa">
                                        <div class="w-90">
                                            <label>Correo Electronico:</label>
                                            <input type="text" class="form-control" id="correo" value="${attendee.email}" readonly>
                                        </div>
                                    </div>
                                </div>
                                <button id="btn${i}" class="btn btn-primary float-right">O</button>
                            </div>
                        </div>
                        <c:set var="i" value="${i+1}"/>
                    </c:forEach>          
                </section>
            </div>
        </div>

        <!-- jQuery CDN - Slim version (=without AJAX) -->
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <!-- Popper.JS -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js" integrity="sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ" crossorigin="anonymous"></script>
        <!-- Bootstrap JS -->
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js" integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm" crossorigin="anonymous"></script>
        <script src="https://code.jquery.com/jquery-1.10.2.js"></script>
        <script type="text/javascript">
            $(document).ready(function () {
                $('#sidebarCollapse').on('click', function () {
                    $('#sidebar').toggleClass('active');
                });
            });
            <c:set var="i" value="1"/> 
            <c:forEach items="${attendees}" var="attendee">           
            $("#extra${i}").toggle();
            <c:set var="i" value="${i+1}"/>
            </c:forEach>
            <c:set var="i" value="1"/>       
            <c:forEach items="${attendees}" var="attendee">             
            $("#btn${i}").click(function () {
                $("#extra${i}").toggle("slow");
            });
            <c:set var="i" value="${i+1}"/>
            </c:forEach>
        </script>

    </body>
</html>
