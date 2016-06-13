$(document).ready(function () {
    $('.collapsible').collapsible({
        accordion: false // A setting that changes the collapsible behavior to expandable instead of the default accordion style
    });
    $('select').material_select();

<<<<<<< HEAD
    $.ajax({
        method: "GET",
        url: "./getCategoriaGame",
        data: "",
        success: function (response)
        {
            console.log("va por ajax cat")
            llenarCategoria(response, 'listadoCat');
        }
    });
    $.ajax({
        method: "GET",
        url: "./getPlataformaGame",
        data: "",
        success: function (response)
        {

            llenarPlataforma(response, 'listadoPlat');
            console.log("entro cargar juego");
        }

    });
=======
    $('.slider').slider({full_width: true});
>>>>>>> refs/remotes/origin/esteban
});

function cargarDatosModal(id, nombre, detalle, imagen, precio, categoria, plataforma) {
    document.getElementById('nombre-producto-modal').innerHTML = nombre;
    document.getElementById('detalle-producto-modal').innerHTML = detalle;
    document.getElementById('precio-producto-modal').innerHTML = precio;
    document.getElementById('plataforma-producto-modal').innerHTML = plataforma;
    document.getElementById('categoria-producto-modal').innerHTML = categoria;
    document.getElementById('input-id').setAttribute("value", id);
    document.getElementById('imagenItem').setAttribute("src", imagen);
<<<<<<< HEAD

/*Metodo para llenar la barra de categoria, plataforma*/
=======
}
>>>>>>> refs/remotes/origin/esteban

function registrarUsuario() {
    var nombre = $('#nombre_usuario-registro').val();
    var apellido = $('#apellido_usuario-registro').val();
    var correo = $('#correo-registro').val();
    var telefono = $('#telefono-registro').val();
    var usuario = $('#usuario-registro').val();
    var contrasena = $('#contrasena-registro').val();
    var recontrasena = $('#repeat-contrasena').val();

    $.ajax({
        method: "POST",
        url: "./saveUser",
        data: {nom: nombre, ape: apellido, corr: correo, tel: telefono, usr: usuario, pass: contrasena, repass: recontrasena},
        success: function (response) {
            if (response == "yes") {
                alert('Usuario guardado con exito')
                $('#nombre_usuario-registro').val("");
                $('#apellido_usuario-registro').val("");
                $('#correo-registro').val("");
                $('#telefono-registro').val("");
                $('#usuario-registro').val("");
                $('#contrasena-registro').val("");
                $('#repeat-contrasena').val("");

            } else {
                alert('Las contraseñas no coinciden')
                $('#contrasena-registro').val("");
                $('#repeat-contrasena').val("");
            }
        }
    });

}

function enter() {
    var usuario = $('#usuario-login').val();
    var pass = $('#contrasena-login').val();
    $.ajax({
        method: "POST",
        url: "./loginUser",
        data: {user: usuario, pass: pass},
        success: function (response) {
            if (response == "no") {
                alert("Usuario o contraseña incorrectos");
            } else {
                location.reload();
            }
        }
    });
}

function logout() {
    $.ajax({
        method: "POST",
        url: "./logoutUser",
        data: {},
        success: function (response) {
            if (response === "yes") {
                location.reload();
            }
        }
    });
}

function addToCar() {
    var id = $('#input-id').val();
    var nombre = $('#nombre-producto-modal').text();
    var precio = $('#precio-producto-modal').text();
    $.ajax({
        method: "POST",
        url: "./AddGameToCar",
        data: {id: id, nom: nombre, prec: precio},
        success: function (response) {
            if (response === "yes") {
                alert('Añadido')
                location.reload();
            }
        }
    });

}

function purchase() {
    confirmar = confirm("¿Desea comprar los productos en su carrito?");
    if (confirmar)
        $.ajax({
        method: "POST",
        url: "./PurchaseGame",
        data: {},
        success: function (response) {
            if (response === "yes") {
                alert('Compra realizada con exito.')
                location.reload();
            }
        }
<<<<<<< HEAD
    }
    $("." + className).show();

}}
=======
    });
    else
    return;
}
>>>>>>> refs/remotes/origin/esteban





