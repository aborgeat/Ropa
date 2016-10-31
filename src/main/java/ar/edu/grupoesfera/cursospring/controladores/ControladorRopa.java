package ar.edu.grupoesfera.cursospring.controladores;

import javax.inject.Inject;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.servicios.ProductoServicio;

@RestController
public class ControladorRopa {
	@Inject
	private ProductoServicio servicioproducto;
	
	
	/*ADMINISTRADOR*/
	@RequestMapping (value = "/administrar")
	public ModelAndView administrar(){
		ModelMap modelo = new ModelMap();
		return new ModelAndView ("administrar", modelo);
	}
	
	/*HOME*/
	@RequestMapping (value = "/home")
	public ModelAndView home(){
		ModelMap modelo = new ModelMap();
		return new ModelAndView ("home", modelo);
	}
	
	/*ERROR*/
	@RequestMapping (value = "/error")
	public ModelAndView error(){
		ModelMap modelo = new ModelMap();
		return new ModelAndView ("error", modelo);
	}

	@RequestMapping ("/contacto")
	public ModelAndView cargaFormContacto(){
		ModelMap modelo = new ModelMap();
		return new ModelAndView ("contacto", modelo);
	}
	/*--------------------------------*/


	@RequestMapping ("/productosMu")
	public ModelAndView cargaProductosMujeres(){
		ModelMap modelo = new ModelMap();
		return new ModelAndView ("productosMu", modelo);
	}
	@RequestMapping ("/productosHo")
	public ModelAndView cargaProductosHombres(){
		ModelMap modelo = new ModelMap();
		return new ModelAndView ("productosHo", modelo);
	}
	@RequestMapping ("/productosNi")
	public ModelAndView cargaProductosNinos(){
		ModelMap modelo = new ModelMap();
		return new ModelAndView ("productosNi", modelo);
	}
	@RequestMapping ("/carrito")
	public ModelAndView cargaCarrito(){
		ModelMap modelo = new ModelMap();
		return new ModelAndView ("carrito", modelo);
	}

	/*GETTERS Y SETERS*/
	public ProductoServicio getServicioproducto() {
		return servicioproducto;
	}

	public void setServicioproducto(ProductoServicio servicioproducto) {
		this.servicioproducto = servicioproducto;
	}
}
