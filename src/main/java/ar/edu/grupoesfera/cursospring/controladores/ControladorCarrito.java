package ar.edu.grupoesfera.cursospring.controladores;

import javax.inject.Inject;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.modelo.ColeccionProducto;
import ar.edu.grupoesfera.cursospring.modelo.Producto;
import ar.edu.grupoesfera.cursospring.servicios.ProductoServicio;
import ar.edu.grupoesfera.cursospring.servicios.StockServicio;

@RestController
public class ControladorCarrito extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@Inject
	private ProductoServicio servicioproducto;
	@Inject
	private StockServicio serviciostock;
	

	/*CARRITO DE COMPRAS*/
	@RequestMapping ("/carrito")
	public ModelAndView cargaCarrito(
			@RequestParam (value = "user")HttpServletRequest request,
									 @ModelAttribute ("producto")Producto producto,
                                     @RequestParam(value="id")Integer id){
		ColeccionProducto servicioproducto = ColeccionProducto.getInstance();
		String info = null;
		ModelMap modelo = new ModelMap();
			Object usuario = request.getAttribute("user");
			if(usuario != null) {
				servicioproducto.guardaProductoExistente(producto);
					}else{
						info="Debes estar REGISTRAD@ para comprar";
						modelo.put("info",info);
						System.out.println(request.getAttribute("user"));
						return new ModelAndView ("error", modelo);	
					}
			System.out.println(request.getAttribute("user"));
		return new ModelAndView ("carrito", modelo);
			}

	
	/*GETTERS Y SETERS*/
	public ProductoServicio getServicioproducto() {
		return servicioproducto;
	}

	public void setServicioproducto(ProductoServicio servicioproducto) {
		this.servicioproducto = servicioproducto;
	}

	public StockServicio getServiciostock() {
		return serviciostock;
	}

	public void setServiciostock(StockServicio serviciostock) {
		this.serviciostock = serviciostock;
	}
}
