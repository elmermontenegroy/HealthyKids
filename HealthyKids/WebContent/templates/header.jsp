<%@ page import="com.healthykids.beans.UsuarioDTO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
	<head>
	
		<!-- META -->
		<title>Healthy Kids - Ni�os Saludables solo con nosotros :D</title>
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
	<body class="defaultHeader">
		<h3>Healthy Kids</h3>
		<fmt:message key="tb_user_user" />:
		<%= ((UsuarioDTO)request.getSession().getAttribute("usuario")).getNombre() %>
		<a href="${pageContext.request.contextPath}/LoginServlet?accion=logout" target="_parent"><fmt:message key="l_logout" /></a>
	</body>
</html>





