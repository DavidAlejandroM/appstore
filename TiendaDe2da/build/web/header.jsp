<%-- 
    Document   : header
    Created on : 23/05/2016, 10:13:28 PM
    Author     : HP VPRO
--%>
<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <title>Tienda De2da</title>
        <script src="javascript/jquery-2.2.4.min.js" type="text/javascript"></script>   
        <script src="javascript/header.js" type="text/javascript"></script>
        <script src="javascript/materialize.js" type="text/javascript"></script>
        <script src="javascript/itemProducoPublicidad.js" type="text/javascript"></script>
        <script src="javascript/scriptsAdmin.js" type="text/javascript"></script>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <link href="css/materialize.css" rel="stylesheet" type="text/css"/>
        <link href="iconos/css3/font-awesome.css" rel="stylesheet" type="text/css"/>
    </head>
    <nav style="background-color: gray;">
        <ul class="right hide-on-med-and-down">
            <c:choose>
                <c:when test="${not empty sessionScope.Nombre}">                
                    <c:out value="Bienvenido ${sessionScope.Nombre}"/>                    
                    <li><a href="#" onclick="logout()">Salir</a></li>
                    </c:when>
                    <c:otherwise>
                    <li><a href="registrarUsuario.jsp">Registrarse</a></li>
                    <li><a href="userAdmin.jsp">Administrador</a></li>
                    <li><a class="waves-effect waves-light btn modal-trigger" href="#modal2">Entrar</a></li>
                    </c:otherwise>
                </c:choose>
        </ul>
        <ul id="slide-out" class="side-nav">
            <li><a href="#!">First Sidebar Link</a></li>
            <li><a href="#!">Second Sidebar Link</a></li>
        </ul>

    </nav>
    <body>
