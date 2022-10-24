<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

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
		
        <title>Progetto Gestione Contatti</title>
    </head>
    <body>
    	<div align="center">
	        <h1>Lista Contatti</h1>
	        
	        <table class="Tabella" >
	        	<th>Id</th>
	        	<th>Name</th>
	        	<th>Email</th>
	        	<th>Address</th>
	        	<th>Telephone</th>
	        	<th>Action</th>
	        	
				<c:forEach var="contact" items="${listContact}" varStatus="status">
	        	<tr>
	        		<td>${contact.id}</td>
					<td>${contact.name}</td>
					<td>${contact.email}</td>
					<td>${contact.address}</td>
					<td>${contact.telephone}</td>
					<td>
						<a href="editContact?id=${contact.id}">Edit</a>
						&nbsp;&nbsp;&nbsp;&nbsp;
						<a href="deleteContact?id=${contact.id}">Delete</a>
					</td>
							
	        	</tr>
				</c:forEach>	        	
			</table>
			<div  align="center">
			<h3><a href="newContact">Nuovo Contatto</a></h3></div>
    	</div>
    </body>
</html>
