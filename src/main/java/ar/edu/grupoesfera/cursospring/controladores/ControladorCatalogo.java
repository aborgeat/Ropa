package ar.edu.grupoesfera.cursospring.controladores;

import javax.inject.Inject;
import javax.servlet.http.HttpServlet;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.modelo.ColeccionProducto;
import ar.edu.grupoesfera.cursospring.modelo.Producto;
import ar.edu.grupoesfera.cursospring.servicios.ProductoServicio;


@RestController
public class ControladorCatalogo extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@Inject
	private ProductoServicio servicioproducto;
	
	/*PRODUCTOS MUJERES*/
	@RequestMapping ("/productosMu")
	public ModelAndView cargaProductosMujeres(@ModelAttribute("producto")Producto producto){
		ColeccionProducto servicioproducto = ColeccionProducto.getInstance();
		ModelMap modelo = new ModelMap();
		modelo.put("servicioproducto", servicioproducto.verProductosMujeres(producto));	
		return new ModelAndView ("productosMu", modelo);
	}
	
	/*PRODUCTOS HOMBRES*/
	@RequestMapping ("/productosHo")
	public ModelAndView cargaProductosHombres(@ModelAttribute("producto")Producto producto){
		ColeccionProducto servicioproducto = ColeccionProducto.getInstance();
		ModelMap modelo = new ModelMap();
		modelo.put("servicioproducto", servicioproducto.verProductosHombres(producto));	
		return new ModelAndView ("productosHo", modelo);
	}
	
	/*PRODUCTOS NIÑOS*/
	@RequestMapping ("/productosNi")
	public ModelAndView cargaProductosNinos(@ModelAttribute("producto")Producto producto){
		ColeccionProducto servicioproducto = ColeccionProducto.getInstance();
		ModelMap modelo = new ModelMap();
		modelo.put("servicioproducto", servicioproducto.verProductosNinos(producto));	
		return new ModelAndView ("productosNi", modelo);
	}
	
	/*GETTERS Y SETTERS*/
	public ProductoServicio getServicioproducto() {
		return servicioproducto;
	}
	public void setServicioproducto(ProductoServicio servicioproducto) {
		this.servicioproducto = servicioproducto;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
