<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

	<!-- META -->
	<title>Healthy Kids - Ni�os Saludables solo con nosotros :D</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0"/>
	<meta name="description" content="" />

	<!-- CSS --> 
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/normalize.css" media="all" />
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/kickstart.css" media="all" />
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/jquery.dataTables.css" media="all" />
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css" media="all" />
		
	<!-- Javascript -->
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/kickstart.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery.dataTables.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/javascript.js"></script>
	<script type="text/javascript">
		$(document).ready(function() {
			$('#tblMPerfilListar').DataTable({
				"scrollY":        "400px",
		        "scrollCollapse": true,
		        "paging":         false
			});
			
			$( "#btnPerfilEliminar" ).click(function() {
				var perfilesEliminar="";
				$("#tblMPerfilListar input[type='checkbox']").each(function(index, value) { 
					if(value.checked){
						perfilesEliminar+=value.dataset.perfilid+",";
					}
				});
				$("#txtPerfilesEliminar").val(perfilesEliminar.substring(0, perfilesEliminar.length-1));
			});
			
		});
	</script>
	
</head>
<body>
	<form name="frmPerfilListar">
		<div class="base">
			
			<div class="cabecera">
				<h5><fmt:message key="mp_title_list" /></h5>
				<fmt:message key="g_searchfor" />: 
				<select id="cboBusqueda" name="cboBusqueda">
					<option value='0' selected ><fmt:message key="tb_profile_description" /></option>
				</select>
				<input id="txtBusqueda" name="txtBusqueda" type="text">
				<button type="submit" class="medium" formmethod="post" formaction="${pageContext.request.contextPath}/PerfilServlet?accion=listar"><fmt:message key="g_search" /></button>
				<hr>
			</div>
			
			<div class="cuerpo">
				<table id="tblMPerfilListar" class="display" cellspacing="0" width="100%">
				    <thead>
				        <tr>
				            <th><fmt:message key="tb_profile_description" /></th>
				            <th><fmt:message key="tb_profile_estate" /></th>
				            <th><fmt:message key="g_actions" /></th>
				        </tr>
				    </thead>
				    <tbody>
						<c:forEach var="perfil" items="${listPerfil}">
							<tr>
					            <td><a href="${pageContext.request.contextPath}/PerfilServlet?carga=cargarActualizar&profileId=${perfil.perfilId}" target="body">${perfil.descripcion}</a></td>
								<td>${perfil.estado}</td>
								<td><input type="checkbox" data-perfilid="${perfil.perfilId}" /></td>
					        </tr>
						</c:forEach>
					</tbody>
				</table>
				<input id="txtPerfilesEliminar" name="txtPerfilesEliminar" type="hidden">
			</div>
			
			<div class="pie">
				<hr>
				<button type="submit" class="medium" formmethod="post" formaction="${pageContext.request.contextPath}/PerfilServlet?carga=cargarInsertar"><fmt:message key="g_add" /></button>
				<button id="btnPerfilEliminar" type="submit" class="medium" formmethod="post" formaction="${pageContext.request.contextPath}/PerfilServlet?accion=eliminar"><fmt:message key="g_delete" /></button>
			</div>	
		</div>
	</form>
</body>
</html>