<%-- 
    Document   : userAdmin
    Created on : 27/05/2016, 07:52:38 AM
    Author     : HP VPRO
--%>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <title>Tienda De2da</title>
        <script src="javascript/jquery-2.2.4.min.js" type="text/javascript"></script>   
        <script src="javascript/header.js" type="text/javascript"></script>
        <script src="javascript/materialize.js" type="text/javascript"></script>
        <script src="javascript/scriptsAdmin.js" type="text/javascript"></script>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <link href="css/materialize.css" rel="stylesheet" type="text/css"/>
        <link href="iconos/css3/font-awesome.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
           <div id="formLoguin">
                <div class="row col s6 offset-s3">
                    <h3 id="titleH3">INICIO SESIÓN ADMIN</h3>
                </div>

                <div class="row col s12 divider"></div>

                <div class="row">
                    <div class="input-field col s4 offset-s4">
                        <input id="usuario_admin" type="text" class="validate">
                        <label for="usuario_admin">Usuario</label>
                    </div>

                </div>
                <div class="row">
                    <div class="input-field col s4 offset-s4">
                        <input id="contrasena_admin" type="password" class="validate">
                        <label for="contrasena_admin">Contraseña</label>
                    </div>

                </div>
                <div class="row">
                    <div class="col s4 offset-s4">
                        <a class="waves-effect waves-light btn" href="#" onclick="loginAdmin()">Ingresar</a>
                    </div>
                </div>

            </div>
<%@ include file="footer.jsp" %>