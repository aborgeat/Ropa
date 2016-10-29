package ar.edu.grupoesfera.cursospring.controladores;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.modelo.Usuario;

@Controller
public class ControladorLogout extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	@RequestMapping(value = "/logout")
	public ModelAndView logout(HttpServletRequest request,
			HttpServletResponse response, @ModelAttribute("usuario")Usuario usuario) throws ServletException, IOException {
		response.setContentType("text/html");
		ModelMap modelo = new ModelMap();
		HttpSession session = request.getSession(false);
		// session.setAttribute("user", null);
		session.removeAttribute("user");
		session.getMaxInactiveInterval();
		return new ModelAndView("home", modelo);
	}

}