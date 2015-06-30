<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
	<head>
	
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
		<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/kickstart.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/javascript.js"></script>
		
	</head>
	<body class="defaultMenu">
		
		<div class="container">
	        <ul>
	            <li class="dropdown">
	                <input type="checkbox" />
	                <a href="#" data-toggle="dropdown"><fmt:message key="m_maintenances" /></a>
	                <ul class="dropdown-menu">
	                <li><a href="${pageContext.request.contextPath}/pages/maintenances/Perfiles/perfilListar.jsp" target="body"><fmt:message key="m_profiles" /></a></li>
	                <li><a href="${pageContext.request.contextPath}/UsuarioServlet?carga=cargarListar" target="body"><fmt:message key="m_users" /></a></li>
	                </ul>
	            </li>
	            <li class="dropdown">
	                <input type="checkbox" />
	                <a href="#" data-toggle="dropdown"><fmt:message key="r_reports" /></a>
	                <ul class="dropdown-menu">
	                <li><a href="#">Reporte 1</a></li>
	                <li><a href="#">Reporte 2</a></li>
	                <li><a href="#">Reporte 3</a></li>
	                <li><a href="#">Reporte 3</a></li>
	                </ul>
	            </li>
	        </ul>
	    </div>
	
<!-- 		<h5>Menu</h5> -->
<!-- 		<hr> -->
<!-- 		<a href="central.jsp" target="cuerpo">Inicio</a><br> -->
<!-- 		Mantenimientos<br> -->
<!-- 		* <a href="registrar.jsp" target="cuerpo">Registrar</a><br> -->
<!-- 		* <a href="listar.jsp" target="cuerpo">Listar</a><br> -->
<!-- 		* <a href="actualizar.jsp" target="cuerpo">Actualizar</a><br> -->
<!-- 		* <a href="eliminar.jsp" target="cuerpo">Eliminar</a><br> -->
<!-- 		<br> -->
<!-- 		<a href="login.jsp" target="_parent">Cerrar sesión</a><br> -->
	</body>
</html>


