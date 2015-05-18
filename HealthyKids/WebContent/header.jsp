<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#6208FF">

	<!-- mostraremos el mensaje enviado por el Servlet logueo 
	< %
		HttpSession misesion= request.getSession();
		String datosconsesion = (String) misesion.getAttribute("datosconsesion");
		if (datosconsesion != null)
			out.println("Bienvenido<center>" + datosconsesion + "</center>");
	%>
	
	< %
		String datos = (String) request.getAttribute("datos");
		if (datos != null)
			out.println("Bienvenido<center>" + datos + "</center>");
	%>
	-->
</body>
</html>