 $(document).ready(function(){
    $('.collapsible').collapsible({
      accordion : false // A setting that changes the collapsible behavior to expandable instead of the default accordion style
    });
    $('select').material_select();
  });
  
function cargarDatosModal(id,nombre,detalle,imagen,precio,categoria,plataforma){
    alert(imagen)
    document.getElementById('nombre-producto-modal').innerHTML= nombre;
    document.getElementById('detalle-producto-modal').innerHTML= detalle;
    document.getElementById('precio-producto-modal').innerHTML= precio;
    document.getElementById('plataforma-producto-modal').innerHTML= plataforma;
    document.getElementById('categoria-producto-modal').innerHTML= categoria;
    document.getElementById('imagenItem').setAttribute("src",imagen);
}
            
