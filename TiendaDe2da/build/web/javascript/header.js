$(document).ready(function () {
    $('.collapsible').collapsible({
        accordion: false // A setting that changes the collapsible behavior to expandable instead of the default accordion style
    });
    $('select').material_select();
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

