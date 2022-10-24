<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
	<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<style type="text/css">
		.Tabella {background: rgba( 59, 127, 68, 0.3 );
		box-shadow: 0 8px 32px 0 rgba( 31, 38, 135, 0.37 );
		backdrop-filter: blur( 14px );
		-webkit-backdrop-filter: blur( 14px );
		border-radius: 5px;
		border: 1px solid rgba( 255, 255, 255, 0.18 );}
		div {
		background: rgba( 51, 106, 58, 0.4 );
		box-shadow: 0 8px 32px 0 rgba( 31, 38, 135, 0.37 );
		backdrop-filter: blur( 18.5px );
		-webkit-backdrop-filter: blur( 18.5px );
		border-radius: 7px;
		}
		</style>
	<title>Nuovo Contatto</title>
</head>
<body>
	<div align="center">
		<h1>Aggiunta/Modifica di un Contatto</h1>
		<form:form action="saveContact" method="post" modelAttribute="contact">
		<table class="Tabella">
			<form:hidden path="id"/>
			<tr>
				<td>Name:</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><form:input path="email" /></td>
			</tr>
			<tr>
				<td>Address:</td>
				<td><form:input path="address" /></td>
			</tr>
			<tr>
				<td>Telephone:</td>
				<td><form:input path="telephone" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="Save"></td>
			</tr>
		</table>
		</form:form>
		<div align="center"><h3><a href="/ProgettoVerifica">Home</a></h3></div>
	</div>
	
</body>
</html>