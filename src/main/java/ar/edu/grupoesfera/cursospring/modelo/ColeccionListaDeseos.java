package ar.edu.grupoesfera.cursospring.modelo;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ColeccionListaDeseos {

	private static ColeccionListaDeseos instance = new ColeccionListaDeseos();
	private Set<Producto> productosListaDeseos = new TreeSet<Producto>();

	//Constructor
	private ColeccionListaDeseos(){}
	
	//Buscador
	public Boolean buscarProductoLista(Producto producto){
		if(this.productosListaDeseos.contains(producto)){
		  
		   return true;
		}
		
		 producto.getId();
		 return false;
	}
	
	//Guardar
	public Boolean guardaProductoLista(Producto producto){
	      for(Iterator<Producto> it = productosListaDeseos.iterator(); it.hasNext();){
	    	  Producto cada = it.next();
	    		if(producto.getId().equals(cada.getId())){
	    			producto.setId(cada.getId());
	    			producto.setCategoria(cada.getCategoria());
	    			producto.setNombreProducto(cada.getNombreProducto());
	    			producto.setImagenproducto(cada.getImagenproducto());
		    	    producto.setNombreimagen(cada.getNombreimagen());
	    			producto.setColor(cada.getColor());
	    			producto.setTalle(cada.getTalle());
	    			producto.setPrecio(cada.getPrecio());
	    			return true;
	          }
	      }
	      return false;
	}
	
	//Poner el producto indicado en lista de deseos
	public Boolean ponerProductoLista(Producto producto){
  		if(!this.productosListaDeseos.contains(producto)){
  			this.productosListaDeseos.add(producto);
  			return true;  //si ya esta, no hace nada
        }
        else{
        	//this.productosListaDeseos.add(producto);  
        	return true;  //si no est�, lo agrega
        } 
	}
	
	//Quitar un determinado producto de la lista de deseos
	public Boolean quitarProductoLista(Producto producto){
  		if(this.productosListaDeseos.contains(producto)){
  			this.productosListaDeseos.remove(producto);
  			return true;  //si ya esta, borra el producto de la lista
        }
        else{
        	return false;  //si no est�, no hace nada
        } 
	}
	
	//Ver productos en la lista
	public Set<Producto> verProductosListaDeseos(){
		return this.productosListaDeseos;
	}
	
	//Comprueba lista vacia
	public Boolean listaDeseosVacia(){
		if(this.productosListaDeseos.isEmpty()){
			return true;
		}
		else{
			return false;
		}
	}

	//Getters y Setters
	public static ColeccionListaDeseos getInstance() {
		return instance;
	}

	public static void setInstance(ColeccionListaDeseos instance) {
		ColeccionListaDeseos.instance = instance;
	}

	public Set<Producto> getProductosListaDeseos() {
		return productosListaDeseos;
	}

	public void setProductosListaDeseos(Set<Producto> productosListaDeseos) {
		this.productosListaDeseos = productosListaDeseos;
	}
	
}
