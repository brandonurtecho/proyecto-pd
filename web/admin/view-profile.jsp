<%-- 
    Document   : view-profile
    Created on : 09/06/2019, 12:48:29 PM
    Author     : RDR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <!-- Bootstrap CSS CDN -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
        <!-- Our Custom CSS -->
        <link rel="stylesheet" href="../assets/css/main-content.css">
        <link href="../assets/bootstrap/css/util.css" rel="stylesheet"/>

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
                        <img src="../assets/img/logo-admin.png" height="100" width="100"><br>
                    </div><br>

                    <p style="color: #FAFAFA" >Administrador</p>
                </div>
                <div class="sidebar-b">

                    <ul class="list-unstyled components">
                        <li class="active">
                            <a href="#homeSubmenu" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">Comentarios de sedes</a>
                            <ul class="collapse list-unstyled" id="homeSubmenu">
                                <li>
                                    <a href="venue-commentaries.jsp">La videna</a>
                                </li>
                                <li>
                                    <a href="venue-commentaries.jsp">El llaoca</a>
                                </li>
                                <li>
                                    <a href="venue-commentaries.jsp">Luriwashington</a>
                                </li>
                            </ul>
                        </li>
                        <li>
                            <a href="#pageSubmenu" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">Comentarios deportes</a>
                            <ul class="collapse list-unstyled" id="pageSubmenu">
                                <li>
                                    <a href="sport-commentaries.jsp">Futbol</a>
                                </li>
                                <li>
                                    <a href="sport-commentaries.jsp">Voley</a>
                                </li>
                                <li>
                                    <a href="sport-commentaries.jsp">Natacion</a>
                                </li>
                            </ul>
                        </li>
                        <li>
                            <a href="venue-attendees.jsp">Ver asistentes</a>
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
                                    <a class="nav-link" href="view-profile.jsp"><strong>Ver Perfil</strong></a>
                                </li>
                                <li class="nav-item active">
                                    <a class="nav-link" href="login.jsp"><strong>Cerrar Sesion</strong></a>
                                </li>
                            </ul>
                        </div>

                    </div>
                </nav>
                <section>
                    <div class="flex-c">
                        <h2>DATOS PERSONALES</h2>
                    </div>
                    <div class="form-group flex-sa">
                        <div class="w-40">
                            <label>Nombre:</label>
                            <input type="text" class="form-control" id="nombre" placeholder="Nombre" readonly><br>
                        </div>
                        <div class="w-40">
                            <label>Apellido:</label>
                            <input type="text" class="form-control" id="apellido" placeholder="Apellido" readonly><br>
                        </div>
                    </div>
                    <div class="form-group flex-sa">
                        <div class="w-40">
                            <label>DNI:</label>
                            <input type="text" class="form-control" id="dni" placeholder="DNI" readonly><br> 
                        </div>
                        <div class="w-40">
                            <label>Telefono:</label>
                            <input type="text" class="form-control" id="telefono" placeholder="Telefono" readonly><br>
                        </div>
                    </div>              
                    <div class="form-group flex-sa">
                        <div class="w-90">
                            <label>Correo Electronico:</label>
                            <input type="text" class="form-control" id="correo" placeholder="Correo Electronico" readonly>
                        </div>
                    </div>
                    <div class="form-group flex-sa">
                        <div class="w-40">
                            <label>Edad:</label>
                            <input type="text" class="form-control" id="edad" placeholder="Edad" readonly><br> 
                        </div>
                        <div class="w-40">  
                            <label>Sexo:</label>
                            <input type="text" class="form-control" id="sexo" placeholder="Sexo" readonly><br>
                        </div>
                    </div>
                    <div class="flex-c">
                        <button class="btn btn-primary"><a href="edit-profile.jsp">Modificar Datos</a></button>
                    </div>
                </div>
            </section>
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
