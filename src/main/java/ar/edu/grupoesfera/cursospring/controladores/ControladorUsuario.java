package ar.edu.grupoesfera.cursospring.controladores;

import javax.inject.Inject;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.modelo.ColeccionUsuario;
import ar.edu.grupoesfera.cursospring.modelo.Usuario;
import ar.edu.grupoesfera.cursospring.servicios.UsuarioServicio;

@RestController
public class ControladorUsuario {
	@Inject
	private UsuarioServicio serviciousuario;

	/*ALTA USUARIO*/
	@RequestMapping (value = "/altaUsuFormulario")
	public ModelAndView altaUsuFormulario(@ModelAttribute("usuario")Usuario usuario){
		ModelMap modelo = new ModelMap();
		return new ModelAndView ("altaUsuFormulario", modelo);
	}
	
	@RequestMapping (value = "/altaUsuConfirma")
	public ModelAndView altaUsuConfirma(@ModelAttribute("usuario")Usuario usuario){
		String info;
		ColeccionUsuario serviciousuario = ColeccionUsuario.getInstance();
		ModelMap modelo = new ModelMap();
		try{
			serviciousuario.altaUsuario(usuario);
		info="ALTA DE USUARIO EXITOSA";
		}catch(Exception e){
			serviciousuario.guardaUsuarioExistente(usuario);
			info= e.getMessage();
		}
		modelo.put("info", info);
		return new ModelAndView ("altaUsuConfirma", modelo);
	}
	
	/*LISTADO DE USUARIOS*/
	@RequestMapping (value = "/verUsuarios")
	public ModelAndView verUsuarios(@ModelAttribute("usuario")Usuario usuario){
		ModelMap modelo = new ModelMap();
		ColeccionUsuario serviciousuario = ColeccionUsuario.getInstance();
		modelo.put("serviciousuario", serviciousuario.verUsuarios());
		return new ModelAndView ("verUsuarios", modelo);
	}

	/*BAJA Y MODIFICACION DE USUARIO*/
	@RequestMapping (value = "/bajaOmodifUsu")
	public ModelAndView bajaOmodifUsu(@ModelAttribute("usuario")Usuario usuario){
		ModelMap modelo = new ModelMap();
		ColeccionUsuario serviciousuario = ColeccionUsuario.getInstance();
		modelo.put("usuarios", serviciousuario.verUsuarios());
		return new ModelAndView ("/bajaOmodifUsu", modelo);
	}
	
	/*BAJA DE USUARIO*/
	@RequestMapping (value = "/bajaUsuConfirma")
	public ModelAndView bajaProConfirma(@ModelAttribute("usuario")Usuario usuario,
								              @RequestParam (value="eMail")String eMail){
		ColeccionUsuario serviciousuario = ColeccionUsuario.getInstance();
		ModelMap modelo = new ModelMap();
		serviciousuario.guardaUsuarioExistente(usuario);
		modelo.put("nombreYapellido",usuario.getNombreYapellido());
		modelo.put("dni",usuario.getDni());	
		modelo.put("domicilio",usuario.getDomicilio());
		modelo.put("telefono",usuario.getTelefono());
		modelo.put("fechaNacimiento",usuario.getFechaNacimiento());
		modelo.put("eMail",usuario.geteMail());
		modelo.put("clave",usuario.getClave());
		modelo.put("tipo",usuario.getTipo());		
		return new ModelAndView ("/bajaUsuConfirma", modelo);
	}
	
	@RequestMapping (value = "/bajaUsuOk")
	public ModelAndView bajaUsuOk(@ModelAttribute("usuario")Usuario usuario){
		String info;
		String boton="Eliminar Otro";
		ModelMap modelo = new ModelMap();
		ColeccionUsuario serviciousuario = ColeccionUsuario.getInstance();
		try{
			serviciousuario.bajaUsuario(usuario);
		info="BAJA DE USUARIO EXITOSA";
		}catch(Exception e){
			info= e.getMessage();
		}
		modelo.put("info", info);
		modelo.put("boton", boton);
		modelo.put("usuarios", serviciousuario.verUsuarios());
		return new ModelAndView ("/bajaOmodifUsuOk", modelo);
	}
	
	/*MODIFICACION DE USUARIO*/
	@RequestMapping (value = "/modifUsuConfirma")
	public ModelAndView modifUsuConfirma(@ModelAttribute("usuario")Usuario usuario,
								              @RequestParam (value="eMail")String eMail){
		String info="MODIFICACIÓN DE USUARIO";
		String boton="Modificar";
		ModelMap modelo = new ModelMap();
		ColeccionUsuario serviciousuario = ColeccionUsuario.getInstance();
		serviciousuario.guardaUsuarioExistente(usuario);
		modelo.put("info", info);
		modelo.put("boton", boton);
		return new ModelAndView ("/modifUsuConfirma", modelo);
	}
	
	@RequestMapping (path = "/modifUsuOk")
	public ModelAndView modifUsuOk(@ModelAttribute("usuario")Usuario usuario,
            					   @RequestParam (value="eMail")String eMail){
		String info;
		String boton="Modificar Otro";
		ModelMap modelo = new ModelMap();
		ColeccionUsuario serviciousuario = ColeccionUsuario.getInstance();
		serviciousuario.modificacionUsuario(usuario);	
		info="MODIFICACION DE USUARIO EXITOSA";		
		modelo.put("info", info);
		modelo.put("boton", boton);
		modelo.put("usuarios", serviciousuario.verUsuarios());
		return new ModelAndView ("/bajaOmodifUsuOk", modelo);
	}

	/*REGISTRO DE USUARIO*/
	@RequestMapping ("/registro")
	public ModelAndView cargaFormRegistro(@ModelAttribute("usuario")Usuario usuario){
		ModelMap modelo = new ModelMap();
		return new ModelAndView ("registro", modelo);
	}
	@RequestMapping (value = "/regUsuConfirma")
	public ModelAndView regUsuConfirma(@ModelAttribute("usuario")Usuario usuario){
		String info;
		ColeccionUsuario serviciousuario = ColeccionUsuario.getInstance();
		ModelMap modelo = new ModelMap();
		try{
			serviciousuario.altaUsuario(usuario);
			info="REGISTRO EXITOSO";
		}catch(Exception e){
			usuario.setNombreYapellido(null);
			usuario.setDni(null);
			usuario.setDomicilio(null);
			usuario.setFechaNacimiento(null);
			usuario.setTelefono(null);
			usuario.geteMail();
			usuario.setClave(null);
			info= e.getMessage();
		}
		modelo.put("info", info);
		return new ModelAndView ("regUsuConfirma", modelo);
	}

	/*GETTERS Y SETERS*/

	public UsuarioServicio getServiciousuario() {
		return serviciousuario;
	}

	public void setServiciousuario(UsuarioServicio serviciousuario) {
		this.serviciousuario = serviciousuario;
	}
}
