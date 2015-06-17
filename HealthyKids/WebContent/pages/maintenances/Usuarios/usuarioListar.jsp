<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css" media="all" />
		
	<!-- Javascript -->
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-1.11.2.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/kickstart.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/javascript.js"></script>

</head>
<body>
	<h5>Listado de usuarios</h5>
	<hr>
	<form>
		Buscar por:
		<select>
		  <option value="nombre" selected>Nombre</option>
		  <option value="apellido">Apellido</option>
		  <option value="usuario">Usuario</option>
		  <option value="estado">Estado</option>
		</select>
		<button type="button" class="medium">Buscar</button>
	</form>
	
	
</body>
</html>