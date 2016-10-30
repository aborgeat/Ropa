package ar.edu.grupoesfera.cursospring.modelo;

import java.util.TreeSet;

//import org.hibernate.annotations.common.util.impl.Log_.logger;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
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
	public Set<Producto> verProductos() throws IOException{
		Producto producto = new Producto();
	      for(Iterator<Producto> it = productos.iterator(); it.hasNext();){
	    			producto.getId();
	    			producto.getCategoria();
	    			producto.getNombreProducto();
	    			producto.getImagenproducto().getContentType();
	    			producto.getColor();
	    			producto.getTalle();
	    			producto.getPrecio();
	      }
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
               	cada.setImagenproducto(producto.getImagenproducto());
            	cada.setColor(producto.getColor());
            	cada.setTalle(producto.getTalle());
            	cada.setPrecio(producto.getPrecio());
            }
          }
    }
	
    /*GUARDAR IMAGEN
	public void guardarImagen(Producto producto) throws Exception {
		MultipartFile fichero = producto.getImagenproducto();
		String ruta = "C:/PRODUCTOS/ropa/src/main/webapp/images/productos/";
    	File localFile = new File(ruta+fichero.getOriginalFilename());
    	FileOutputStream os = null;
    	FileInputStream is = null;
    	
    	try {
    		os = new FileOutputStream(localFile);
    		os.write(fichero.getBytes());
            fichero.getContentType();
            is = new FileInputStream(localFile);
            is.read(fichero.getBytes());
 
    		
    	} finally {
    		if (os != null) {
    			try {
					os.close();
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
    		}
	}
    	}*/

	/*GUARDAR IMAGEN
	public void guardarImagen(Producto producto) throws Exception {
	MultipartFile fichero = producto.getImagenproducto();
	File localFile = new File("C:/PRODUCTOS/ropa/src/main/webapp/images/productos/"+fichero.getOriginalFilename());
	FileOutputStream os = null;
	
	try {
		os = new FileOutputStream(localFile);
		os.write(fichero.getBytes());
		
	} finally {
		if (os != null) {
			try {
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}*/

	/*GUARDAR IMAGEN
	public void guardarImagen(Producto producto) throws Exception {
        Producto fichero= (Producto) producto;
        MultipartFile multipart = fichero.getImagenproducto();
        String ruta = "C:/PRODUCTOS/ropa/src/main/webapp/images/productos/";
        try {
             File path = new File(ruta);
             multipart.transferTo(new File(path, multipart.getOriginalFilename()));
        } catch (Exception e) {
            // logger.error("Error al copiar fichero", e);
             throw e;
        }
    }*/

	/*MOSTRAR IMAGEN
	public Producto mostrarImagen(Producto producto){
		
        for(Iterator<Producto> it = productos.iterator(); it.hasNext();){
	    	  Producto cada = it.next();
    		if(cada.getId().equals(producto.getId())){
    			producto.getImagenproducto().getOriginalFilename();
        }
      }
	return producto;
}*/
	
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
