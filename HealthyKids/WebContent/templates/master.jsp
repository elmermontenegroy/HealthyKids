<frameset rows="100,*,50" border=0 >
	<frame name="header" src="${pageContext.request.contextPath}/templates/header.jsp" noresize="noresize">
	<frameset cols="300,*">
		<frame name="menu" src="${pageContext.request.contextPath}/templates/menu.jsp" noresize="noresize">
		<frame name="body" src="${pageContext.request.contextPath}/templates/body.jsp">
	</frameset>
	<frame name="footer" src="${pageContext.request.contextPath}/templates/footer.jsp" noresize="noresize">
</frameset>