<%-- 
    Document   : edit-profile
    Created on : 09/06/2019, 03:06:50 PM
    Author     : RDR
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Bootstrap CSS CDN -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
        <!-- Our Custom CSS -->
        <link rel="stylesheet" href="/proyecto/assets/css/main-content.css">

        <link href="/proyecto/assets/bootstrap/css/util.css" rel="stylesheet"/>


        <!-- Font Awesome JS -->
        <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/solid.js" integrity="sha384-tzzSw1/Vo+0N5UhStP3bvwWPq+uvzCMfrN1fEFe+xBmv1C/AtVX5K0uZtmcHitFZ" crossorigin="anonymous"></script>
        <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js" integrity="sha384-6OIrr52G08NpOFSZdxxz1xdNSndlD4vdcf/q2myIUVO0VsqaGHJsB0RaBE01VTOY" crossorigin="anonymous"></script>
        <title>Editar Perfil</title>
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

                <form action="/proyecto/admin/admin/edit-profile">
                    <c:set var="admin" value="${admin}"></c:set>
                    <div class="flex-c">
                        <h2>EDITAR DATOS PERSONALES</h2>
                    </div>
                    <div class="form-group flex-sa">
                        <div class="w-40">
                            <label>Nombre:</label>
                            <input type="text" class="form-control" name="name" value="${admin.name}" placeholder="Ingrese el nombre" ><br>
                        </div>
                        <div class="w-40">
                            <label>Apellido:</label>
                            <input type="text" class="form-control" name="lastname" value="${admin.lastname}" placeholder="Ingrese el apellido" ><br>
                        </div>
                    </div>
                    <div class="form-group flex-sa">
                        <div class="w-40">
                            <label>DNI:</label>
                            <input type="text" class="form-control" name="dni" value="${admin.dni}" placeholder="Ingrese el DNI" ><br> 
                        </div>
                        <div class="w-40">
                            <label>Telefono:</label>
                            <input type="text" class="form-control" name="phone" value="${admin.phone}" placeholder="Ingrese el telefono" ><br>
                        </div>
                    </div>
                    <div class="form-group flex-sa">
                        <div class="w-90">
                            <label>Correo Electronico:</label>
                            <input type="text" class="form-control" name="email" value="${admin.email}" placeholder="Ingrese el correo electronico" readonly>
                        </div>
                    </div>
                    <div class="form-group flex-sa">
                        <div class="w-40">
                            <label>Edad:</label>
                            <input type="text" class="form-control" name="age" value="${admin.age}" placeholder="Ingrese la edad" ><br> 
                        </div>
                        <div class="w-40">
                            <label>Sexo:</label>
                            <input type="text" class="form-control" name="genre" value="${admin.genre}" placeholder="Sexo" readonly><br>
                        </div>
                    </div>
                    <div class="form-group flex-c">                     
                        <div class="m-10">
                            <button type="submit" class="btn btn-primary">Guardar</button>
                        </div>     
                        <div class="m-10">
                            <button class="btn btn-danger"><a href="/proyecto/admin/view-profile.jsp">Cancelar</a></button>
                        </div>
                    </div>
                </form>

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
