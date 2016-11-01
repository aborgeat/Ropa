package ar.edu.grupoesfera.cursospring.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ControladorRopa {
	
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


	/*--------------------------------*/
	@RequestMapping ("/contacto")
	public ModelAndView cargaFormContacto(){
		ModelMap modelo = new ModelMap();
		return new ModelAndView ("contacto", modelo);
	}

	@RequestMapping ("/carrito")
	public ModelAndView cargaCarrito(){
		ModelMap modelo = new ModelMap();
		return new ModelAndView ("carrito", modelo);
	}

}
