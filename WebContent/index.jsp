<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">

<!-- JSTL TAG LIB -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style>
.list-group-item {
	font-size: 3rem;
	!
	important
}
</style>
<title>Productos</title>
</head>
<body>
	<div class="container">
		<h1 class="text-center display-4 font-weight-bold">Productos</h1>
		<div class="list-group mt-5">
			<a href="VerProductos"
				class="list-group-item list-group-item-action text-center">Ver
				Productos</a> <a href="CrearProducto"
				class="list-group-item list-group-item-action text-center">Crear
				Producto</a>
		</div>
	</div>
	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</body>
</html>