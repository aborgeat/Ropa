package ar.edu.grupoesfera.cursospring.servicios;

import java.util.Set;

import org.springframework.web.multipart.MultipartFile;

import ar.edu.grupoesfera.cursospring.modelo.Producto;
public interface ProductoServicio {

	Boolean altaProducto();
	Boolean bajaProducto();
	void guardaProductoExistente();
	void modificacionProducto();
	Set<Producto> verProductos();
	Boolean buscaProducto();
	void guardaImagen();
	MultipartFile mostrarImagen();
}
