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
								<li class="dropdown keep-open"><a href="" >PRODUCTOS<i class="fa fa-angle-down"></i></a>
                                    <ul role="menu" class="sub-menu">
                                        <li><a href="/ropa/productosMu">Mujeres</a></li>
										<li><a href="/ropa/productosHo">Hombres</a></li> 
										<li><a href="/ropa/productosNi">Niños</a></li> 
                                    </ul>
                                </li> 								
								<li><a href="/ropa/registro">REGISTRO</a></li> 
								<li><a href="/ropa/contacto">CONTACTO</a></li>
								<li><a href="/ropa/administrar" class="active">ADMINISTRACION(provisorio)</a></li>
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
	    		<h1 class="title text-center">Manejo de Stock</h1>     			   			
				</div>			 		
			</div>    	
    		<div class="row">  	
	    		<div class="col-sm-4">
	    			<div class="contact-form">
				    	<form id="main-contact-form" class="contact-form row" name="buscar" method="post">
				            <div class="form-group col-md-8">
				                <input type="text" name="idprod" class="form-control" required="required" placeholder="Código">
				            </div>	
				            <div class="form-group col-md-4">
				                <input type="submit" name="stock" class="btn btn-primary" value="Buscar">
				            </div>																										
				        </form>
	    			</div>
	    		</div>			
	    	</div>  
    	</div>	<br/>
		<div id="contact-page" class="container table-responsive">
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>CODIGO</th>
						<th>CATEGORIA</th>
						<th>NOMBRE</th>
						<th>PRECIO</th>
						<th>COLOR</th>
						<th>TALLE</th>
						<th>CANTIDAD</th>
					</tr>
				</thead>
				<tbody>
					<tr><td></td><td></td><td></td><td></td><td></td><td></td><td></td></tr>
				</tbody>
			</table>
		</div>
		<br/><br/>
    	<div class="bg">   	
    		<div class="row">  	
	    		<div class="col-sm-12">
	    			<div class="contact-form">
				    	<form id="main-contact-form" class="contact-form row" name="cantidad" method="post">
				            <div class="form-group col-md-4">
				                <input name="fecha" required="required" placeholder="Ingrese Fecha dd/mm/aaaa" id="fecha" type="datetime" class="form-control">
				            </div>	
							<div class="form-group col-md-4">
								<input type="text" name="cantidad" class="form-control" required="required" placeholder="Ingrese Cantidad">
							</div>
				            <div class="form-group col-md-4">
				                <input type="submit" name="suma" class="btn btn-primary" value="Agregar">
								<input type="submit" name="resta" class="btn btn-primary" value="Revertir">
				            </div>																										
				        </form>
	    			</div>
	    		</div>			
	    	</div>  
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