package ar.edu.grupoesfera.cursospring.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.modelo.ClaseEnvioMail;
import ar.edu.grupoesfera.cursospring.modelo.Mail;

@Controller
public class ControladorContacto {

	@RequestMapping ("/contacto")
	public ModelAndView cargaFormContacto(@ModelAttribute("mensaje")Mail mensaje){
		ModelMap modelo = new ModelMap();
		Mail mensajeNuevo = new Mail();
		return new ModelAndView ("contacto", modelo);
	}
	
	@RequestMapping (path = "/contactoMensajeExito", method = RequestMethod.POST)
	public ModelAndView enviaMensaje(@ModelAttribute("mensaje")Mail mensaje){
		ModelMap modelo = new ModelMap();
		//modelo.put("nombre", mensaje.getNombreMail());
		
		
		        //MAIL
				// SMTP server information
		        String host = "smtp.gmail.com";
		        String port = "587";
		        String mailTo = "info.ropas.app@gmail.com";
		        String password = "ropasapp1";
		 
		        // outgoing message information
		        String mailFrom = "info.ropas.app@gmail.com";
		        String asunto = mensaje.getAsuntoMail();
		        String texto = mensaje.getTextoMail();
		 
		        //traigo un objeto de la clase para enviar
		        ClaseEnvioMail mailer = new ClaseEnvioMail();
		 
		        try {
		        	//con el objeto para enviar, llamo al metodo de envio
		            mailer.sendPlainTextEmail(host, port, mailFrom, password, mailTo,
		                    asunto, texto);
		            //System.out.println("Email sent.");
		            return new ModelAndView ("contactoMensajeExito", modelo);
		        }catch(Exception ex){
		            //System.out.println("Failed to sent email.");
		            ex.printStackTrace();
		            return new ModelAndView("error", modelo);
		        }
	}
		
}
