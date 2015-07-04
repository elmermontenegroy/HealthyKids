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
<body class="login">
	<fmt:setLocale value="${param.idioma}" scope="session"/>
	<a href="${pageContext.request.contextPath}/pages/security/login.jsp?idioma=en">ingles</a>
	<a href="${pageContext.request.contextPath}/pages/security/login.jsp?idioma=es">español</a>
	
	<form name="frmlogueo" method="post" action="${pageContext.request.contextPath}/LoginServlet?accion=login">
		<fieldset>
			<legend>
				<span><fmt:message key="l_access" /></span>
			</legend>
			
			<table>
				<tr>
					<td><label for="usu"><fmt:message key="l_user" />: </label></td>
					<td><input type="text" size="15" maxlength="15"	name="txtUsuario" id="usu" class="txt" required="required"></td>
				</tr>
				<tr>
					<td><label for="pas"><fmt:message key="l_password" />: </label></td>
					<td><input type="password" size="15" maxlength="15"	name="txtClave" id="pas" class="txt" required="required" ></td>
				</tr>
				<tr>
					<td colspan="2"><button type="submit" name="Iniciar Sesion"><fmt:message key="l_login" /></button></td>
				</tr>
			</table>
		</fieldset>
	</form>
	


	<!-- mostraremos el mensaje enviado por el Servlet logueo -->
	<%
		String mensaje = (String) request.getAttribute("mensaje");
		if (mensaje != null)
			out.println("<center>" + mensaje + "</center>");
	%>
</body>
</html>





