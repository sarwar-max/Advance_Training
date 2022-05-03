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
	<h1 style="text-align: center;">WELCOME TO SHOPPING CART FOR
		ONLINE BOOK SHOP</h1>
	<br>
	<p style="text-align: center;">This site allows you to purchase
		books online.</p>
	<br>
	<h3 style="text-align: center;">GET READY TO SHOP!!</h3>
	<br>
	<div style="text-align: center;">
		<form action="login" method="post">
			<table class="center">
				<tr>
					<th colspan="2">Login Here</th>
				<tr>
				<tr>
					<td>User Name:</td>
					<td><input type="text" name="uname"></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="password" name="pass"></td>
				</tr>
				<tr>
					<td><input type="submit" value="Login" /></td>
					<td><input type="reset" value="Reset" /></td>
				</tr>
			</table>
			<a href="register.jsp">New User? Click here to register</a><br>
			<a href="forgotpwd.jsp">Forgot password?</a>

		</form>
	</div>

</body>
</html>