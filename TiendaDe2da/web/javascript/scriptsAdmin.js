/*FUNCION QUE DA FORMATO DE MONEDA EN PESOS*/
function formatoMoneda(num)
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
        document.getElementById("precio_game").value = aux2;
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

        document.getElementById("precio_game").value = aux;
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

}

$(document).ready(function() {
    $('.tableItemUpdate').click(function() {
        console.log(this.id);
    });
});

$(document).ready(function() {
    $('.tableItemDelete').click(function() {
        console.log(this.id);
    });
});

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
    location.reload();
} 
