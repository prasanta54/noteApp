<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	User sessionUser = (User) session.getAttribute("userObj");
	if (sessionUser == null) {
		response.sendRedirect("login.jsp");
	} else {
	%>

	<%@ include file="Components/homeNavbar.jsp"%>
	<h1 class="text-center">
		Hey

		<%=sessionUser.getName()%>
		,Welcome TO User Management System
	</h1>
<a href="./addNote.jsp">Add Note</a>

</body>
</html>