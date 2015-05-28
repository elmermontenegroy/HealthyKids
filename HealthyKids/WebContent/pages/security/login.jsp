<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Healthy Kids</title>
	
	<!-- CSS -->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/normalize.css" media="all" />
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css" media="all" />
		
	<!-- Javascript -->
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-1.11.2.js"></script>

</head>
<body class="login">
	<div>
		<form name="frmlogueo" method="post" action="LoginServlet">
			<fieldset>
				<legend>
					<span>Acceso</span>
				</legend>
				<table>
					<tbody>
						<tr>
							<td><label for="usu">Usuario: </label></td>
							<td><input type="text" size="10" maxlength="10"
								name="txtUsuario" id="usu" class="txt" placeholder="Usuario" required="required"></td>
						</tr>
						<tr>
							<td><label for="pas">Password: </label></td>
							<td><input type="password" size="10" maxlength="10"
								name="txtClave" id="pas" class="txt" placeholder="Clave" required="required" ></td>
						</tr>
						<tr>
							<td colspan="2"><input type="submit" value="Iniciar Sesion"	name="iniciosesion"></td>
						</tr>
					</tbody>
				</table>
			</fieldset>
		</form>
	</div>


	<!-- mostraremos el mensaje enviado por el Servlet logueo -->
	<%
		String mensaje = (String) request.getAttribute("mensaje");
		if (mensaje != null)
			out.println("<center>" + mensaje + "</center>");
	%>
</body>
</html>





