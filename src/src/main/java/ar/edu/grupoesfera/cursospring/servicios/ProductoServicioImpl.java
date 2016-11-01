package ar.edu.grupoesfera.cursospring.servicios;

import java.util.Set;

import javax.servlet.annotation.MultipartConfig;

import org.springframework.stereotype.Service;

import ar.edu.grupoesfera.cursospring.modelo.Producto;

@Service("servicioproducto")
@MultipartConfig
public class ProductoServicioImpl implements ProductoServicio {


	@Override
	public Boolean altaProducto() {
		return null;
	}

	@Override
	public Boolean bajaProducto() {
		return null;
	}

	@Override
	public void guardaProductoExistente() {	
	}

	@Override
	public void modificacionProducto() {	
	}

	@Override
	public Set<Producto> verProductos() {
		return null;
	}

	@Override
	public void guardaImagen() {
		
	}

	@Override
	public Producto mostrarImagen() {
		return null;
	}

	@Override
	public Boolean buscaProducto() {
		return null;
	}

	@Override
	public Set<Producto> verProductosHombres() {
		return null;
	}

	@Override
	public Set<Producto> verProductosMujeres() {
		return null;
	}

	@Override
	public Set<Producto> verProductosNinos() {
		return null;
	}

}
