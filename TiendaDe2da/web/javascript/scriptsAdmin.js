/*FUNCION QUE DA FORMATO DE MONEDA EN PESOS*/
/* global Materialize */

function formatoMoneda(num,idPrecio)
{
    num = quitarCaracter(num,".");
    num = quitarCaracter(num,"|");
    num = quitarCaracter(num," ");

    var numsplit;
    var aux;
    var contador;

    if (!isNaN(num)){
        numsplit = num.toString();
        numsplit = numsplit.split("");
        aux = "";
        contador = 0;
        for(var i = numsplit.length; i>=1;i--)
        {
            if( contador == 3)
            {
                aux = aux + ".";
                contador = 1;
            }
            else
            {
                contador = contador+1;
            }

            aux = aux + numsplit[i-1];

        }

        var numsplit2 = aux.split("");

        var aux2 = "$  ";
        for(var i = numsplit2.length; i>=1;i--)
        {
            aux2 = aux2.concat(numsplit2[i-1]);
        }
        //console.log("entro al if "+aux2)
        document.getElementById(idPrecio).value = aux2;
    }
    else
    {
        aux = "$  ";
        numsplit = num.toString();
        numsplit = numsplit.split("");
        //console.log("entro al else "+numsplit);
        for(var i = 0 ; i < numsplit.length ; i++ )
        {
            if (!isNaN(numsplit[i]))
            {
                aux = aux+numsplit[i];
            }
        }

        document.getElementById(idPrecio).value = aux;
    }


}
/*ELIMINA UN CARACTER ESPECIFICO DE UNA CADENA*/
function quitarCaracter(cadena,caracter)
{
    var aux = "";
    var numsplit = cadena.toString();
    numsplit = numsplit.split("");

    for(var i = 0 ; i < numsplit.length ; i++ )
    {
        if (numsplit[i] != caracter)
        {
            aux = aux+numsplit[i];
        }
    }

    return aux;

}

function mostrarImagenMiniatura(idImagen, idPath)
{
    var value = document.getElementById(idPath).value;
    console.log("mostrar    "+ value);
    var pathCaratulas = "images/caratulas/";

    document.getElementById(idImagen).src = pathCaratulas + value;

    Materialize.fadeInImage("#"+idImagen);
}

function showDiv(id)
{
    hiddenDivs();
    document.getElementById(id).style.display = "block";

}

function hiddenDivs()
{
    document.getElementById('formListar').style.display = "none";
    document.getElementById('formAddGame').style.display = "none";
    document.getElementById('formListarEliminar').style.display = "none";
    document.getElementById('formUpdateGame').style.display = "none";

}

$(document).ready(function() {
    $('.tableItemUpdate').click(function() {
        hiddenDivs();
        showDiv('formUpdateGame');
        var juego = obtenerJuego(this.id);
    });
});


$(document).ready(function()
{
    
    $.ajax({
        method: "GET",
        url: "./getGame",
        data: "",
        success : function(response)
        {
         
             llenarSelect(response,'select_categoria');
             llenarSelect(response,'select_categoriaU');
            
        } 
    });
    $.ajax({
        method: "GET",
        url: "./getPlataformaGame",
        data: "",
        success : function(response)
        {
             llenarSelect(response,'select_plataforma');
             llenarSelect(response,'select_plataformaU');
             console.log("entro cargar juego");
        } 
    });
   
});


function llenarSelect(cat,id)
{
    var str = "<option value='0' disabled selected>Elija una opci\u00F3n</option>";
    var uno = "<option value='";
    var dos = "'>";
    var tres = "</option>"

    for(var i=0;i<cat.length;i++)
    {
        str = str + uno + cat[i].id + dos + cat[i].nombre + tres;
    }

   // document.getElementById(id).innerHTML = str;
    $('#'+id).material_select();
}


function eliminar(id,nombre)
{
        if(confirm("¿Desea eliminar " + nombre + "para siemrpe?"))
        {
            $.ajax({
            method: "POST",
            url: "./deleteGame",
            data: {id: id},
            success : 
                    function(response)
                    {
                        if(response == "yes")
                        {
                            location.reload();
                        }
                        //alert(response);
                    } 
        });
        }
        else
        {
            
        }
}

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
        data: { cat : categoria, plat: plataforma, prec: precio, nom: nombre, img: "images/caratulas/"+imagen, des: descripcion},
        success : function(response){
            alert(response);
        } 
});
    alert("El Juego "+nombre+" se ah guardad\u00F3 exitosamente");
    location.reload();
} 

function obtenerJuego(id){
 
    $.ajax({
  method: "POST",
  url: "./getGame",
  data: { id : id },
  success : function(response){
      
      llenarForUpdate(response);
  } 
});
    //location.reload();
    
} 

function actualizarJuego(){
    var id = document.getElementById('idJuego').innerHTML;
    var categoria = document.getElementById('select_categoriaU').value;
    var plataforma = document.getElementById('select_plataformaU').value;
    var precio = document.getElementById('precio_gameU').value;
    var nombre = document.getElementById('nombre_gameU').value;
    var imagen = document.getElementById('pathImagenU').value;
    var descripcion= document.getElementById('text_area_descripcionU').value;
    $.ajax({
  method: "POST",
  url: "./updateGame",
  data: { cat : categoria, plat: plataforma, prec: precio, nom: nombre, img: "images/caratulas/"+imagen, des: descripcion, id: id  },
  success : function(response){
      if(response == "yes")
      {
        alert("El Juego "+nombre+" se guard\u00F3 exitosamente");
        location.reload();
      }  
  } 
});
   
}

function llenarForUpdate(dato)
{   
    //$('#select_categoriaU option[value="1"]').attr("selected", "selected");
    
    document.getElementById('select_categoriaU').value = dato.categoria
    document.getElementById('select_plataformaU').value = dato.plataforma;
    $('#select_categoriaU').material_select();
    $('#select_plataformaU').material_select();
    
    document.getElementById('idJuego').innerHTML = dato.id;
    document.getElementById('nombre_gameU').value = dato.nombre;
    document.getElementById('precio_gameU').value = dato.precio;
    document.getElementById('pathImagenU').value = dato.imagen.replace("images/caratulas/", "");;
    document.getElementById('text_area_descripcionU').value = dato.detalle;
    
    document.getElementById('caratulaU').src = dato.imagen;
    Materialize.fadeInImage('#caratulaU');
    
}

