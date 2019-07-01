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
        
        <div class="container p-3">
            <div class="pricing-header px-5 py-5 pt-md-5 pb-md-4 mx-auto text-center">
                <h1 class="display-4">
                    <font style="vertical-align: inherit;">
                    <h1 class="text">Entradas Juegos Panamericanos 2019</h1>
                    </font>
                </h1>
                <p class="lead">
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
                            <div class="card-header">
                                <h4 class="my-0 font-weight-normal">
                                    <font style="vertical-align: inherit;">
                                    <font style="vertical-align: inherit;">Evento</font>
                                    </font>
                                </h4>
                            </div>
                            <div class="card-body">
                                <h1 class="card-title pricing-card-title">
                                    <font style="vertical-align: inherit;">
                                    <font style="vertical-align: inherit;">20 S/</font>
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


    </body>
</html>
