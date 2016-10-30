package ar.edu.grupoesfera.cursospring.modelo;

import org.springframework.web.multipart.MultipartFile;

public class Producto implements Comparable<Producto>{ 

	/*ATRIBUTOS*/
	private Integer id;
	private String nombreProducto;
	private Color color;
	private Talle talle;
	private Float precio;
	private Categoria categoria;
	private MultipartFile imagenproducto;
	private String nombreimagen;

	/*GETTERS Y SETTERS*/
	public Integer getId() {
		return id;
	}
	public Integer setId(Integer id) {
		return this.id = id;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public Talle getTalle() {
		return talle;
	}
	public void setTalle(Talle talle) {
		this.talle = talle;
	}
	public Float getPrecio() {
		return precio;
	}
	public void setPrecio(Float precio) {
		this.precio = precio;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public MultipartFile getImagenproducto() {
		return imagenproducto;
	}
	public void setImagenproducto(MultipartFile imagenproducto) {
		this.imagenproducto = imagenproducto;
	}
	

	
	/*EQUALS Y HASHCODE*/
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	/*COMPARE TO*/
	@Override
	public int compareTo(Producto o) {
		return this.id.compareTo(o.id);
	}
	public String getNombreimagen() {
		return nombreimagen;
	}
	public void setNombreimagen(String nombreimagen) {
		this.nombreimagen = nombreimagen;
	}

}
