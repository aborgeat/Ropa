package ar.edu.grupoesfera.cursospring.controladores;

import javax.inject.Inject;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.modelo.ColeccionProducto;
import ar.edu.grupoesfera.cursospring.modelo.Producto;
import ar.edu.grupoesfera.cursospring.servicios.ProductoServicio;

@RestController
public class ControladorProducto {
	@Inject
	private ProductoServicio servicioproducto;
	
	/*ALTA PRODUCTO*/
	@RequestMapping (value = "/altaProFormulario")
	public ModelAndView altaProFormulario(@ModelAttribute("producto")Producto producto){
		ModelMap modelo = new ModelMap();
		return new ModelAndView ("altaProFormulario", modelo);
	}
	
	@RequestMapping (value = "/altaProConfirma")
	public ModelAndView altaProConfirma(@ModelAttribute("producto")Producto producto){
		String info;
		ColeccionProducto servicioproducto = ColeccionProducto.getInstance();
		ModelMap modelo = new ModelMap();
		try{
			servicioproducto.altaProducto(producto);
		info="ALTA DE PRODUCTO EXITOSA";
		}catch(Exception e){
			servicioproducto.guardaProductoExistente(producto);
			info= e.getMessage();
		}
		modelo.put("info", info);
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
		modelo.put("id",producto.getId());
		modelo.put("categoria",producto.getCategoria());	
		modelo.put("nombreProducto",producto.getNombreProducto());
		modelo.put("color",producto.getColor());
		modelo.put("talle",producto.getTalle());
		modelo.put("precio",producto.getPrecio());
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
	@RequestMapping (value = "/modifProConfirma")
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
	public ModelAndView modifProOk(@ModelAttribute("producto")Producto producto,
						           @RequestParam (value="id")Integer id){
		String info;
		String boton="Modificar Otro";
		ModelMap modelo = new ModelMap();
		ColeccionProducto servicioproducto = ColeccionProducto.getInstance();
		servicioproducto.modificacionProducto(producto);	
		info="MODIFICACION DE PRODUCTO EXITOSA";		
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
