<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<div class="header-middle">
			<div class="container">
				<div class="row">
					<div class="col-sm-8">
						<div class="logo pull-left agranda">
							<a href="index.html"><img src="images/home/logo.png" alt=""/></a>
						</div>
					</div>
                
	                <div class="col-sm-4">
						<div class="row">
							<div class="col-sm-12">
								<div class="shop-menu pull-right">
									<ul class="nav navbar-nav">
										<li><a href="/ropa/carrito"><i class="fa fa-shopping-cart"></i> Carrito</a></li>
										<li><a href="#myModal" data-toggle="modal" data-target="#myModal"><i class="fa fa-user" ></i> Ingresar</a></li>
									</ul>
								</div>
							</div>
						</div>
	                    
	                    <div class="row">
							<div class="col-sm-10 pull-right">
								<form class="navbar-form navbar-right" role="search">
									<div class="input-group">
										<input type="text" class="form-control" placeholder="Buscar"/>
										<span class="input-group-btn borde">
											<button type="submit" class="btn btn-primary">
											<span class="glyphicon glyphicon-search"></span>
											</button>
										</span>
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

<!--LOGIN-->
<div class="modal fade" id="myModal">
	<div class="modal-dialog">
      <div class="modal-content modal-agregar">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
		  <h4 class="modal-title text-center" id="exampleModalLabel">Login</h4>
        </div>
        <div class="modal-body">
			<form id="acceder" role="form" action="" method="post">
			  <div class="form-group">
			  	<div id="alert8">El usuario y/o contraseña no coinciden.</div>
				<input class="form-control" name="Email" id="acceder-usuario" placeholder="E-mail" type="email" required="required">
			  </div>
			  <div class="form-group">
				<input class="form-control" name="Contrasenia" id="acceder-contraseña" placeholder="Contraseña" type="password" required="required">
			  </div>
				<div class="modal-footer">	
					<a href="#registro">¿No tenés cuenta? Registrate </a>
					<button type="submit"  class="btn btn-primary pull-right" id="boton">Ingresar</button>
				</div>
			</form>
		</div>
      </div>
    </div>
</div>

</body>
</html>