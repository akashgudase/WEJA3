<%@page import="java.util.List"%>
<%@page import="com.jspiders.studentmanagementsystem.object.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<jsp:include page="nav_bar.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Page</title>
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f4f4f4;
	margin: 0;
	padding: 0;
}

div {
	margin-top: 20px;
}

form {
	margin-bottom: 20px;
}

table {
	width: 80%;
	border-collapse: collapse;
	margin: 20px auto;
	background-color: #fff;
}

th, td {
	padding: 10px;
	border: 1px solid #ddd;
	text-align: left;
}

th {
	background-color: #4CAF50;
	color: white;
}

input[type="text"] {
	width: 100%;
	padding: 8px;
	box-sizing: border-box;
	margin: 5px 0;
}

input[type="submit"] {
	background-color: #4CAF50;
	color: white;
	padding: 10px 15px;
	border: none;
	border-radius: 5px;
	cursor: pointer;
}

a {
	text-decoration: none;
	color: #333;
}

h1 {
	color: #4CAF50;
}
</style>
</head>
<body>
	<%
	Student student = (Student) request.getAttribute("student");
	if (student != null) {
	%>
	<div align="center">
		<form action="update_student" method="post">
			<table border="1px solid">
				<tr>
					<td>Id</td>
					<td><input type="text" name="id" value="<%=student.getId()%>"
						readonly="true"></td>
				</tr>
				<tr>
					<td>Name</td>
					<td><input type="text" name="name"
						value="<%=student.getName()%>"></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="text" name="email"
						value="<%=student.getEmail()%>"></td>
				</tr>
				<tr>
					<td>Mobile</td>
					<td><input type="text" name="mobile"
						value="<%=student.getMobile()%>"></td>
				</tr>
			</table>
			<input type="submit" value="UPDATE">
		</form>
	</div>
	<%
	}
	String message = (String) request.getAttribute("message");
	if (message != null) {
	%>
	<div align="center">
		<h1><%=message%></h1>
	</div>
	<%
	}
	%>
</body>
</html>