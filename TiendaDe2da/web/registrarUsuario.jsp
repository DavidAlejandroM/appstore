<%-- 
    Document   : inicio
    Created on : 23/05/2016, 10:13:58 PM
    Author     : HP VPRO
--%>

<%@ include file="header.jsp" %>
    <div id="formAddUser">
                <div class="row col s6 offset-s4">
                    <h3 id="titleH3">REGISTRO</h3>

                </div>

                <div class="row col s12 divider"></div>

                <div class="row">
                    <div class="col s6 offset-s3">
                        <div class="row">
                            <div class="input-field col s12">
                                <input id="nombre_usuario" type="text" class="validate">
                                <label for="nombre_usuario">Nombre</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input id="apellido_usuario" type="text" class="validate">
                                <label for="apellido_usuario">Apellido</label>
                            </div>
                        </div>

                        <div class="row">
                            <div class="input-field col s12">
                                <input id="correo" type="text" class="validate">
                                <label for="correo">Correo Electronico</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s6">
                                <input id="pais" type="text" class="validate">
                                <label for="pais">Pais</label>
                            </div>
                            <div class="input-field col s6">
                                <input id="ciudad" type="text" class="validate">
                                <label for="ciudad">Ciudad</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input id="direccion" type="text" class="validate">
                                <label for="direccion">Dirección</label>
                            </div>

                        </div>
                        <div class="row">
                            <div class="col s2 offset-s6">
                                <a class="waves-effect waves-light btn">Guardar</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>


<%@ include file="footer.jsp" %>
