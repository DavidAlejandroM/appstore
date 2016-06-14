<%-- 
    Document   : admin
    Created on : 27/05/2016, 05:21:27 AM
    Author     : HP VPRO
--%>

<%@ include file="header.jsp" %>
<c:choose>
    <c:when test="${not empty sessionScope.NombreAdmin}">                
        <div id="contenedorAdmin">
            <div class="row" id="contenedor">
                <div class="col s3" id="categoriaBar">
                    <ul class="collapsible" data-collapsible="accordion">
                        <li>
                            <div class="collapsible-header"><i class="material-icons">Juegos</i></div>
                            <div class="collapsible-body adminJuego">
                                <a class="waves-effect waves-red btn btnAdmin" onclick="showDiv('formAddGame')">Registrar</a><br>
                                <a class="waves-effect waves-red btn btnAdmin" onclick="showDiv('formListar')">Actualizar</a><br>
                                <a class="waves-effect waves-red btn btnAdmin" onclick="showDiv('formListarEliminar')">Eliminar</a><br>
                                <a class="waves-effect waves-red btn btnAdmin" onclick="showDiv('formListarPlataformas')">Plataformas</a><br>
                                <a class="waves-effect waves-red btn btnAdmin" onclick="showDiv('formListarCategorias')">Categorias</a><br>

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
                                    <th data-field="name"></th>
                                    <th data-field="name">Nombre Juego</th>
                                    <th data-field="name">Categoria</th>
                                    <th data-field="name">Pataforma</th>
                                    <th data-field="price">Precio</th>
                                </tr>
                            </thead>
                            <tbody>

                                <c:forEach items="${juegos}" var="juego">
                                    <tr class="mouseColor tableItemDelete" id ="${juego.getId()}">
                                        <td>
                                            <img src="${juego.getImagen()}" class="circle responsive-img imagenRedonda">
                                        </td>                          
                                        <td >${juego.getNombre()}</td>
                                        <td>${juego.getNameCategoria()}</td>
                                        <td >${juego.getNamePlataforma()}</td>
                                        <td>${juego.getPrecio()}</td>

                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </div>
                    <!----TABLA LISTAR ELIMINAR-->
                    <div id="formListarEliminar">
                        <table>
                            <thead>
                                <tr>
                                    <th data-field="name"></th>
                                    <th data-field="name">Nombre Juego</th>
                                    <th data-field="name">Categoria</th>
                                    <th data-field="name">Pataforma</th>
                                    <th data-field="price">Precio</th>
                                    <th data-field="price"></th>
                                </tr>
                            </thead>

                            <tbody>
                                <c:forEach items="${juegos}" var="juego">
                                    <tr class="mouseColor tableItemDelete" id="${juego.getId()}">
                                        <td>
                                            <img src="${juego.getImagen()}" class="circle responsive-img imagenRedonda">
                                        </td>                          
                                        <td >${juego.getNombre()}</td>
                                        <td>${juego.getNameCategoria()}</td>
                                        <td >${juego.getNamePlataforma()}</td>
                                        <td>${juego.getPrecio()}</td>
                                        <td>
                                            <a href="#" onclick="eliminar('${juego.getId()}', '${juego.getNombre()}')">Eliminar</a>
                                        </td>

                                    </tr>
                                </c:forEach>

                            </tbody>
                        </table>
                    </div>
                    <!----TABLA LISTAR PLATAFORMAS-->
                    <div id="formListarPlataformas">
                        <div class="row">
                            <div class="input-field col s6">
                                <input placeholder="Click aquí para ingresar" id="nombrePlataforma" type="text" class="validate">
                                <label for="first_name">Nombre de la Plataforma</label>
                            </div>
                            <div class="input-field col s6">
                                <a class="waves-effect waves-light btn" onclick="guardarPlataforma(document.getElementById('nombrePlataforma').value)">Guardar</a>
                            </div>
                        </div>
                        <table>
                            <thead>
                                <tr>
                                    <th> </th>
                                    <th data-field="name">Plataforma</th>

                                </tr>
                            </thead>

                            <tbody id="tbodyPlataforma">

                            </tbody>
                        </table>
                    </div>
                    <!----TABLA LISTAR Categorias-->
                    <div id="formListarCategorias">
                        <div class="row">
                            <div class="input-field col s6">
                                <input placeholder="Click aquí para ingresar" id="nombreCategoria" type="text" class="validate">
                                <label for="first_name">Nombre de la Categoria</label>
                            </div>
                            <div class="input-field col s6">
                                <a class="waves-effect waves-light btn" onclick="guardarCategoria(document.getElementById('nombreCategoria').value)">Guardar</a>
                            </div>
                        </div>
                        <table>
                            <thead>
                                <tr>
                                    <th> </th>
                                    <th data-field="name">Categorias</th>

                                </tr>
                            </thead>

                            <tbody id="tbodyCategoria">

                            </tbody>
                        </table>
                    </div>
                    <!--DIV PARA ALMACENAR EL ID  ----------------------------------------------------------------------------------->
                    <div id="idJuego" style="display: none">
                        id
                    </div>
                    <!--ACTUALIZAR JUEGO  ----------------------------------------------------------------------------------->
                    <div id="formUpdateGame">
                        <div class="row">
                            <div class="col s8">
                                <div class="row">
                                    <div class="input-field col s6">
                                        <select id="select_categoriaU">
                                        </select>
                                        <label>Categoria</label>
                                    </div><div class="input-field col s6">
                                        <select id="select_plataformaU">
                                        </select>
                                        <label>Plataforma</label>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="input-field col s12">
                                        <input placeholder="" id="nombre_gameU" type="text" class="validate">
                                        <label for="nombre_game">Nombre Juego</label>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="input-field col s6">
                                        <input placeholder="" id="precio_gameU" type="text" class="validate" onchange="formatoMoneda(this.value, 'precio_gameU')" onkeyup="formatoMoneda(this.value, 'precio_gameU')">
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
                                                <input class="file-path validate" type="text" placeholder="Seleciona una Imagen" id="pathImagenU" onchange="mostrarImagenMiniatura('caratulaU', 'pathImagenU')" >
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="input-field col s12">
                                        <textarea placeholder="" id="text_area_descripcionU" class="materialize-textarea"></textarea>
                                        <label for="text_area_descripcion">Descripción</label>
                                    </div>
                                </div>
                            </div>
                            <div class="col s4">
                                <img class="z-depth-2" src="" id="caratulaU" width="150" height="200">
                            </div>
                        </div>
                        <div class="row">
                            <div class="col s2 offset-s6">
                                <a class="waves-effect waves-light btn" onclick="actualizarJuego()">Actualizar</a>
                            </div>
                        </div>
                    </div>
                    <!--AGREGAR JUEGO  ----------------------------------------------------------------------------------->
                    <div id="formAddGame">
                        <div class="row">
                            <div class="col s8">
                                <div class="row">
                                    <div class="input-field col s6">
                                        <select id="select_categoria">
                                        </select>
                                        <label>Categoria</label>
                                    </div><div class="input-field col s6">
                                        <select id="select_plataforma">
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
                                        <input id="precio_game" type="text" class="validate" onchange="formatoMoneda(this.value, 'precio_game')" onkeyup="formatoMoneda(this.value, 'precio_game')">
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
                                                <input class="file-path validate" type="text" placeholder="Seleciona una Imagen" id="pathImagen" onchange="mostrarImagenMiniatura('caratula', 'pathImagen')" >
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
    </c:when>
    <c:otherwise>
        <c:redirect url="./userAdmin.jsp"/>
    </c:otherwise>
</c:choose>
</body>
</html>