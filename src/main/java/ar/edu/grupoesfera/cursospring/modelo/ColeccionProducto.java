package ar.edu.grupoesfera.cursospring.modelo;

import java.util.TreeSet;

import java.util.Iterator;
import java.util.Set;

import ar.edu.grupoesfera.cursospring.modelo.Producto;

public class ColeccionProducto {

	private static ColeccionProducto instance = new ColeccionProducto();
	private Set<Producto> productos = new TreeSet<Producto>();
	private ColeccionProducto(){}
	
	public static ColeccionProducto getInstance(){
		return instance;
	}

	/*GUARDAR PRODUCTO EXISTENTE*/
	public void guardaProductoExistente(Producto producto){
	      for(Iterator<Producto> it = productos.iterator(); it.hasNext();){
	    	  Producto cada = it.next();
	    		if(producto.getId().equals(cada.getId())){
	    			producto.setId(cada.getId());
	    			producto.setCategoria(cada.getCategoria());
	    			producto.setNombreProducto(cada.getNombreProducto());
	    			producto.setColor(cada.getColor());
	    			producto.setTalle(cada.getTalle());
	    			producto.setPrecio(cada.getPrecio());
	          }
	      }
	}
	
	/*ALTA DE PRODUCTO*/
	public Boolean altaProducto(Producto producto)throws Exception{
  		if(this.productos.contains(producto)){
        	throw new Exception("EL CODIGO DE PRODUCTO YA EXISTE"); 
        }
        else{
        	this.productos.add(producto);  
        	return true;
        } 
    }
	
	/*LISTADO DE PRODUCTOS*/
	public Set<Producto> verProductos(){
		return this.productos;
	}
	
	/*BAJA DE PRODUCTO*/
	public Boolean bajaProducto(Producto producto)throws Exception{
        if(this.productos.contains(producto)){
        	this.productos.remove(producto);
        	return true;
        }
        else{
        	throw new Exception("EL PRODUCTO NO EXISTE");      	
        }
    }

	/*MODIFICACION DE PRODUCTO*/
	public void modificacionProducto(Producto producto){
            for(Iterator<Producto> it = productos.iterator(); it.hasNext();){
  	    	  Producto cada = it.next();
	    		if(cada.getId().equals(producto.getId())){
	    	    cada.getId();
            	cada.setCategoria(producto.getCategoria());
            	cada.setNombreProducto(producto.getNombreProducto());
            	cada.setColor(producto.getColor());
            	cada.setTalle(producto.getTalle());
            	cada.setPrecio(producto.getPrecio());
            }
          }
    }
	
	/*GETTERS Y SETERS*/
	public Set<Producto> getProductos() {
		return productos;
	}

	public void setProductos(Set<Producto> productos) {
		this.productos = productos;
	}

	public static void setInstance(ColeccionProducto instance) {
		ColeccionProducto.instance = instance;
	}


	/*EQUALS Y HASHCODE*/
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((productos == null) ? 0 : productos.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ColeccionProducto other = (ColeccionProducto) obj;
		if (productos == null) {
			if (other.productos != null)
				return false;
		} else if (!productos.equals(other.productos))
			return false;
		return true;
	}

}
