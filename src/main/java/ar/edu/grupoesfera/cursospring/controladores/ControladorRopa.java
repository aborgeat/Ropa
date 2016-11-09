package ar.edu.grupoesfera.cursospring.controladores;

import javax.inject.Inject;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.modelo.ColeccionProducto;
import ar.edu.grupoesfera.cursospring.modelo.Producto;
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
	public ModelAndView home(@ModelAttribute("producto")Producto producto){
		ColeccionProducto servicioproducto = ColeccionProducto.getInstance();
		ModelMap modelo = new ModelMap();
		modelo.put("servicioproducto", servicioproducto.verProductosNovedades(producto));
		return new ModelAndView ("home", modelo);
	}
	
	/*ERROR*/
	@RequestMapping (value = "/error")
	public ModelAndView error(){
		ModelMap modelo = new ModelMap();
		return new ModelAndView ("error", modelo);
	}

<<<<<<< HEAD

=======
>>>>>>> origin/master
	/*GETTERS Y SETTERS*/
	public ProductoServicio getServicioproducto() {
		return servicioproducto;
	}

	public void setServicioproducto(ProductoServicio servicioproducto) {
		this.servicioproducto = servicioproducto;
	}

}
