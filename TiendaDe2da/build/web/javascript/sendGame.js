function guardarJuego(){
    var categoria = document.getElementById('select_categoria').value;
    var plataforma = document.getElementById('select_plataforma').value;
    var precio = document.getElementById('precio_game').value;
    var nombre = document.getElementById('nombre_game').value;
    var imagen = document.getElementById('pathImagen').value;
    var descripcion= document.getElementById('text_area_descripcion').value;
    $.ajax({
  method: "POST",
  url: "./saveGame",
  data: { cat : categoria, plat: plataforma, prec: precio, nom: nombre, img: imagen, des: descripcion },
  succes : function(response){
      alert(response);
  } 
});
} 


