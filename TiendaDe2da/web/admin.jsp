<%-- 
    Document   : admin
    Created on : 27/05/2016, 05:21:27 AM
    Author     : HP VPRO
--%>

<%@ include file="header.jsp" %>
<div id="contenedorAdmin">
    <div class="row" id="contenedor">
        <div class="col s3" id="categoriaBar">
            <ul class="collapsible" data-collapsible="accordion">
                <li>
                    <div class="collapsible-header"><i class="material-icons">Administrar_Juegos</i></div>
                    <div class="collapsible-body adminJuego">
                        <a class="waves-effect waves-red btn btnAdmin" onclick="showDiv('formAddGame')">Registrar</a><br>
                        <a class="waves-effect waves-red btn btnAdmin" onclick="showDiv('formListar')">Actualizar</a><br>
                        <a class="waves-effect waves-red btn btnAdmin" onclick="showDiv('formListarEliminar')">Eliminar</a><br>

                    </div>
                </li>
            </ul>
        </div>

        <div class="col s9">
<!----TABLA LISTAR--->
            <div id="formListar">
                <table>
                    <thead>
                    <tr>
                        <th data-field="name">Nombre Juego</th>
                        <th data-field="name">Categoria</th>
                        <th data-field="name">Pataforma</th>
                        <th data-field="price">Precio</th>
                    </tr>
                    </thead>

                    <tbody>
                    <tr class="mouseColor tableItemUpdate" id="1">
                        <td>Call of Duty Black Ops</td>
                        <td>Accion</td>
                        <td >Pc</td>
                        <td>$ 100000</td>
                    </tr>
                    <tr class="mouseColor tableItemUpdate" id="2">
                        <td>World of Warcraft</td>
                        <td>Roll</td>
                        <td>PS4</td>
                        <td>$ 80000</td>
                    </tr>

                    </tbody>
                </table>
            </div>
<!----TABLA LISTAR ELIMINAR-->
            <div id="formListarEliminar">
                <table>
                    <thead>
                    <tr>
                        <th data-field="name">Nombre Juego</th>
                        <th data-field="name">Categoria</th>
                        <th data-field="name">Pataforma</th>
                        <th data-field="price">Precio</th>
                    </tr>
                    </thead>

                    <tbody>
                    <tr class="mouseColor tableItemDelete" id="1">
                        <td>Call of Duty Black Ops</td>
                        <td>Accion</td>
                        <td >Pc</td>
                        <td>$ 100000</td>
                    </tr>
                    <tr class="mouseColor tableItemDelete" id="2">
                        <td>World of Warcraft</td>
                        <td>Roll</td>
                        <td>PS4</td>
                        <td>$ 80000</td>
                    </tr>
                    <tr class="mouseColor tableItemDelete" id="3">
                        <td>World of Warcraft</td>
                        <td>Roll</td>
                        <td>PS4</td>
                        <td>$ 80000</td>
                    </tr>

                    </tbody>
                </table>
            </div>

     <!--AGREGAR JUEGO  ----------------------------------------------------------------------------------->
         <div id="formAddGame">
                <div class="row">
                    <div class="col s8">
                        <div class="row">
                            <div class="input-field col s6">
                                <select id="select_categoria">
                                    <option value="0" disabled selected>Elija una opción</option>
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
                                    <div class="file-field input-field">
                                        <div class="btn">
                                            <span>Imagen</span>
                                            <input type="file">
                                        </div>
                                        <div class="file-path-wrapper">
                                            <input class="file-path validate" type="text" placeholder="Seleciona una Imagen" id="pathImagen" onchange="mostrarImagenMiniatura('caratula','pathImagen')" >
                                        </div>
                                    </div>
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
                        <a class="waves-effect waves-light btn" onclick="guardarJuego()">Guardar</a>
                    </div>
                </div>

            </div>
        </div>
    </div>
</div>
    
<div id="footerAdmin">
    Bienvenido al Modulo de Administración
</div>
</body>
</html>