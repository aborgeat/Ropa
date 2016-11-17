package ar.edu.grupoesfera.cursospring.servicios;

import java.util.Set;

import ar.edu.grupoesfera.cursospring.modelo.Producto;

public interface ListaDeseosServicio {

	Boolean buscarProductoLista();
	Boolean guardaProductoLista();
	void buscaProductoLista();
	Boolean ponerProductoLista();
	Boolean quitarProductoLista();
	Set<Producto> verProductosListaDeseos();
	Boolean listaDeseosVacia();
	
}