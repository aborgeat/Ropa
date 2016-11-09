package ar.edu.grupoesfera.cursospring.servicios;

import java.util.Map;

import ar.edu.grupoesfera.cursospring.modelo.Producto;

public interface CarritoServicio {
	void agregarProductosAlCarrito();
	void eliminarProductosDelCarrito();
	Integer obtenerCantidadDeProductoEnCarrito();	
	Map<Producto, Integer>listadoDeCarrito();	
}
