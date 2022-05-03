<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}

table.center {
	margin-left: auto;
	margin-right: auto;
}
</style>
</head>
<body style="background-color: yellow;">
	<h1 style="text-align: center;">SHOPPING CART FOR BOOK STORE</h1>
	<h3 style="text-align: center;">CUSTOMER REGISTRATION FORM</h3>
	<br>
	<div style="text-align: center;">
		<form action="register" method="post">
			<table class="center">
				<tr>
					<th colspan="2">Enter information here</th>
				<tr>
				<tr>
					<td>Full Name:</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td>Address:</td>
					<td><input type="text" name="addr"></td>
				</tr>
				<tr>
					<td>Email:</td>
					<td><input type="text" name="email"></td>
				</tr>
				<tr>
					<td>User Name:</td>
					<td><input type="text" name="uname"></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="password" name="pass"></td>
				</tr>
				<tr>
					<td><input type="submit" value="Submit" /></td>
					<td><input type="reset" value="Reset" /></td>
				</tr>
			</table>
			<a href="login.jsp">Already Registered? Login here</a>
			<h3>All the fields are mandatory!</h3>
		</form>
	</div>

</body>
</html>