<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
	
	<!-- JSTL TAG LIB -->
	<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
	
    <title>Hello, world!</title>
  </head>
  <body>
  <div class="container my-3">
    <nav aria-label="breadcrumb">
      <ol class="breadcrumb">
        <li class="breadcrumb-item"><a href="#">Home</a></li>
        <li class="breadcrumb-item"><a href=VerProductos">Producto</a></li>
        <li class="breadcrumb-item active" aria-current="page">"${producto.nombre}"</li>
        <li class="breadcrumb-item"><a href="formCrearProducto.html">Nuevo</a></li>
      </ol>
    </nav>
    <div class="row">
      <div class="col-8">
        <table class="table">
          <thead>
            <tr>
              <th scope="col">Nombre</th>
              <th scope="col">Stock</th>
              <th scope="col">Tallas</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td>${producto.nombre}</td>
              <td>${producto.stock}</td>
              <td>${producto.tallas}</td>
            </tr>          
          </tbody>
        </table>
      </div>
      <div class="col-4">
        espacio para mostrar lo que sea
      </div>

    </div>
    <!--row-->


  </div>
  <!--container-->



  <!-- Optional JavaScript -->
  <!-- jQuery first, then Popper.js, then Bootstrap JS -->
  <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
    integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
    crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
    integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
    crossorigin="anonymous"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
    integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
    crossorigin="anonymous"></script>
</body>

</html>