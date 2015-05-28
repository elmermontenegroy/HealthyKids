<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!-- enlazo el archivo con las css ubicado en... -->
<link type="text/css" rel="stylesheet" href="estilos/estilos.css">

</head>
<body>
	<h1>Registro de usuarios</h1>
	<hr>
	<fieldset> 				<!-- define un panel de grupo -->
		<legend>Formulario</legend>
		<form action="registrando" method="post">   	<!-- inicia el formulario -->
		
			<label>Usuario:</label>		
			<input type="text" name="txtUsuario" size="4" maxlength="4" 
			       placeholder="Usuario" required="required"><br>
			<label>Password:</label> 	
			<input type="password" name="txtClave" size="5" maxlength="5"
			       placeholder="Clave" required="required"><br>
			       
			<label>Nombre:</label>		
			<input type="text" name="txtNombre" size="35" 
			       placeholder="Nombre" required="required"><br>
			<label>Apellido:</label>		
			<input type="text" name="txtApellido" size="50" 
			       placeholder="Apellidos" required="required"><br>
			 
			<!-- aplico estilo al boton usando el atributo class-->
			<input type="submit" value="Registrar" class="button">
			 
			<input type="reset" value="Limpiar">
		</form>
	</fieldset>
	<!-- mostraremos el mensaje enviado por el Servlet logueo -->
	<%
		String mensaje = (String) request.getAttribute("mensaje");
		if (mensaje != null)
			out.println("<center>" + mensaje + "</center>");
	%>
</body>
</html>