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
	<h1 style="text-align: center;">Set Password Page</h1>
	<div style="text-align: center;">
		<form action="setnewpassword" method="post">
			<table class="center">
				<tr>
					<th colspan="2">Enter information here</th>
				<tr>
				<tr>
					<td>Enter new password:</td>
					<td><input type="password" name="pass"></td>
				</tr>
				<tr>
					<td>Confirm password:</td>
					<td><input type="password" name="pass1"></td>
				</tr>
				<tr>
					<td><input type="submit" value="Submit" /></td>
				</tr>
			</table>
		</form>
	</div>

</body>
</html>