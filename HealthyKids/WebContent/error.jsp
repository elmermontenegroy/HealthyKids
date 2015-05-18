<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- mostraremos el mensaje enviado por el Servlet logueo -->
	<%
		String mensaje = (String) request.getAttribute("mensaje");
		if (mensaje != null)
			out.println("<center>" + mensaje + "</center>");
	%>
	
	<br>
	<a href="index.jsp">Regresar al inicio</a>
</body>
</html>