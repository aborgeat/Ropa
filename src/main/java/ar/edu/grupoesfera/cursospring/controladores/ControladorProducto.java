package ar.edu.grupoesfera.cursospring.controladores;



import javax.inject.Inject;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;

import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.modelo.ColeccionProducto;
import ar.edu.grupoesfera.cursospring.modelo.Producto;
import ar.edu.grupoesfera.cursospring.modelo.ValidadorProducto;
import ar.edu.grupoesfera.cursospring.servicios.ProductoServicio;

@RestController
@MultipartConfig
public class ControladorProducto extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@Inject
	private ProductoServicio servicioproducto;
	
	/*ALTA PRODUCTO*/
	@RequestMapping (value = "/altaProFormulario")
	public ModelAndView altaProFormulario(@ModelAttribute("producto")Producto producto){	  
		ModelMap modelo = new ModelMap();
		return new ModelAndView ("altaProFormulario", modelo);
	}
	 
	@RequestMapping (value = "/altaProConfirma")
	public ModelAndView altaProConfirma(@ModelAttribute("producto")Producto producto, BindingResult result){
		String info;
		ColeccionProducto servicioproducto = ColeccionProducto.getInstance();
		ModelMap modelo = new ModelMap();
		
		ValidadorProducto validadorproducto = new ValidadorProducto();
		validadorproducto.validate(producto, result);
		  if (result.hasErrors()) {
			  return new ModelAndView ("altaProFormulario", modelo);
			  }
		try{
			servicioproducto.altaProducto(producto);
		info="ALTA DE PRODUCTO EXITOSA";
		}catch(Exception e){
			servicioproducto.guardaProductoExistente(producto);
			info= e.getMessage();
		}
		String rutaimagen ="images/productos"+"/"+producto.getImagenproducto().getOriginalFilename();
		modelo.put("info", info);
		modelo.put("rutaimagen", rutaimagen);
		return new ModelAndView ("altaProConfirma", modelo);
	}
	
	/*LISTADO DE PRODUCTOS*/
	@RequestMapping (value = "/verProductos")
	public ModelAndView verProductos(@ModelAttribute("producto")Producto producto){
		ModelMap modelo = new ModelMap();
		ColeccionProducto servicioproducto = ColeccionProducto.getInstance();
		modelo.put("servicioproducto", servicioproducto.verProductos());
		return new ModelAndView ("verProductos", modelo);
	}

	/*BAJA Y MODIFICACION DE PRODUCTO*/
	@RequestMapping (value = "/bajaOmodifPro")
	public ModelAndView bajaOmodifPro(@ModelAttribute("producto")Producto producto){
		ModelMap modelo = new ModelMap();
		ColeccionProducto servicioproducto = ColeccionProducto.getInstance();
		modelo.put("productos", servicioproducto.verProductos());
		return new ModelAndView ("/bajaOmodifPro", modelo);
	}
	
	/*BAJA DE PRODUCTO*/
	@RequestMapping (value = "/bajaProConfirma")
	public ModelAndView bajaProConfirma(@ModelAttribute("producto")Producto producto,
								              @RequestParam (value="id")Integer id){
		ColeccionProducto servicioproducto = ColeccionProducto.getInstance();
		ModelMap modelo = new ModelMap();
		servicioproducto.guardaProductoExistente(producto);
		servicioproducto.verProductos();
		return new ModelAndView ("/bajaProConfirma", modelo);
	}
	
	@RequestMapping (value = "/bajaProOk")
	public ModelAndView bajaProOk(@ModelAttribute("producto")Producto producto){
		String info;
		String boton="Eliminar Otro";
		ModelMap modelo = new ModelMap();
		ColeccionProducto servicioproducto = ColeccionProducto.getInstance();
		try{
			servicioproducto.bajaProducto(producto);
		info="BAJA DE PRODUCTO EXITOSA";
		}catch(Exception e){
			info= e.getMessage();
		}
		modelo.put("info", info);
		modelo.put("boton", boton);
		modelo.put("productos", servicioproducto.verProductos());
		return new ModelAndView ("/bajaOmodifProOk", modelo);
	}
	
	/*MODIFICACION DE PRODUCTO*/
	@RequestMapping (value = "/modifProConfirma", method = RequestMethod.GET)
	public ModelAndView modifProConfirma(@ModelAttribute("producto")Producto producto,
								              @RequestParam (value="id")Integer id){
		String info="MODIFICACIÓN DE PRODUCTO";
		String boton="Modificar";
		ModelMap modelo = new ModelMap();
		ColeccionProducto servicioproducto = ColeccionProducto.getInstance();
		servicioproducto.guardaProductoExistente(producto);
		modelo.put("info", info);
		modelo.put("boton", boton);
		return new ModelAndView ("/modifProConfirma", modelo);
	}
	
	@RequestMapping (path = "/modifProOk")
	public ModelAndView modifProOk(@ModelAttribute("producto")Producto producto){
		String info;
		String boton="Modificar Otro";
		ModelMap modelo = new ModelMap();
		ColeccionProducto servicioproducto = ColeccionProducto.getInstance();
		try{
			servicioproducto.altaProducto(producto);
			info="MODIFICACION DE PRODUCTO RECHAZADA";
		}catch (Exception e){
			servicioproducto.modificacionProducto(producto);	
			info="MODIFICACION DE PRODUCTO EXITOSA";			
		}
		modelo.put("info", info);
		modelo.put("boton", boton);
		modelo.put("productos", servicioproducto.verProductos());
		return new ModelAndView ("/bajaOmodifProOk", modelo);
	}

	
	/*GETTERS Y SETERS*/
	public ProductoServicio getServicioproducto() {
		return servicioproducto;
	}

	public void setServicioproducto(ProductoServicio servicioproducto) {
		this.servicioproducto = servicioproducto;
	}
}
