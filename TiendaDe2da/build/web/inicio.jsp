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
        <div id="modal1" class="modal modal-fixed-footer">
            <div class="modal-content">
                <div class="row">
                <h5 class="col s12">LOL</h5>
                <div  class="col s4" id="imagenDescripcion"> <img src="images/caratulas/Call-of-Duty-Black-Ops-III.jpg" alt="Norway" id="imagenItem"> </div>
                <div class="col s8" id="descripcion">
                    <h6>Descripción:</h6>
                    <p>What are material icons?
                        Material design system icons are simple, modern, 
                        friendly, and sometimes quirky. Each icon is created 
                        using our design guidelines to depict in simple and minimal
                        <br>Precio: $50.000
                    </p>
                    <div class="input-field col s6">
                        <input id="cantidad" type="number" class="validate">
                        <label for="cantidad" id="cantidad">Cantidad</label>
                    </div>
                </div>
                </div>
            </div>
            <div class="modal-footer">
                <a class="waves-effect waves-light btn"><i class="fa fa-shopping-cart"></i>Comprar</a>
                <a class="waves-effect waves-light btn" id="botonCancelar"></i>Cancelar</a>
            </div>
        </div>
        <div class="row">
            <div class="itemProducto col s4">
                <img src="images/caratulas/wowlegion.jpg" alt="Norway" id="imagenItem">
                <div class="container">
                    <p><h5>$ 500.000</h5></p>
                    <p>Moto G 3ra Gen.</p>
                    <!-- Modal Trigger -->
                    <a class="waves-effect waves-light btn modal-trigger" href="#modal1">Comprar</a>
                </div>
            </div>
            <div class="itemProducto col s4">
                <img src="images/caratulas/wowlegion.jpg" alt="Norway" id="imagenItem">
                <div class="container">
                    <p><h5>$ 500.000</h5></p>
                    <p>Moto G 3ra Gen.</p>
                    <!-- Modal Trigger -->
                    <a class="waves-effect waves-light btn modal-trigger" href="#modal1">Comprar</a>

                </div>
            </div>
            <div class="itemProducto col s4">
                <img src="images/caratulas/Call-of-Duty-Black-Ops-III.jpg" alt="Norway" id="imagenItem">
                <div class="container">
                    <p><h5>$ 500.000</h5></p>
                    <p>Moto G 3ra Gen.</p>
                    <!-- Modal Trigger -->
                    <a class="waves-effect waves-light btn modal-trigger" href="#modal1">Comprar</a>

                </div>
            </div>
        </div>
    </div>
</div>
<%@ include file="footer.jsp" %>