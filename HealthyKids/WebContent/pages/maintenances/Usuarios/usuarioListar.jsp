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
			$('#tblMUsuarioListar').DataTable({
				"lengthMenu": [[10], [10]]
			});
		});
	</script>
	
</head>
<body>
	<form name="frmUsuarioListar">
		<div class="base">
			
			<div class="cabecera">
				<h5><fmt:message key="mu_title_list" /></h5>
				<fmt:message key="g_searchfor" />: 
				<select id="cboBusqueda" name="cboBusqueda">
					<option value='0' selected ><fmt:message key="tb_user_name" /></option>
					<option value='1'><fmt:message key="tb_user_lastname" /></option>
					<option value='2'><fmt:message key="tb_user_user" /></option>
				</select>
				<input id="txtBusqueda" name="txtBusqueda" type="text">
				<button type="submit" class="medium" formmethod="post" formaction="${pageContext.request.contextPath}/UsuarioServlet?accion=listar"><fmt:message key="g_search" /></button>
				<hr>
			</div>
			
			<div class="cuerpo">
				<table id="tblMUsuarioListar" class="display" cellspacing="0" width="100%">
				    <thead>
				        <tr>
				            <th><fmt:message key="tb_user_name" /></th>
				            <th><fmt:message key="tb_user_lastname" /></th>
				            <th><fmt:message key="tb_user_dateofbirth" /></th>
				            <th><fmt:message key="tb_user_dateofadmission" /></th>
				            <th><fmt:message key="tb_user_user" /></th>
				            <th><fmt:message key="tb_user_phone" /></th>
				            <th><fmt:message key="tb_user_email" /></th>
				        </tr>
				    </thead>
				    <tbody>
						<c:forEach var="usuario" items="${listUsuario}">
							<tr>
					            <td><a href="${pageContext.request.contextPath}/UsuarioServlet?carga=cargarActualizar&usuarioId=${usuario.usuarioId}" target="body">${usuario.nombre}</a></td>
								<td>${usuario.apellido}</td>
								<td>${usuario.fechaNacimiento}</td>
								<td>${usuario.fechaIngreso}</td>
								<td>${usuario.usuario}</td>
								<td>${usuario.telefono}</td>
								<td>${usuario.email}</td>
					        </tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
			
			<div class="pie">
				<hr>
				<button type="submit" class="medium" formmethod="post" formaction="${pageContext.request.contextPath}/UsuarioServlet?carga=cargarInsertar"><fmt:message key="g_add" /></button>
			</div>	
		</div>
	</form>
</body>
</html>