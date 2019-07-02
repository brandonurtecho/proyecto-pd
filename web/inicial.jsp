<%-- 
    Document   : principal-user
    Created on : 13-jun-2019, 17:19:56
    Author     : LaboratorioFISI
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Juegos Panamericanos 2019</title>
        
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        
    </head>
    <body>
        
        <link rel="stylesheet" href="/proyecto/assets/css/vistaprincipal.css">
         
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
                    aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="p-2 text-white" href="/proyecto/principal/voluntarios" style="font-size: 20px;">Voluntarios</a>
                    </li>
                    <li class="nav-item">
                        <a class="p-2 text-white" href="/proyecto/principal/eventos" style="font-size: 20px;">Eventos</a>
                    </li>
                    <li class="nav-item">
                        <a class="p-2 text-white" href="/proyecto/principal/" style="font-size: 20px;">Cerrar sesion</a>
                    </li>
                </ul>
            </div>
        </nav>

      <section class="deportes" id="deportes">
          <div class="sections sections-half clearfix">
              <div class="section-title" style="text-align: center">
                <div class="container">
                  <div class="title title-white" style="display: inline-grid">
                    <header class="title-text">DEPORTES Y DISCIPLINAS</header>
                  </div>
                </div>
              </div>
              <div class="section section-blue">
                <div class="section-bg-image"></div>
                <!--<div class="points points-white"></div>-->
                <div class="section-content text-center">
                  <img src="/proyecto/assets/img/logo-panamericanos.png" class="img-responsive">
                  <div class="title title-white">
                    <a href="/proyecto/principal/disciplinas?num=0" class="title-text">Panamericanos</a>
                  </div>
                  <p>Anima a los 6680 atletas de 41 naciones diferentes y no te pierdas ninguno <br> de los 39 deportes - 61 disciplinas - del 26 de julio al 11 de agosto</p>
                </div>
              </div>
              <div class="section section-purple">
                <div class="section-bg-image"></div>
                <!--<div class="points points-white"></div>-->
                <div class="section-content text-center">
                  <img src="/proyecto/assets/img/logo-parapanamericanos.png" class="img-responsive">
                  <div class="title title-white">
                    <a href="/proyecto/principal/disciplinas?num=1" class="title-text">Parapanamericanos</a>
                  </div>
                  <p>Alienta a los 1890 Para atletas y asómbrate con los 17 Para deportes <br> 18 disciplinas - del 23 de agosto al 01 de septiembre</p>
                </div>          
              </div>
            </div>
      </section>
        
        
        
        
        
    </body>
</html>
