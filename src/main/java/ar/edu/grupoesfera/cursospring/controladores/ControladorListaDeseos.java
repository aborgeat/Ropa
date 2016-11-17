package ar.edu.grupoesfera.cursospring.controladores;

import java.util.Iterator;

import javax.inject.Inject;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.servicios.ProductoServicio;
import ar.edu.grupoesfera.cursospring.modelo.ColeccionListaDeseos;
import ar.edu.grupoesfera.cursospring.modelo.ColeccionProducto;
import ar.edu.grupoesfera.cursospring.modelo.Producto;
import ar.edu.grupoesfera.cursospring.servicios.ListaDeseosServicio;

@RestController
public class ControladorListaDeseos {

	@Inject
	private ProductoServicio servicioproducto;
	@Inject
	private ProductoServicio servicioListaDeseos;
	
	@RequestMapping(value = "/agregarAListaDeseos", method = RequestMethod.GET)
	public ModelAndView agregarProductoAListaDeseos(@ModelAttribute("producto")Producto producto,
			                                        @RequestParam(value="id")Integer id){
		ModelMap modelo = new ModelMap();
		ColeccionProducto servicioproducto = ColeccionProducto.getInstance();
		ColeccionListaDeseos servicioListaDeseos = ColeccionListaDeseos.getInstance();
		String info = "";
		String info2="";
		try{
		   servicioproducto.buscaProducto(producto);
		   for(Iterator<Producto> it = servicioproducto.getProductos().iterator(); it.hasNext();){
		      Producto cada = it.next();
		      if(producto.getId().equals(cada.getId())){
		         servicioListaDeseos.ponerProductoLista(cada);
		   } 
		}
		   info="EXISTE PRODUCTO";
		}catch(Exception e){
		   info= "PRODUCTO NO ENCONTRADO";
		}
		
		//Comprobacion de lista vacia
	    if(servicioListaDeseos.listaDeseosVacia()){
		   info2="LISTA VACIA";
		}
	    else{
			info2="LISTA NO VACIA";
		}
		
		modelo.put("info", info);
		modelo.put("info2", info2);
		modelo.put("servicioListaDeseos", servicioListaDeseos.verProductosListaDeseos());
		return new ModelAndView("verListaDeseos", modelo);
	}
	
	//Ver pagina de confirmacion de quitar producto de la lista
	@RequestMapping(value = "/quitarListaDeseos", method = RequestMethod.GET)
	public ModelAndView quitarProductoListaDeseos(@ModelAttribute("producto")Producto producto,
                                                  @RequestParam(value="id")Integer id){
         ModelMap modelo = new ModelMap();
         ColeccionProducto servicioproducto = ColeccionProducto.getInstance();
 		 ColeccionListaDeseos servicioListaDeseos = ColeccionListaDeseos.getInstance();
 		 String info = "";
 		 servicioListaDeseos.guardaProductoLista(producto);
 		 servicioListaDeseos.verProductosListaDeseos();
 		 modelo.put("info", info);
 		 return new ModelAndView ("quitarListaDeseos", modelo);
	}
	
	//Quitar producto indicado de la lista de deseos
	@RequestMapping(value = "/quitarListaDeseosConfirmado", method = RequestMethod.GET)
	public ModelAndView quitarProductoListaDeseosConfirmado(@ModelAttribute("producto")Producto producto,
                                                            @RequestParam(value="id")Integer id){
         ModelMap modelo = new ModelMap();
         ColeccionProducto servicioproducto = ColeccionProducto.getInstance();
 		 ColeccionListaDeseos servicioListaDeseos = ColeccionListaDeseos.getInstance();
 		 servicioListaDeseos.guardaProductoLista(producto);
 		 String info = "";
 		 try{
			servicioListaDeseos.quitarProductoLista(producto);
		    info = "BAJA DE PRODUCTO EXITOSA";
		 }catch(Exception e){
			info = "NO SE PUDO QUITAR EL PRODUCTO";
		 }
 		 modelo.put("info", info);
 		 return new ModelAndView ("quitarListaDeseosConfirmado", modelo);
	}
	
	//VerListaDeseos
	@RequestMapping(value = "/verListaDeseos", method = RequestMethod.GET)
	public ModelAndView agregarVerProductoAListaDeseos(@ModelAttribute("producto")Producto producto){
		ModelMap modelo = new ModelMap();
		ColeccionProducto servicioproducto = ColeccionProducto.getInstance();
		ColeccionListaDeseos servicioListaDeseos = ColeccionListaDeseos.getInstance();
		String info = "";
		String info2="";
		try{
		   servicioproducto.buscaProducto(producto);
		   for(Iterator<Producto> it = servicioproducto.getProductos().iterator(); it.hasNext();){
		      Producto cada = it.next();
		      if(producto.getId().equals(cada.getId())){
		         servicioListaDeseos.ponerProductoLista(cada);
		   } 
		}
		   info="EXISTE PRODUCTO";
		}catch(Exception e){
		   info= "PRODUCTO NO ENCONTRADO";
		}
		
		//Comprobacion de lista vacia
	    if(servicioListaDeseos.listaDeseosVacia()){
	        info2="LISTA VACIA";
		}
	    else{
			info2="LISTA NO VACIA";
		}
		
		modelo.put("info", info);
		modelo.put("info2", info2);
		modelo.put("servicioListaDeseos", servicioListaDeseos.verProductosListaDeseos());
		return new ModelAndView("verListaDeseos", modelo);
	}

	//Getters y Setters
	public ProductoServicio getServicioproducto() {
		return servicioproducto;
	}

	public void setServicioproducto(ProductoServicio servicioproducto) {
		this.servicioproducto = servicioproducto;
	}

	public ProductoServicio getServicioListaDeseos() {
		return servicioListaDeseos;
	}

	public void setServicioListaDeseos(ProductoServicio servicioListaDeseos) {
		this.servicioListaDeseos = servicioListaDeseos;
	}

}
