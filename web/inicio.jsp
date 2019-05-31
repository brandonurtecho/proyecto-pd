<%-- 
    Document   : customer-form
    Created on : 02-abr-2019, 16:32:22
    Author     : LaboratorioFISI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>INICIO</title>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    </head>
    <body>
        <center>
        <h1>LISTA DE PAISES</h1>
        <small>Nota: En el staff solo existen 2 personas una en Canada y otra en Australia, revisar en esos paises</small>
        <br><br>
        </center>
    
          <div align="center">
              <table border="1">
                  <thead>
                      <tr>
                          <th>ID</th>
                          <th>COUNTRY</th>
                          <th>LAST UPDATE</th>
                          <th>ACTION</th>
                      </tr>
                  </thead>
                  <tbody>
                      <c:forEach var="country" items="${listaPaises}">
                            <tr>
                                <td><c:out value="${country.idCountry}"></c:out></td>
                                <td><c:out value="${country.country}"></c:out></td>
                                <td><c:out value="${country.lastUpdate}"></c:out></td>
                                <td>   
                                    &nbsp;
                                <a href="detail-customer?countryName=<c:out value='${country.country}' />">Ver Clientes</a>
                                    |
                                <a href="detail-staff?countryName=<c:out value='${country.country}' />">Ver Staff</a>
                                    &nbsp;
                                </td>                                
                            </tr>
                        </c:forEach>
                  </tbody>
              </table>             
          </div> 
    </body>
</html>
