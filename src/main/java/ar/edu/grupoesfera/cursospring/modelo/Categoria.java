package ar.edu.grupoesfera.cursospring.modelo;


public class Categoria {
	private String categoria;
	
	public Categoria(String categoria) {
		this.categoria=categoria;
	}	


	/*GETTERS Y SETTERS*/
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	/*EQUALS Y HASHCODE*/
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
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
		Categoria other = (Categoria) obj;
		if (categoria == null) {
			if (other.categoria != null)
				return false;
		} else if (!categoria.equals(other.categoria))
			return false;
		return true;
	}

	/*SOBREESCRITURA DE METODO TOSTRING*/
	@Override
	public String toString() {
		categoria.toString();
		return categoria;
	}

}
