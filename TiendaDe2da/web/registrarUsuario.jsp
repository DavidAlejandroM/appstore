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
                                <input id="nombre_usuario-registro" type="text" class="validate" required/>
                                <label for="nombre_usuario">*Nombre</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input id="apellido_usuario-registro" type="text" class="validate" required />
                                <label for="apellido_usuario">*Apellido</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input id="correo-registro" type="email" class="validate"/>
                                <label for="correo">Correo Electronico</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input id="telefono-registro" type="text" class="validate"/>
                                <label for="telefono">Teléfono</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input id="usuario-registro" type="text" class="validate" required/>
                                <label for="usuario-registro">*Usuario</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input id="contrasena-registro" type="password" class="validate" required/>
                                <label for="contrasena-registro">*Contraseña</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input id="repeat-contrasena" type="password" class="validate" required/>
                                <label for="repeat-contrasena">*Repetir contraseña</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col s2 offset-s6">
                                <a class="waves-effect waves-light btn" onclick="registrarUsuario()">Guardar</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
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
                        <input type="password" id="contraseña-login"/>
                        <label for="contraseña-login">Contraseña:</label>
                    </div>
                </div>
                <div class="modal-footer center-align">
                    <button class="waves-effect waves-light center btn cyan" style="float:none" type="submit" onclick="enter()">Entrar</button>
                </div>
            </div>
        </div>

<%@ include file="footer.jsp" %>
