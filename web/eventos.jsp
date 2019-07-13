<%-- 
    Document   : eventos-user
    Created on : 15/06/2019, 05:47:18 PM
    Author     : jeanpieralex
--%>
<%@page import="com.unmsm.patrones.util.Cast"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="com.unmsm.patrones.util.Cast"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
        integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

        <title>Eventos</title>
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
                        <a class="p-2 text-white" href="/proyecto/principal/voluntarios" style="font-size: 20px;">Voluntarios</a>
                    </li>
                    <li class="nav-item">
                        <a class="p-2 text-white" href="/proyecto/principal/disciplinas?num=0" style="font-size: 20px;">Disciplinas Panamericanas</a>
                    </li>
                    <li class="nav-item">
                        <a class="p-2 text-white" href="/proyecto/principal/disciplinas?num=1" style="font-size: 20px;">Disciplinas Parapanamericanas</a>
                    </li>
                    <li class="nav-item active">
                        <a class="p-2 text-white" href="/proyecto/principal/" style="font-size: 20px;">Cerrar Sesion</a>
                    </li>
                </ul>
            </div>
        </nav>
        
        <div style="background-size: cover; background-image: url(http://www.cherishpr.com/wp-content/uploads/2013/03/Colorful-Wallpaper-High-Definition-Images-4098-Awesome.jpg);">

        <div class="container p-3">
            <div style="background: #10707f; border-radius: 30px;" class="pricing-header px-5 py-5 pt-md-5 pb-md-4 mx-auto text-center">
                <h1 style="color: #ffffff;" class="display-4">
                    <font style="vertical-align: inherit;">
                    <h1 class="text">Entradas Juegos Panamericanos 2019</h1>
                    </font>
                </h1>
                <p style="color: #ffffff;" class="lead">
                    <font style="vertical-align: inherit;">
                    <font style="vertical-align: inherit;">LIMA 2019: VENTA DE ENTRADAS DE LOS JUEGOS PANAMERICANOS INICIA EL 27
                    DE MAYO . Las entradas están disponibles en diez módulos de venta ubicados en distintos puntos de la capital
                    peruana y también en internet a través del sitio web oficial de los Juegos.</font>
                    </font>
                </p>
            </div>


            <div class="row p-5 mb-3 text-center">
                <c:forEach items="${list}" var="event">
                    
                    <div class="col-md-4">
                        <div class="card mb-4 shadow-sm">
                            <div style="background: #10707f;"  class="card-header">
                                <h4 class="my-0 font-weight-normal">
                                    <font style="vertical-align: inherit;">
                                    <font style="vertical-align: inherit; font-size: 35px; color: #ffffff;">Evento</font>
                                    </font>
                                </h4>
                            </div>
                            <div style="border-color: #10707f;" class="card-body">
                                <h1 class="card-title pricing-card-title">
                                    <font style="vertical-align: inherit;">
                                    <font style="vertical-align: inherit;">S/. 20</font>
                                    </font><small class="text-muted">
                                    </small>
                                </h1>
                                <ul class="list-unstyled mt-3 mb-4">
                                    <li>
                                        <font style="vertical-align: inherit;">
                                        <font style="vertical-align: inherit;"><c:out value="${cast.dateToString(event.getDate())}" /></font>
                                        </font>
                                    </li>
                                    <li>
                                        <font style="vertical-align: inherit;">
                                        <font style="vertical-align: inherit;"> <c:out value="${event.sport}"/></font>
                                        </font>
                                    </li>
                                    <li>
                                        <font style="vertical-align: inherit;">
                                        <font style="vertical-align: inherit;"> <c:out value="${event.place}"/></font>
                                        </font>
                                    </li>
                                </ul>
                                <form action="/proyecto/principal/pagos">
                                    <input type="hidden" name="id" value="${event.id}"/>
                                    <input type="hidden" name="date" value="${cast.dateToString(event.getDate())}"/>
                                    <input type="hidden" name="place" value="${event.place}"/>
                                    <input type="hidden" name="sport" value="${event.sport}"/>
                                    <button type="submit" class="btn btn-lg btn-block btn-outline-primary">
                                        <font style="vertical-align: inherit;">
                                        <font style="vertical-align: inherit;">Comprar</font>
                                        </font>
                                    </button>

                                </form>
                            </div>
                        </div>
                    </div>

                </c:forEach>
                
            </div>
        </div>

        </div>
    </body>
</html>
