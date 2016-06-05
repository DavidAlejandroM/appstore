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
                <div class="collapsible-header"><i class="fa fa-info" aria-hidden="true"></i>Categoría</div>

                <div class="collapsible-body"><p>Aventura</p></div>
                <div class="collapsible-body"><p>Defensa</p></div>
                <div class="collapsible-body"><p>Música</p></div>
            </li>
            <li>
                <div class="collapsible-header"><i class="fa fa-braille" aria-hidden="true"></i>Plataforma</div>

                <div class="collapsible-body"><p>XBOX</p></div>
                <div class="collapsible-body"><p>PC</p></div>
                <div class="collapsible-body"><p>PS4</p></div>
            </li>
            <li>
                <div class="collapsible-header"><i class="fa fa-shopping-cart"></i>Compra</div>

            </li>
        </ul>
    </div>
    <div class="col s9">
        <div class="row">
            <div id="fotoGrande" class="col s12">
                <img src="" id="imagenBig">
            </div>
        </div>

        <!-- Modal Structure -->
        <c:if test="${!empty productos}">
            <div id="modal1" class="modal modal-fixed-footer">
                <div class="modal-content">
                    <div class="row">
                        <h5 id="nombre-producto-modal" class="col s12"></h5>
                        <div  class="col s4"> <img src="" alt="Norway" id="imagenItem"> </div>
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
                    <a class="waves-effect waves-light btn"><i class="fa fa-shopping-cart"></i>Comprar</a>
                    <a class="waves-effect waves-light btn" id="botonCancelar"></i>Cancelar</a>
                </div>
            </div>
            <div class="row">
                <div style="margin-right:10%; margin-left: 10%"> 
                    <c:forEach items="${productos}" var="pro">
                    <div style="float: left;" class="itemProducto">
                        <img src="${pro.getImagen()}" alt="Norway" id="imagenItem">
                        <div style="text-align:center;" class="container">
                            <h5>${pro.getPrecio()}</h5>
                            <p class="p-description">${pro.getNombre()}</p>
                            <p>${pro.getNameCategoria()}</p>
                            <p>${pro.getNamePlataforma()}</p>
                            <!-- Modal Trigger -->
                            <a class="waves-effect waves-light btn modal-trigger" href="#modal1" onclick="cargarDatosModal('${pro.getId()}','${pro.getNombre()}','${pro.getDetalle()}','${pro.getImagen()}','${pro.getPrecio()}','${pro.getNameCategoria()}','${pro.getNamePlataforma()}')">Comprar</a>
                        </div>
                    </div>
                </c:forEach>
                </div>                
            </div>

        </c:if>

    </div>
</div>
<%@ include file="footer.jsp" %>