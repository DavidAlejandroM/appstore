<%-- 
    Document   : admin
    Created on : 27/05/2016, 05:21:27 AM
    Author     : HP VPRO
--%>

<%@ include file="header.jsp" %>

<div class="row">
    <div id="categoriaBar">
        <ul class="collapsible" data-collapsible="accordion">
            <li>
                <div class="collapsible-header"><i class="material-icons"></i>Administrar Juegos</div>
                <div class="collapsible-body adminJuego">
                    <a class="waves-effect waves-red btn btnAdmin white black-text" onclick="showDiv('formAddGame')">Registrar</a><br>
                    <a class="waves-effect waves-red btn btnAdmin white black-text" >Actualizar</a><br>
                    <a class="waves-effect waves-red btn btnAdmin white black-text" >Eliminar</a><br>

                </div>
            </li>
            <li>
                <div class="collapsible-header"><i class="material-icons"></i>Administrar Usuarios</div>
                <div class="collapsible-body">
                    <a class="waves-effect waves-red btn btnAdmin white black-text" >Editar Usuario</a><br>
                    <a class="waves-effect waves-red btn btnAdmin white black-text" >Borrar Juego</a><br>
                </div>
            </li>
        </ul>
    </div>
    <!--
    <img src="" id="imagenBig">
    
    <div class="itemProducto">
        <img src="img/1.jpg" alt="Norway" id="imagenItem">
        <div class="container">
            <p></p>
            <p>Hardanger, Norway</p>
            <button id="botonItemProducto">Comprar</button>
        </div>
    </div>
    -->

    <!--AGREGAR JUEGO  ----------------------------------------------------------------------------------->
    
        <div id="formAddGame">
            <div class="row">
                <div class="col s8">
                    <div class="row">
                        <div class="input-field col s6">
                            <select id="select_categoria">
                                <option value="" disabled selected>Elija una opción</option>
                                <option value="1">Accion</option>
                                <option value="2">Estrategia</option>
                                <option value="3">Roll</option>
                            </select>
                            <label>Categoria</label>

                        </div><div class="input-field col s6">
                            <select id="select_plataforma">
                                <option value="" disabled selected>Elija una opción</option>
                                <option value="1">PC</option>
                                <option value="2">Xbox One</option>
                                <option value="3">PS4</option>
                            </select>
                            <label>Plataforma</label>
                        </div>

                    </div>
                    <div class="row">
                        <div class="input-field col s12">
                            <input id="nombre_game" type="text" class="validate">
                            <label for="nombre_game">Nombre Juego</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s6">
                            <input id="precio_game" type="text" class="validate" onchange="formatoMoneda(this.value)" onkeyup="formatoMoneda(this.value)">
                            <label for="precio_game">Precio</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s12">
                            <form action="#">
                                <div class="file-field input-field">
                                    <div class="btn">
                                        <span>Imagen</span>
                                        <input type="file">
                                    </div>
                                    <div class="file-path-wrapper">
                                        <input class="file-path validate" type="text" placeholder="Seleciona una Imagen" id="pathImagen" onchange="mostrarImagenMiniatura('caratula', 'pathImagen')" >
                                    </div>
                                </div>
                            </form>
                        </div>

                    </div>
                    <div class="row">
                        <div class="input-field col s12">
                            <textarea id="text_area_descripcion" class="materialize-textarea"></textarea>
                            <label for="text_area_descripcion">Descripción</label>
                        </div>
                    </div>

                </div>
                <div class="col s4">
                    <img class="z-depth-2" src="" id="caratula" width="150" height="200">
                </div>
            </div>
            <div class="row">
                <div class="col s2 offset-s6">
                    <a class="waves-effect waves-light btn">Guardar</a>
                </div>
            </div>

        </div>
    <!--FIN AGREGAR JUEGO  ----------------------------------------------------------------------------------->


</div>

<%@ include file="footer.jsp" %>
