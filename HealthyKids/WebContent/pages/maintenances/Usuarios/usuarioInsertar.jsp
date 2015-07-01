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
					<table>
						<tr>
							<td><fmt:message key="tb_user_name" /></td>
							<td><input id="txtnombre" name="txtnombre" type="text" size="30" maxlength="30" required="required"></td>
							<td><fmt:message key="tb_user_lastname" /></td>
							<td><input id="txtapellido" name="txtapellido" type="text" size="50" maxlength="50"  required="required"></td>
						</tr>
						<tr>
							<td><fmt:message key="tb_user_user" /></td>
							<td><input id="txtusuario" name="txtusuario" type="text" size="20" maxlength="20" required="required"></td>
							<td><fmt:message key="tb_user_password" /></td>
							<td><input id="txtclave" name="txtclave" type="password" size="20" maxlength="20" required="required"></td>
						</tr>
						
						<tr>
							<td><fmt:message key="tb_user_dateofbirth" /></td>
							<td><input id="txtfechanacimiento" name="txtfechanacimiento" type="date" required="required"></td>
							<td><fmt:message key="tb_user_phone" /></td>
							<td><input id="txttelefono" name="txttelefono" type="text" size="8" maxlength="9" required="required"></td>
						</tr>
						<tr>
							<td><fmt:message key="tb_user_email" /></td>
							<td><input id="txtcorreo" name="txtcorreo" type="email" size="50" maxlength="50" required="required"></td>
							<td></td>
							<td></td>
						</tr>
					</table>
				</fieldset>
			</div>
			
			<div class="pie">
				<hr>
				<button type="submit" class="medium" formmethod="post" formaction="${pageContext.request.contextPath}/UsuarioServlet?accion=insertar"><fmt:message key="g_save" /></button>
			</div>	
		</div>
	</form>
</body>
</html>
