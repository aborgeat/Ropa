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
	<link rel="stylesheet" href="css/datepicker.css">
	<script src="http://code.jquery.com/jquery-1.10.2.js"></script>	
	<script src="http://code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
	<link rel="stylesheet" href="http://code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">	
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
								<li><a href="/ropa/registro" class="active">REGISTRO</a></li> 
								<li><a href="/ropa/contacto">CONTACTO</a></li>
								<li><a href="/ropa/administrar">ADMINISTRACION(provisorio)</a></li>
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
					<h1 class="title text-center">Registro</h1>    			    				    				
				</div>			 		
			</div>    	
    		<div class="row">  	
	    		<div class="col-sm-12">
	    			<div class="formulario">
						<form:form action="/ropa/regUsuConfirma" modelAttribute="usuario" role="form" method="POST" name="formulario" >
							<div class="form-group col-md-12">
								<div id="alert1">Debe tener entre 10 y 20 caracteres. </div>			
								<form:input path="nombreYapellido" type="text" id="nombre" required="required" class="form-control" placeholder="Nombre y Apellido"/>
							</div>
							<div class="form-group col-md-6">
								<div id="alert2">Debe tener 9 caracteres. </div>
								<form:input path="dni" type="text" id="dni" required="required" class="form-control" placeholder="DNI"/>							
							</div>
							<div class="form-group col-md-6">
								<form:input path="fechaNacimiento" name="datepicker" required="required" placeholder="Fecha de nacimiento dd/mm/aa"  type="text" class="form-control"/>
							</div>
							<div class="form-group col-md-6">
								<div id="alert6">Ingrese una dirección válida.</div>			
								<form:input path="domicilio" type="text" id="domicilio" required="required" class="form-control" placeholder="Domicilio"/>
							</div>
							<div class="form-group col-md-6">
								<div id="alert7">El número ingresado no es válido. </div>
								<form:input path="telefono" type="text" id="numero" required="required" class="form-control" placeholder="Teléfono"/>
							</div>
							
							<div class="form-group col-md-12">
							<div id="alert3">El e-mail ingresado no es correcto. </div>
							<form:input path="eMail" type="email" id="email" required="required" class="form-control" placeholder="E-mail"/>
							</div>
							<div class="form-group col-md-6">
								<div id="alert4">La contraseña debe tener entre 5 y 10 caracteres y poseer números y letras.</div>
								<input type="password" id="contraseña" required="required" class="form-control" placeholder="Contraseña"/>			
							</div>
							<div class="form-group col-md-6">
								<div id="alert5">Las contraseñas no coinciden. </div>
								<form:input path="clave" type="password" id="contraseña2" required="required" class="form-control" placeholder="Repetir Contraseña"/>
							</div>
							<div class="form-group col-md-12">
								<div class="form-group col-md-6">
									<input type="reset" class="btn btn-primary pull-left"/>						
								</div>
								<div class="form-group col-md-6">
									<input type="submit" id= "boton" name="submit" class="btn btn-primary pull-right" value="Registrar"/>
								</div>
							</div>							
						</form:form>
	    			</div>
	    		</div>  			
	    	</div>  
    	</div>	
    </div>
	
	<%@include file="footer.jsp" %>
	
<script>
	$(document).ready(function () {
		$('#datepicker').datepicker({format: "dd-mm-yyyy"});  
		$("#datepicker").datepicker({ minDate: "0" });
	});
</script>
  
    <script src="js/jquery.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/price-range.js"></script>
    <script src="js/jquery.scrollUp.min.js"></script>
    <script src="js/jquery.prettyPhoto.js"></script>
    <script src="js/main.js"></script>
	<script src="js/validar.js"></script>
	<script type="text/javascript" src="js/bootstrap-datepicker.js"></script>
</body>
</html>