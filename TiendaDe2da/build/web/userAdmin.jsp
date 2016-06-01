<%-- 
    Document   : userAdmin
    Created on : 27/05/2016, 07:52:38 AM
    Author     : HP VPRO
--%>
<%@ include file="header.jsp" %>
           <div id="formLoguin">
                <div class="row col s8 offset-s3">
                    <h3>INICIO SESIÓN ADMIN</h3>
                </div>

                <div class="row col s12 divider"></div>

                <div class="row">
                    <div class="input-field col s6 offset-s3">
                        <input id="usuario_admin" type="text" class="validate">
                        <label for="usuario_admin">Usuario</label>
                    </div>

                </div>
                <div class="row">
                    <div class="input-field col s6 offset-s3">
                        <input id="contraseña_admin" type="password" class="validate">
                        <label for="contraseña_admin">Contraseña</label>
                    </div>

                </div>
                <div class="row">
                    <div class="col s2 offset-s5">
                        <a class="waves-effect waves-light btn" href="./admin">Ingresar</a>
                    </div>
                </div>

            </div>
<%@ include file="footer.jsp" %>