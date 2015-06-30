<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

	<!-- META -->
	<title>Healthy Kids - Niños Saludables solo con nosotros :D</title>
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
				"lengthMenu": [[5, 10], [5, 10]]
			});
		});
	</script>
	
</head>
<body>
	<form name="frmUsuarioInsertar">
		<div class="base">
			
			<div class="cabecera">
				<h5><fmt:message key="mu_title_insert" /></h5>
				<hr>
			</div>
		
			<div class="cuerpo">
				<fieldset> 				
					<legend>Formulario</legend>
				</fieldset>
			</div>
			
			<div class="pie">
				<hr>
				<button type="submit" class="medium" formmethod="post" formaction="${pageContext.request.contextPath}/UsuarioServlet?carga=cargarInsertar"><fmt:message key="g_save" /></button>
			</div>	
		</div>
	</form>
</body>
</html>
