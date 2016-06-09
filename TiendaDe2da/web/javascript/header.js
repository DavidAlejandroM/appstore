$(document).ready(function () {
    $('.collapsible').collapsible({
        accordion: false // A setting that changes the collapsible behavior to expandable instead of the default accordion style
    });
    $('select').material_select();
    $.ajax({
        method: "GET",
        url: "./getGame",
        data: "",
        success: function (response)
        {
            console.log("va por ajax cat")
            llenarCategoria(response, 'listadoCat');
        }
    });
    $('.listadoCat').click(function () {
        var textoFiltro = $(this);

        console.log(textoFiltro);

   
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
}
/*Metodo para llenar la barra de categoria, plataforma*/


function llenarCategoria(cat, id) {
    var cad = "";
    for (var i = 0; i < cat.length; i++)
    {
      //  cad = cad + "<div class='collapsible-body'><p>XBOX</p></div>"
       cad = cad + "<a class = 'waves-effect waves-red btn btnCat' onclick= 'FiltrarCategoria('"+cat[i].id+"')'>" + cat[i].nombre + "</a><br>";
    }
    console.log(cad);
    document.getElementById(id).innerHTML = cad;
}


function FiltrarCategoria(nombre) {
  console.log("entro filtro " + nombre);
  /*  
             if (!$(this).hasClass(nombre)) {
                console.log("paso por aqui");
                $(this).fadeOut('slow').removeClass('hidden');
            } else {
                console.log("paso por aqui2");
                $(this).fadeIn('slow').addClass('hidden');
            }*/
    /*
     
     });*/
}



