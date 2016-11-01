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
		    	    producto.setImagenproducto(cada.getImagenproducto());
		    	    producto.setNombreimagen(cada.getNombreimagen());
		    	    producto.setColor(cada.getColor());
		    	    producto.setTalle(cada.getTalle());
		    	    producto.setPrecio(cada.getPrecio());
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
	    			producto.setImagenproducto(cada.getImagenproducto());
		    	    producto.setNombreimagen(cada.getNombreimagen());
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
        	
            Producto fichero= (Producto) producto;
            MultipartFile multipart = fichero.getImagenproducto();
            String ruta = "C:/PRODUCTOS/ropa/src/main/webapp/images/productos/";
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
               	cada.getImagenproducto();
               	cada.getNombreimagen();
            	cada.setColor(producto.getColor());
            	cada.setTalle(producto.getTalle());
            	cada.setPrecio(producto.getPrecio());
            }
          }
    }
	
	/*LISTADO DE PRODUCTOS POR CATEGORIA HOMBRES*/
	public Set<Producto> verProductosHombres(Producto producto){
		 Set<Producto> hombres = new TreeSet<Producto>();
		 Categoria esperado = Categoria.HOMBRES;
         for (Producto cada : productos){  
        	 if(cada.getCategoria().equals(esperado)){
        	      hombres.add(cada);
        	 }
            }
         return hombres;
	}
	
	/*LISTADO DE PRODUCTOS POR CATEGORIA MUJERES*/
	public Set<Producto> verProductosMujeres(Producto producto){
		 Set<Producto> mujeres = new TreeSet<Producto>();
		 Categoria esperado = Categoria.MUJERES;
         for (Producto cada : productos){  
        	 if(cada.getCategoria().equals(esperado)){
        	      mujeres.add(cada);
        	 }
            }
         return mujeres;
	}
	
	/*LISTADO DE PRODUCTOS POR CATEGORIA NIÑOS*/
	public Set<Producto> verProductosNinos(Producto producto){
		 Set<Producto> ninos = new TreeSet<Producto>();
		 Categoria esperado = Categoria.NIÑOS;
         for (Producto cada : productos){  
        	 if(cada.getCategoria().equals(esperado)){
        		 ninos.add(cada);
        	 }
            }
         return ninos;
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
