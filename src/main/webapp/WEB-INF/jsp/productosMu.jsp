<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Ropa's - Tu tienda online</title>
	<link rel="shortcut icon" href="images/favicon.png">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/font-awesome.min.css" rel="stylesheet">
    <link href="css/prettyPhoto.css" rel="stylesheet">
    <link href="css/price-range.css" rel="stylesheet">
    <link href="css/animate.css" rel="stylesheet">
	<link href="css/main.css" rel="stylesheet">
	<link href="css/responsive.css" rel="stylesheet">
</head>
<body>
	<header id="header">
		<%@include file="header.jsp" %>
		<%@include file="combo.jsp" %>
		
		<div class="header-bottom">
			<div class="container">
				<div class="row">
					<div class="col-sm-12">
						<div class="navbar-header">
							<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
								<span class="sr-only">Toggle navigation</span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
							</button>
						</div>
						<div class="mainmenu">
							<ul class="nav navbar-nav collapse navbar-collapse">
								<li><a href="/ropa">INICIO</a></li>
								<li class="dropdown keep-open"><a href=""  class="active">PRODUCTOS<i class="fa fa-angle-down"></i></a>
                                    <ul role="menu" class="sub-menu">
                                        <li><a href="/ropa/productosMu">Mujeres</a></li>
										<li><a href="/ropa/productosHo">Hombres</a></li> 
										<li><a href="/ropa/productosNi">Niños</a></li> 
                                    </ul>
                                </li> 								
								<li><a href="/ropa/registro">REGISTRO</a></li> 
								<li><a href="/ropa/contacto">CONTACTO</a></li>
								<li><a href="/ropa/administrar">ADMINISTRACION(provisorio)</a></li>
							</ul>
						</div>
					</div>
					</div>
				</div>
			</div>
	</header>

	
	<section>
		<div class="container">
			<div class="row">
				<div class="col-sm-12 padding-right">
				<h1 class="title text-center">Mujeres</h1>
					<div class="col-sm-3">
					<div class="left-sidebar">
						<h2>Categorías</h2>
						<div class="panel-group category-products" id="accordian">
							<div class="panel panel-default">
								<div class="panel-heading">
									<h4 class="panel-title"><a href="">Camisas</a></h4>
								</div>
							</div>
							<div class="panel panel-default">
								<div class="panel-heading">
									<h4 class="panel-title"><a href="">Pantalones</a></h4>
								</div>
							</div>
							<div class="panel panel-default">
								<div class="panel-heading">
									<h4 class="panel-title"><a href="">Zapatos</a></h4>
								</div>
							</div>	
							<div class="panel panel-default">
								<div class="panel-heading">
									<h4 class="panel-title"><a href="">Bolsos</a></h4>
								</div>
							</div>							
						</div>
					</div>
				</div>
				<div class="col-sm-9 features_items">
						<div class="col-sm-4">
							<div class="product-image-wrapper">
								<div class="single-products">
									<div class="productinfo text-center">
										<img src="images/home/producto1.jpg" alt="" />
										<h2>Remera de algodón <br>con volados</h2>
										<p>Talles: <a href="#">S</a>-<a href="#">M</a>-<a href="#">L</a></p>
										<p>Colores: <a href="#">Negro</a> / <a href="#">Blanco</a></p>
										<h3>$200</h3>
										<a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Agregar al Carrito</a>
									</div>
								</div>
							</div>
						</div>
						<div class="col-sm-4">
							<div class="product-image-wrapper">
								<div class="single-products">
									<div class="productinfo text-center">
										<img src="images/productos/mujeres/m2.jpg" alt="" />
										<h2>Campera <br> impermeable</h2>
										<p>Talles: <a href="#">S</a>-<a href="#">M</a>-<a href="#">L</a></p>
										<p>Colores: <a href="#">Violeta</a> / <a href="#">Bordó</a></p>
										<h3>$499</h3>
										<a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Agregar al Carrito</a>
									</div>
								</div>
							</div>
						</div>
						<div class="col-sm-4">
							<div class="product-image-wrapper">
								<div class="single-products">
									<div class="productinfo text-center">
										<img src="images/productos/mujeres/m1.jpg" alt="" />
										<h2>Remera manga larga <br> con estampado de flores</h2>
										<p>Talles: <a href="#">S</a>-<a href="#">M</a>-<a href="#">L</a></p>
										<p>Colores: <a href="#">Azul</a> / <a href="#">Beige</a></p>
										<h3>$299</h3>
										<a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Agregar al Carrito</a>
									</div>
								</div>
							</div>
						</div>
						<div class="col-sm-4">
							<div class="product-image-wrapper">
							<div class="single-products">
									<div class="productinfo text-center">
										<img src="images/productos/mujeres/m3.jpg" alt="" />
										<h2>Remera mangas 3/4 <br> de seda</h2>
										<p>Talles: <a href="#">S</a>-<a href="#">M</a>-<a href="#">L</a></p>
										<p>Colores: <a href="#">Amarillo</a> / <a href="#">Celeste</a></p>
										<h3>$200</h3>
										<a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Agregar al Carrito</a>
									</div>
								</div>
							</div>
						</div>
						<div class="col-sm-4">
							<div class="product-image-wrapper">
								<div class="single-products">
									<div class="productinfo text-center">
										<img src="images/productos/mujeres/m4.jpg" alt="" />
										<h2>Remera rayada con bolsillo <br> y detalles</h2>
										<p>Talles: <a href="#">S</a>-<a href="#">M</a>-<a href="#">L</a></p>
										<p>Colores: <a href="#">Blanco</a> / <a href="#">Rojo</a></p>
										<h3>$499</h3>
										<a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Agregar al Carrito</a>
									</div>
								</div>
							</div>
						</div>
						<div class="col-sm-4">
							<div class="product-image-wrapper">
								<div class="single-products">
									<div class="productinfo text-center">
										<img src="images/productos/mujeres/m5.jpg" alt="" />
										<h2>Vestido <br> floreado</h2>
										<p>Talles: <a href="#">S</a>-<a href="#">M</a>-<a href="#">L</a></p>
										<p>Colores: <a href="#">Beige</a> / <a href="#">Rosa</a></p>
										<h3>$299</h3>
										<a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Agregar al Carrito</a>
									</div>
								</div>
							</div>
						</div>	
						<ul class="pagination">
							<li class="active"><a href="">1</a></li>
							<li><a href="">2</a></li>
							<li><a href="">3</a></li>
							<li><a href="">&raquo;</a></li>
						</ul>						
					</div>
				</div>
			</div>
		</div>
	</section>
	
	<%@include file="footer.jsp" %>
  
    <script src="js/jquery.js"></script>
	<script src="js/price-range.js"></script>
    <script src="js/jquery.scrollUp.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.prettyPhoto.js"></script>
    <script src="js/main.js"></script>
</body>
</html>