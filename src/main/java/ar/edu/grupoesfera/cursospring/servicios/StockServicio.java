package ar.edu.grupoesfera.cursospring.servicios;

import java.util.Map;

import ar.edu.grupoesfera.cursospring.modelo.Producto;

public interface StockServicio {
	Boolean agregarProducto();
	Boolean agregarStock();
	Boolean buscaProductoEnStock();
	Boolean eliminarProducto();
	Integer obtenerCantidad();	
	Map<Producto, Integer>obtenerStock();	
	Boolean revierteStock();
}
