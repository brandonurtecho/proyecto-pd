<%-- 
    Document   : pagos-user
    Created on : 15/06/2019, 05:47:34 PM
    Author     : jeanpieralex
--%>

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

                <form class="needs-validation" novalidate="">
                    <div class="row">
                        <div class="col-md-6 mb-3">
                            <label for="firstName"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Nombre</font></font></label>
                            <input type="text" class="form-control" id="firstName" placeholder="" value="" required="">
                            <div class="invalid-feedback">
                                Campo invalido
                            </div>
                        </div>
                        <div class="col-md-6 mb-3">
                            <label for="lastName"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Apellido</font></font></label>
                            <input type="text" class="form-control" id="lastName" placeholder="" value="" required="">
                            <div class="invalid-feedback">
                                Campo invalido
                            </div>
                        </div>
                    </div>

                    <div class="mb-3">
                        <label for="email"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Correo electrónico </font></font><span class="text-muted"></span></label>
                        <input type="email" class="form-control" id="email" placeholder="tu@ejemplo.com">
                        <div class="invalid-feedback">
                            Campo invalido
                        </div>
                    </div>

                    <div class="mb-3">
                        <label for="address"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Dirección</font></font></label>
                        <input type="text" class="form-control" id="address" placeholder="1234 Main St" required="">
                        <div class="invalid-feedback">
                            Campo invalido
                        </div>
                    </div>

                    <div class="mb-3">
                        <label for="address2"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Dirección opcional</font></font><span class="text-muted"></span></label>
                        <input type="text" class="form-control" id="address2" placeholder="Apartment or suite">
                    </div>

                    <div class="row">
                        <div class="col-md-5 mb-3">
                            <label for="country"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">País</font></font></label>
                            <select class="custom-select d-block w-100" id="country" required="">
                                <option value=""><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Escoger...</font></font></option>
                                <option><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Estados Unidos</font></font></option>
                            </select>
                            <div class="invalid-feedback">
                                Please select a valid country.
                            </div>
                        </div>
                        <div class="col-md-4 mb-3">
                            <label for="state"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Estado</font></font></label>
                            <select class="custom-select d-block w-100" id="state" required="">
                                <option value=""><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Escoger...</font></font></option>
                                <option><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">California</font></font></option>
                            </select>
                            <div class="invalid-feedback">
                                Please provide a valid state.
                            </div>
                        </div>
                        <div class="col-md-3 mb-3">
                            <label for="zip"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Codigo Postal</font></font></label>
                            <input type="text" class="form-control" id="zip" placeholder="" required="">
                            <div class="invalid-feedback">
                                Zip code required.
                            </div>
                        </div>
                    </div>
                    <hr class="mb-4">

                    <h4 class="mb-3"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Pago</font></font></h4>

                    <div class="d-block my-3">
                        <div class="custom-control custom-radio">
                            <input id="credit" name="paymentMethod" type="radio" class="custom-control-input" checked="" required="">
                            <label class="custom-control-label" for="credit"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Tarjeta de crédito</font></font></label>
                        </div>
                        <div class="custom-control custom-radio">
                            <input id="debit" name="paymentMethod" type="radio" class="custom-control-input" required="">
                            <label class="custom-control-label" for="debit"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Tarjeta de débito</font></font></label>
                        </div>
                        <div class="custom-control custom-radio">
                            <input id="paypal" name="paymentMethod" type="radio" class="custom-control-input" required="">
                            <label class="custom-control-label" for="paypal"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">PayPal</font></font></label>
                        </div>
                    </div>
                    <button class="btn btn-primary btn-lg btn-block" type="submit"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Realizar compra</font></font></button>
                </form>
            </div>
        </div>
    </body>
</html>
