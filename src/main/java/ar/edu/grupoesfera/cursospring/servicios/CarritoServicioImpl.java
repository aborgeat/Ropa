package ar.edu.grupoesfera.cursospring.servicios;

import java.util.Map;

import org.springframework.stereotype.Service;

import ar.edu.grupoesfera.cursospring.modelo.Producto;

@Service("serviciocarrito")
public class CarritoServicioImpl implements CarritoServicio{

	@Override
	public void agregarProductosAlCarrito() {
	}

	@Override
	public void eliminarProductosDelCarrito() {
	}

	@Override
	public Integer obtenerCantidadDeProductoEnCarrito() {
		return null;
	}

	@Override
	public Map<Producto, Integer> listadoDeCarrito() {
		return null;
	}
}
