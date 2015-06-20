//Capturamos el Contexto de la Aplicacion
function getContextPath() {
   return window.location.pathname.substring(0, window.location.pathname.indexOf("/",2))+"/";
}
//alert(getContextPath());

//Funciones para el LLenado de Componentes
function fillSelect(id,data){
	var element = $("#"+id);
	var html = "";
	for(var i=0;i<data.length;i++){
		html+="<option value='"+data[i].value+"' "+(data.selected?'selected':'')+">"+data[i].label+"</option>";
	}
	element.append(html);
}