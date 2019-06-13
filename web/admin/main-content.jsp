<%-- 
    Document   : main-content
    Created on : 09/06/2019, 09:47:56 AM
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
                <nav class="navbar navbar-expand-lg navbar-light bg-light" >
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

                <h2>Levantate oe</h2>
                <p>A que hora se levantara franco tmr :v</p>
                <p>Ah pero a las 5 para joder si se levanta csm :v</p>

                <h2>Lorem Ipsum Dolor</h2>
                <p>Levantate pe</p>

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
