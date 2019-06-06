<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DETALLE</title>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    </head>
    <body>
        <center>       
        <h1>LISTA</h1>
        <table border="2">
            <thead>
                <tr>
                    <th><a href="index">Back</a></th>
                </tr>
            </thead>
        </table>
        <br>
            
       </center>
        
          <div align="center">
              <table border="1">
                  <thead>
                      <tr>
                          <th>ID</th>
                          <th>NAME</th>
                          <th>ADDRESS</th>
                          <th>ZIP CODE</th>
                          <th>PHONE</th>
                          <th>CITY</th>
                          <th>COUNTRY</th>
                          <th>SID</th>
                      </tr>
                  </thead>
                  <tbody>
                      <c:forEach var="cliente" items="${listaClientes}">
                            <tr>
                                <td><c:out value="${cliente.id}"></c:out></td>
                                <td><c:out value="${cliente.name}"></c:out></td>
                                <td><c:out value="${cliente.address}"></c:out></td>
                                <td><c:out value="${cliente.zipCode}"></c:out></td>
                                <td><c:out value="${cliente.phone}"></c:out></td>
                                <td><c:out value="${cliente.city}"></c:out></td>
                                <td><c:out value="${cliente.country}"></c:out></td>
                                <td><c:out value="${cliente.sid}"></c:out></td>
                            </tr>
                        </c:forEach>
                  </tbody>
              </table>

          </div> 
                      
          </br>
          
    </body>
</html>
