package ar.edu.grupoesfera.cursospring.servicios;

import java.util.Map;

import org.springframework.stereotype.Service;

import ar.edu.grupoesfera.cursospring.modelo.Producto;

@Service("serviciostock")
public class StockServicioImpl implements StockServicio{

	@Override
	public Boolean agregarProducto() {
		return null;
	}

	@Override
	public Boolean agregarStock() {
		return null;
	}

	@Override
	public Boolean buscaProductoEnStock() {
		return null;
	}

	@Override
	public Boolean eliminarProducto() {
		return null;
	}

	@Override
	public Integer obtenerCantidad() {
		return null;
	}

	@Override
	public Map<Producto, Integer> obtenerStock() {
		return null;
	}

	@Override
	public Boolean revierteStock() {
		return null;
	}


}
