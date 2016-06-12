/**
 * Array con las imagenes que se iran mostrando en la web
 */
var imagenes=new Array(
    'images/caratulas/Call-of-Duty-Black-Ops-III.jpg',
    'images/caratulas/wowlegion.jpg'
);

/**
 * Funcion para cambiar la imagen
 */
function rotarImagenes()
{
    // obtenemos un numero aleatorio entre 0 y la cantidad de imagenes que hay
    var index = Math.floor((Math.random()*imagenes.length));
    console.log("entro rotar");

    // cambiamos la imagen
    document.getElementById("imagenBig").src=imagenes[index];
}

/**
 * Función que se ejecuta una vez cargada la página
 */
window.onload=function()
{
    
    // Cargamos una imagen aleatoria
    rotarImagenes();

    // Indicamos que cada 5 segundos cambie la imagen
    setInterval(rotarImagenes,5000);
};


  $(document).ready(function(){
    // the "href" attribute of .modal-trigger must specify the modal ID that wants to be triggered
    $('.modal-trigger').leanModal();
  });

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
    document.getElementById(id).style.display = "block";

}


