<%-- 
    Document   : inicio
    Created on : 23/05/2016, 10:13:58 PM
    Author     : HP VPRO
--%>

<%@ include file="header.jsp" %>

<div class="row">
    <div id="categoriaBar" class="col s3">
        <ul class="collapsible" data-collapsible="accordion">
            <li id="categoria">
                <div class="collapsible-header"><i class="fa fa-info" aria-hidden="true"></i>Categor�a</div>
                <div class="collapsible-body"><p>Aventura</p></div>
                <div class="collapsible-body"><p>Defensa</p></div>
                <div class="collapsible-body"><p>M�sica</p></div>
            </li>
            <li>
                <div class="collapsible-header"><i class="fa fa-braille" aria-hidden="true"></i>Plataforma</div>

                <div class="collapsible-body"><p>XBOX</p></div>
                <div class="collapsible-body"><p>PC</p></div>
                <div class="collapsible-body"><p>PS4</p></div>
            </li>
            <li class="center-align">
                <div class="collapsible-header" style="text-align: left;"><i class="fa fa-braille" aria-hidden="true"></i>Carrito</div>
                <c:choose>
                    <c:when test="${not empty sessionScope.Carrito}">                
                        <c:forEach items="${sessionScope.Carrito}" var="juego">
                            <div>${juego.getNombre()} - ${juego.getPrecio()}</div>
                        </c:forEach>
                            <a class="waves-effect waves-light btn" href="#" onclick="purchase()">Comprar</a>
                    </c:when>
                </c:choose>
            </li>
        </ul>
    </div>
    <div class="col s9">
        <div class="slider">
            <ul class="slides">
                <li>
                    <img src="images/caratulas/Call-of-Duty-Black-Ops-III.jpg"> <!-- random image -->
                    <div class="caption center-align">
                        <h3>This is our big Tagline!</h3>
                        <h5 class="light grey-text text-lighten-3">Here's our small slogan.</h5>
                    </div>
                </li>
                <li>
                    <img src="images/caratulas/wowlegion.jpg"> <!-- random image -->
                    <div class="caption left-align">
                        <h3>Left Aligned Caption</h3>
                        <h5 class="light grey-text text-lighten-3">Here's our small slogan.</h5>
                    </div>
                </li>
                <li>
                    <img src="/images/caratulas/Call-of-Duty-Black-Ops-III"> <!-- random image -->
                    <div class="caption right-align">
                        <h3>Right Aligned Caption</h3>
                        <h5 class="light grey-text text-lighten-3">Here's our small slogan.</h5>
                    </div>
                </li>
                <li>
                    <img src="/images/caratulas/Call-of-Duty-Black-Ops-III"> <!-- random image -->
                    <div class="caption center-align">
                        <h3>This is our big Tagline!</h3>
                        <h5 class="light grey-text text-lighten-3">Here's our small slogan.</h5>
                    </div>
                </li>
            </ul>
        </div>
        <!-- Modal Structure -->
        <c:if test="${!empty productos}">
            <div id="modal1" class="modal modal-fixed-footer">
                <div class="modal-content">
                    <div class="row">
                        <h5 id="nombre-producto-modal" class="col s12"></h5>
                        <div  class="col s4"> <img src="" alt="Norway" id="imagenItem"></div>
                        <input type="hidden" id="input-id" value=""/>
                        <div class="col s8" id="descripcion">
                            <h6>Detalle:</h6>
                            <p id="detalle-producto-modal"></p>
                            <h6>Precio:</h6>
                            <p id="precio-producto-modal"></p>
                            <h6>Plataforma:</h6>
                            <p id="plataforma-producto-modal"></p>
                            <h6>Categoria:</h6>
                            <p id="categoria-producto-modal"></p>
                        </div>
                    </div>
                </div>
                <div class="modal-footer">
                    <c:choose>
                        <c:when test="${not empty sessionScope.Nombre}">                
                            <a class="waves-effect waves-light btn" onclick="addToCar()"><i class="fa fa-shopping-cart"></i>A�adir al carrito</a>
                        </c:when>
                    </c:choose>                    
                    <a class="waves-effect waves-light btn" id="botonCancelar"></i>Cancelar</a>
                </div>
            </div>
            <div class="row">
                <div style="margin-right:10%; margin-left: 10%"> 
                    <c:forEach items="${productos}" var="pro">
                        <div style="float: left;" class="itemProducto" class="center-align">
                            <img src="${pro.getImagen()}" alt="Norway" id="imagenItem">
                            <div style="text-align:center;" class="container">
                                <h5>${pro.getPrecio()}</h5>
                                <p class="p-description">${pro.getNombre()}</p>
                                <p>${pro.getNameCategoria()}</p>
                                <p>${pro.getNamePlataforma()}</p>
                                <!-- Modal Trigger -->
                                <a class="waves-effect waves-light btn modal-trigger" href="#modal1" onclick="cargarDatosModal('${pro.getId()}', '${pro.getNombre()}', '${pro.getDetalle()}', '${pro.getImagen()}', '${pro.getPrecio()}', '${pro.getNameCategoria()}', '${pro.getNamePlataforma()}')">Detalles</a>
                            </div>
                        </div>
                    </c:forEach>
                </div>                
            </div>

        </c:if>
        <div style="width:300px" id="modal2" class="modal">
            <div class="modal-content">
                <div class="row">
                    <div class="input-field col s12">
                        <input type="text" id="usuario-login"/>
                        <label for="usuario-login">Usuario:</label>
                    </div> 
                </div>
                <div class="row">
                    <div class="input-field col s12">
                        <input type="password" id="contrasena-login"/>
                        <label for="contrasena-login">Contrase�a:</label>
                    </div>
                </div>
                <div class="modal-footer center-align">
                    <button class="waves-effect waves-light center btn cyan" style="float:none" type="submit" onclick="enter()">Entrar</button>
                </div>
            </div>
        </div>
    </div>
</div>
<%@ include file="footer.jsp" %>