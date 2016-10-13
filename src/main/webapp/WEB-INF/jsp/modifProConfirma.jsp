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
										<li><a href="/ropa/productosNi">NiÃ±os</a></li> 
                                    </ul>
                                </li> 								
								<li><a href="/ropa/registro">REGISTRO</a></li> 
								<li><a href="/ropa/contacto">CONTACTO</a></li>
								<li><a href="/ropa/administrar" class="active">ADMINISTRACION</a></li>
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
	    		<h1 class="title text-center">MODIFICACIÓN DE PRODUCTO</h1>     			   			
				</div>			 		
			</div>    	
    		<div class="row">  	
	    		<div class="col-sm-12">
	    			<div class="contact-form">
				    	<form:form action="/ropa/modifProOk?id=${producto.id}" modelAttribute="producto" id="main-contact-form" class="contact-form row" role="form" method="POST" name="modifProd">
				            <div class="form-group col-md-6">
				                <form:input path="id" type="text" readonly = "readonly" name="idprod" class="form-control" required="required" placeholder="Codigo"/>
				            </div>		
				            <div class="form-group col-md-6">
						<form:select path="categoria" class="form-control" name="catProd" id="catProd">
							<form:option value="NONE" label="Seleccionar Categoria"/>
							<form:options items="${Categoria.categoria}"></form:options>
						</form:select>
				            </div>								
				            <div class="form-group col-md-12">
				                <form:input path="nombreProducto" type="text" name="nombre" class="form-control" required="required" placeholder="Nombre"/>
				            </div>
					            <div class="form-group col-md-4">
				                <form:input path="color" type="text" name="color" class="form-control" required="required" placeholder="Color"/>
				            </div>
				            <div class="form-group col-md-4">
				                <form:input path="talle" type="text" name="talle" class="form-control" required="required" placeholder="Talle"/>
				            </div>
				            <div class="form-group col-md-4">
				                <form:input path="precio" type="text" name="precio" class="form-control" required="required" placeholder="Precio"/>
				            </div> 	
				        <br/>
						<a href="/ropa/administrar"><input type="button" name="volver" class="btn btn-primary pull-left" value="Cancelar"/></a>
						<a href="/ropa/modifProOk?id=${producto.id}"><input type="button" name="volver" class="btn btn-primary pull-right" value="Modificar"/></a>
						<br></br>											
				        </form:form>

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