var paginaActual;

$(document).ready(function() {
	/*
    console.log(paginaActual);
    switch (paginaActual) {
	case "usuarioListar": cargarUsuarioListar(); break;
	case "usuarioRegistrar": cargarUsuarioRegistrar(); break;
	case "usuarioActualizar": cargarUsuarioActualizar(); break;
	}*/
});

/*
$(window).load(function() {
    alert("Adios");
});
*/

//UsuarioListar
function cargarUsuarioListar(){
	//Cargamos el Combo
	$.post(getContextPath()+'UsuarioServlet',
 		   { control: 'lcomboUsuarios' },
 			function(result) {
 			  console.log("viene: "+result);
 			  var myobj = JSON.parse(result);
 			  console.log("parseado: "+myobj);
 			  var a = [{at:"junior"},{at:"gaby"}];
 			  console.log(a);
 			  fillSelect("cboEtiquetas",myobj);
 		   }
	    );
}
//UsuarioRegistrar
function cargarUsuarioRegistrar(){
	
}
//UsuarioActualizar
function cargarUsuarioActualizar(){
	
}
