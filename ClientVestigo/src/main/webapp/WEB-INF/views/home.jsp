<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Vestigo</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<!-- Bootstrap -->
	<link href="resources/bootstrap/css/bootstrap.css" rel="stylesheet" />
	<link href="resources/bootstrap/css/bootstrap-responsive.css" rel="stylesheet" />
 	<script src="http://code.jquery.com/jquery.js"></script>
	<script src="resources/bootstrap/js/bootstrap.js"></script>
	<!-- Normal css -->
	<link href="resources/CSS/mainCss.css" rel="stylesheet" />
</head>

<body class="mainBody">
	
	<img src="resources/pictures/vestigo_logo.png" class="img-rounded" id="logoImg">

	<c:choose>
		<c:when test="${servisUgasen }">
			<div class="mainContainer">
				<h2>Servis je trenutno nedostupan!</h2>
				<form name="input" action="index.html" method="POST">
					<button class="btn btn-primary buttonWidth" type="submit" >Natrag</button>
				</form>
				<form name="input" action="podaci.html" method="post">
					<button class="btn btn-primary buttonWidth" type="submit" >Pokušaj ponovo</button>
				</form>
			</div>
		</c:when>
		<c:otherwise>
			<h1 id="rezultatiHeading">
				Vestigo Rezultati ! 
			</h1>
			
			<div class="mainContainer">
				<form name="input" action="podaci.html" method="post">
					<button class="btn btn-primary buttonWidth" type="submit" >Dohvati podatke</button>
				</form>
				
				<form name="input" action="index.html" method="POST">
					<button class="btn btn-primary buttonWidth" type="submit" >Obriši podatke</button>
				</form>
				
				<table class="table table-hover ">
					<caption>Podaci o klijentima</caption>
					<thead>
						<tr>
						<th>Ime</th>
						<th>Prezime</th>
						<th>Telefon</th>
						<th>Mjesto prebivališta</th>
						</tr>
					</thead>
					<c:forEach  var="item" items="${listOfData}">
						<tr>
				    		<td><c:out value=" ${item.getIme()}"></c:out></td>
				    		<td><c:out value="${item.getPrezime()}"></c:out></td>
				    		<td><c:out value="${item.getTel()}"></c:out></td>
				    		<td><c:out value="${item.getMjesto().getNaziv()}"></c:out></td>
			    		</tr>
					</c:forEach>
				</table>
			</div>
		</c:otherwise>
	</c:choose>
</body>
</html>
