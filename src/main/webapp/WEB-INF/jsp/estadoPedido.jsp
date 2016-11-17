<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
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
								<li class="dropdown"><a href="">PRODUCTOS<i class="fa fa-angle-down"></i></a>
                                    <ul role="menu" class="sub-menu">
                                        <li><a href="/ropa/productosMu">Mujeres</a></li>
										<li><a href="/ropa/productosHo">Hombres</a></li> 
										<li><a href="/ropa/productosNi">Niños</a></li> 
                                    </ul>
                                </li> 								
								<li><a href="/ropa/registro">REGISTRO</a></li> 
								<li><a href="/ropa/contacto">CONTACTO</a></li>
								<li><a href="/ropa/administrar"  class="active">ADMINISTRACION</a></li>
								
							</ul>
						</div>
					</div>

				</div>
			</div>
		</div>
				
	</header>
	 
	 <div id="contact-page" class="container">
		   	<div class="bg">
		    	<div class="row">  		
		    		<div class="col-sm-12 padding-right"> 
		    		<h1 class="title text-center">EDITAR PEDIDOS</h1>    			   			
					</div>			 		
				</div> 
			</div>
		</div>
		<div class="container">
		<div class="row">
		<form:form>		
			<div class="col-md-3">
			<img class="center-block" src="images/confirmado.png">
			<input type="checkbox" name="confirmado" value="confirmado"><p class="text-center">CONFIRMADO</p>
			</div>
			<div class="col-md-3">
			<img class="center-block" src="images/preparado.png">
			<input type="checkbox" name="preparado" value="preparado"><p class="text-center">PREPARADO</p>
			</div>
			<div class="col-md-3">
			<img class="center-block" src="images/enviado.png">
			<input type="checkbox" name="enviado" value="enviado"><p class="text-center">EN CAMINO</p>
			</div>
			<div class="col-md-3">
			<img class="center-block" src="images/entregado.png">
			<input type="checkbox" name="entregado" value="entregado"><p class="text-center">ENTREGADO</p>
			</div>
			<div class="col-md-12">
			<div class="col-md-2 pull-right">
			<input class="btn btn-success" type="submit" value="Confirmar">		
			</div>
			</div>
		</form:form>
		</div>
		</div>
				
	<%@include file="footer.jsp" %>
  
    <script src="js/jquery.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/price-range.js"></script>
    <script src="js/jquery.scrollUp.min.js"></script>
    <script src="js/jquery.prettyPhoto.js"></script>
    <script src="js/main.js"></script>
</body>
</html>