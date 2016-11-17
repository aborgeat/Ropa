package ar.edu.grupoesfera.cursospring.modelo;

import java.util.TreeSet;

//import org.hibernate.annotations.common.util.impl.Log_.logger;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.Iterator;
import java.util.Set;

import ar.edu.grupoesfera.cursospring.modelo.Producto;

public class ColeccionProducto {

	private static ColeccionProducto instance = new ColeccionProducto();
	private Set<Producto> productos = new TreeSet<Producto>();

	private ColeccionProducto(){}
	
	/*BUSCAR PRODUCTO*/
	public Boolean buscaProducto(Producto producto) throws Exception{
	      for(Iterator<Producto> it = productos.iterator(); it.hasNext();){
	    	  Producto cada = it.next();
	    		if(producto.getId().equals(cada.getId())){
	    			producto.setId(cada.getId());
		    	    producto.setCategoria(cada.getCategoria());
		    	    producto.setNombreProducto(cada.getNombreProducto());
		    	    producto.setDescripcion(cada.getDescripcion());
		    	    producto.setImagenproducto(cada.getImagenproducto());
		    	    producto.setNombreimagen(cada.getNombreimagen());
		    	    producto.setColor(cada.getColor());
		    	    producto.setTalle(cada.getTalle());
		    	    producto.setPrecio(cada.getPrecio());
		    	    producto.setNovedad(cada.getNovedad());
	    			return true;
	    		}
	      }
	      			producto.getId();
	    			throw new Exception ("EL PRODUCTO NO EXISTE");
	}
	
	/*GUARDAR PRODUCTO EXISTENTE*/
	public void guardaProductoExistente(Producto producto){
	      for(Iterator<Producto> it = productos.iterator(); it.hasNext();){
	    	  Producto cada = it.next();
	    		if(producto.getId().equals(cada.getId())){
	    			producto.setId(cada.getId());
	    			producto.setCategoria(cada.getCategoria());
	    			producto.setNombreProducto(cada.getNombreProducto());
		    	    producto.setDescripcion(cada.getDescripcion());
	    			producto.setImagenproducto(cada.getImagenproducto());
		    	    producto.setNombreimagen(cada.getNombreimagen());
	    			producto.setColor(cada.getColor());
	    			producto.setTalle(cada.getTalle());
	    			producto.setPrecio(cada.getPrecio());
	    			producto.setNovedad(cada.getNovedad());
	          }
	      }
	}
	
	/*ALTA DE PRODUCTO*/
	public Boolean altaProducto(Producto producto)throws Exception{
  		if(this.productos.contains(producto)){
        	throw new Exception("EL CODIGO DE PRODUCTO YA EXISTE"); 
        }
        else{
        	
            Producto fichero= (Producto) producto;
            MultipartFile multipart = fichero.getImagenproducto();
            String ruta = "C:/Java/workspace/Ropa-master/src/main/webapp/images/productos";
            try {
                 File path = new File(ruta);
                 producto.setNombreimagen(multipart.getOriginalFilename());
                 multipart.transferTo(new File(path, multipart.getOriginalFilename()));
            } catch (Exception e) {
                // logger.error("Error al copiar fichero", e);
                 throw e;
            }
        }
        	this.productos.add(producto);  
        	return true;
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
            	cada.setDescripcion(producto.getDescripcion());
               	cada.getImagenproducto();
               	cada.getNombreimagen();
            	cada.setColor(producto.getColor());
            	cada.setTalle(producto.getTalle());
            	cada.setPrecio(producto.getPrecio());
            	cada.setNovedad(producto.getNovedad());
            }
          }
    }
	
	/*LISTADO DE PRODUCTOS POR CATEGORIA*/
	public Set<Producto> verProductosPorCategoria(Producto producto, String categoria){
		 Set<Producto> listaPorCategoria = new TreeSet<Producto>();
         for (Producto cada : productos){  
        	 if(cada.getCategoria().toString().equals(categoria)){
        		 listaPorCategoria.add(cada);
        	 }
         }
         return listaPorCategoria;
	}
	
	/*LISTADO DE NOVEDADES*/
	public Set<Producto> verProductosNovedades(Producto producto){
		 Set<Producto> novedades = new TreeSet<Producto>();
		 String esperado = "si";
         for (Producto cada : productos){  
        	 if(cada.getNovedad().equals(esperado)){
        		 novedades.add(cada);
        	 }
            }
         return novedades;
	}
	
	/*BUSCADOR*/
	public Boolean buscarProductoBuscador(String busqueda) throws Exception{
	      for(Iterator<Producto> it = productos.iterator(); it.hasNext();){
	    	  Producto cada = it.next();
	    	  if(cada.getCategoria().toString().equals(busqueda) || busqueda.equals(cada.getNombreProducto()) || cada.getColor().toString().equals(busqueda) || cada.getTalle().toString().equals(busqueda)){
	    			return true;
	    		}
	      }
	    			throw new Exception ("NO SE OBTUVIERON RESULTADOS");
	}
	
	public Set<Producto> verResultadoBusqueda(Producto producto, String busqueda){
		 Set<Producto> resultadoBusqueda = new TreeSet<Producto>();
        for (Producto cada : productos){  
        	if(cada.getCategoria().toString().equals(busqueda) || busqueda.equals(cada.getNombreProducto()) || cada.getColor().toString().equals(busqueda) || cada.getTalle().toString().equals(busqueda)){
       		 resultadoBusqueda.add(cada);
       	 }
        }
        return resultadoBusqueda;
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

	public static ColeccionProducto getInstance(){
		return instance;
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
