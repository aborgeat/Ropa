package ar.edu.grupoesfera.cursospring.controladores;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.modelo.ColeccionUsuario;
import ar.edu.grupoesfera.cursospring.modelo.Usuario;
import ar.edu.grupoesfera.cursospring.servicios.UsuarioServicio;

@RestController
public class ControladorLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Inject
	private UsuarioServicio serviciousuario;
	
	@RequestMapping(value = "/home")
	public ModelAndView login(HttpServletRequest request,
			HttpServletResponse response, @ModelAttribute("usuario")Usuario usuario) throws ServletException, IOException {
		response.setContentType("text/html");
		ColeccionUsuario serviciousuario = ColeccionUsuario.getInstance();
		ModelMap modelo = new ModelMap();
		Usuario miusuario = new Usuario();
		miusuario.seteMail(request.getParameter("emaillog"));
		miusuario.setClave(request.getParameter("clavelog"));
		String mail= request.getParameter("emaillog");
		String clav= (request.getParameter("clavelog"));
		serviciousuario.buscaUsuario(miusuario);
		if (miusuario.geteMail().equals(mail)
			&& miusuario.getClave().equals(clav)){
			
			if (miusuario.getTipo().equals("usuario")) {
				HttpSession session = request.getSession(true); 
				session.setAttribute("user", request.getParameter("emaillog"));
				session.setMaxInactiveInterval(30);
				return new ModelAndView("home", modelo);
			}
			if (miusuario.getTipo().equals("administrador")) {			
				HttpSession session = request.getSession(true); 
				session.setAttribute("user", request.getParameter("emaillog"));
				session.setMaxInactiveInterval(30);
				return new ModelAndView("administrar", modelo);				
		}
		}else{
			
		}
		String info="Usuario y/o Contraseña Incorrectos";
		modelo.put("info", info);
		return new ModelAndView("/error", modelo);
	}

	/*GETTERS Y SETERS*/
	public UsuarioServicio getServiciousuario() {
		return serviciousuario;
	}

	public void setServiciousuario(UsuarioServicio serviciousuario) {
		this.serviciousuario = serviciousuario;
	}
}