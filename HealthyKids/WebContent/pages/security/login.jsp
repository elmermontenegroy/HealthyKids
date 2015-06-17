<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-1.11.2.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/kickstart.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/javascript.js"></script>

</head>
<body class="login">
	
	<form name="frmlogueo" method="post" action="LoginServlet">
		<fieldset>
			<legend>
				<span>Acceso</span>
			</legend>
			
			<table>
				<tr>
					<td><label for="usu">Usuario: </label></td>
					<td><input type="text" size="15" maxlength="15"	name="txtUsuario" id="usu" class="txt" placeholder="Usuario" required="required"></td>
				</tr>
				<tr>
					<td><label for="pas">Password: </label></td>
					<td><input type="password" size="15" maxlength="15"	name="txtClave" id="pas" class="txt" placeholder="Clave" required="required" ></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="Iniciar Sesion"	name="iniciosesion"></td>
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





