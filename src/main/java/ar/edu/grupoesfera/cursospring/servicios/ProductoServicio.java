package ar.edu.grupoesfera.cursospring.servicios;

import java.util.Set;

import ar.edu.grupoesfera.cursospring.modelo.Producto;
public interface ProductoServicio {

	Boolean altaProducto();
	Boolean bajaProducto();
	void guardaProductoExistente();
	void modificacionProducto();
	Set<Producto> verProductos();
	Boolean buscaProducto();
	void guardaImagen();
	Producto mostrarImagen();
	Set<Producto> verProductosHombres();
	Set<Producto> verProductosMujeres();
	Set<Producto> verProductosNinos();
	Set<Producto> verProductosNovedades();
}
