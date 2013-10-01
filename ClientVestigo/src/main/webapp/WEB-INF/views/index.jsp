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
	
	<div class="mainContainer">
		<h1>
			Dobrodošli ! 
		</h1>
		
		<form name="input" action="podaci.html" method="post">
			<button class="btn btn-primary" type="submit" >Dohvati podatke</button>
		</form>
	</div>
</body>
</html>
