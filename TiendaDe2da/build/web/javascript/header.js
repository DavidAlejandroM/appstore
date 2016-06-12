$(document).ready(function () {
    $('.collapsible').collapsible({
        accordion: false // A setting that changes the collapsible behavior to expandable instead of the default accordion style
    });
    $('select').material_select();
<<<<<<< HEAD
    $('li.listado div p a').click(function () {
        var textoFiltro = $(this).text().toLowerCase().replace(/\s/g, "-");
        var textSelect = $(this).text();
        console.log(textoFiltro);
        console.log(textSelect);
        $('.item div').each(function () {
            if (!$(this).hasClass(textoFiltro)) {
                console.log("paso por aqui");
                $(this).fadeOut('slow').removeClass('hidden');
            } else {
                  console.log("paso por aqui2");
                $(this).text().fadeIn('slow').addClass('hidden');

            }
            return false;
        });

=======
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
>>>>>>> refs/remotes/origin/alejandro
    });
});

function cargarDatosModal(id, nombre, detalle, imagen, precio, categoria, plataforma) {
    alert(imagen)
    document.getElementById('nombre-producto-modal').innerHTML = nombre;
    document.getElementById('detalle-producto-modal').innerHTML = detalle;
    document.getElementById('precio-producto-modal').innerHTML = precio;
    document.getElementById('plataforma-producto-modal').innerHTML = plataforma;
    document.getElementById('categoria-producto-modal').innerHTML = categoria;
    document.getElementById('imagenItem').setAttribute("src", imagen);
<<<<<<< HEAD
=======
}
/*Metodo para llenar la barra de categoria, plataforma*/


function llenarCategoria(cat, id) {
    var cad = "";
    tamCategoria = cat.length;
    for (var i = 0; i < cat.length; i++)
    {
        cad = cad + "<a class = 'waves-effect waves-red btn btnCat' onclick= \u0022 FiltrarCategoria('" + cat[i].id + "')\u0022>" + cat[i].nombre + "</a><br>";
    }
    cad = cad + "<a class = 'waves-effect waves-red btn btnCat' onclick= \u0022 FiltrarCategoria('0')\u0022>TODOS</a><br>"

    document.getElementById(id).innerHTML = cad;
}
function llenarPlataforma(plat, id) {
    console.log("entro llenar plaforma");
    var cad = "";
    tamPlataforma = plat.length;
    for (var i = 0; i < plat.length; i++) {
        cad = cad + "<a class = 'waves-effect waves-red btn btnPlat' onclick= \u0022 FiltrarPlataforma('" + plat[i].id + "')\u0022>" + plat[i].nombre + "</a><br>";

    }
    cad = cad + "<a class = 'waves-effect waves-red btn btnPlat' onclick= \u0022 FiltrarPlataforma('0')\u0022>TODOS</a><br>"
    document.getElementById(id).innerHTML = cad;

}
var tamCategoria = 0;
var tamPlataforma = 0;

function FiltrarCategoria(id) {
    var className = "itemCategoria" + id;
    console.log("itemCategoria" + id);

    for (var i = 1; i <= tamCategoria; i++)
    {
        if (id === '0') {
            $(".itemCategoria" + i).show();
        } else {
            $(".itemCategoria" + i).hide();
        }
    }
    $("." + className).show();
}

function FiltrarPlataforma(id) {
    var className = "itemPlataforma" + id;
    console.log("itemPlataforma" + id);
    console.log(tamPlataforma);
    for (var i = 1; i <= tamPlataforma; i++)
    {
        if (id === '0') {
            $(".itemPlataforma" + i).show();
        } else {
            $(".itemPlataforma" + i).hide();
        }
    }
    $("." + className).show();
>>>>>>> refs/remotes/origin/alejandro
}

