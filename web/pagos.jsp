<%-- 
    Document   : pagos-user
    Created on : 15/06/2019, 05:47:34 PM
    Author     : jeanpieralex
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagos</title>
        
         <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
        integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <body>
        
        <div class="container p-4">
            <div class="py-5 text-center">
                <img class="d-block mx-auto mb-4" src="/images/Logo_oficial_Juegos_Panamericanos_Lima_2019.png" alt="" width="72" height="72">
                <h2><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Formulario de pago</font></font></h2>
            </div>

            <div class="col-md-8 order-md-1 mx-auto">

                <form action="/proyecto/principal/pagos" class="needs-validation" method="post">
                    <div class="row">
                        <div class="col-md-6 mb-3">
                            <label for="firstName"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Nombre</font></font></label>
                            <input type="text" class="form-control" id="firstName" name="firstname">
                            <div class="invalid-feedback">
                                Campo invalido
                            </div>
                        </div>
                        <div class="col-md-6 mb-3">
                            <label for="lastName"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Apellido</font></font></label>
                            <input type="text" class="form-control" id="lastName" name="lastname">
                            <div class="invalid-feedback">
                                Campo invalido
                            </div>
                        </div>
                    </div>

                    <div class="mb-3">
                        <label for="email"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Correo electrónico </font></font><span class="text-muted"></span></label>
                        <input type="email" class="form-control" id="email" name="email">
                        <div class="invalid-feedback">
                            Campo invalido
                        </div>
                    </div>

                    <div class="mb-3">
                        <label for="address"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Dirección</font></font></label>
                        <input type="text" class="form-control" id="address" name="address" >
                        <div class="invalid-feedback">
                            Campo invalido
                        </div>
                    </div>

                    <div class="mb-3">
                        <label for="address2"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Dirección opcional</font></font><span class="text-muted"></span></label>
                        <input type="text" class="form-control" id="address2" name="address2">
                    </div>

                    <div class="row">
                        <div class="col-md-5 mb-3">
                            <label for="country"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">País</font></font></label>
                            <input type="text" class="form-control" id="address2" name="country">
                            <div class="invalid-feedback">
                                Please select a valid country.
                            </div>
                        </div>
                        <div class="col-md-4 mb-3">
                            <label for="state"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Estado</font></font></label>
                            <input type="text" class="form-control" id="address2" name="state">
                            <div class="invalid-feedback">
                                Please provide a valid state.
                            </div>
                        </div>
                        <div class="col-md-3 mb-3">
                            <label for="zip"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Codigo Postal</font></font></label>
                            <input type="text" class="form-control" id="zip" name="zip">
                            <div class="invalid-feedback">
                                Zip code required.
                            </div>
                        </div>
                    </div>
                    <hr class="mb-4">

                    <h4 class="mb-3"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Pago</font></font></h4>
                    
                    <div class="row">
                        <div class="col-md-5 mb-3">
                            <label for="pay"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Tarjeta de credito</font></font></label>
                            <input type="text" class="form-control" id="pay" name="creditcard">
                            <div class="invalid-feedback">
                                Please select a valid country.
                            </div>
                        </div>
                        <div class="col-md-7 mb-3">
                            <label for="pay"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Paypal</font></font></label>
                            <input type="email" class="form-control" id="pay" name="paypal">
                            <div class="invalid-feedback">
                                Please select a valid country.
                            </div>
                        </div>
                    </div>
                    
                    <button class="btn btn-primary btn-lg btn-block" type="submit"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Realizar compra</font></font></button>
                </form>
            </div>
        </div>
    </body>
</html>
