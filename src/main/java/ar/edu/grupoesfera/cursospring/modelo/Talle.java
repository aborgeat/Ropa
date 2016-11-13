package ar.edu.grupoesfera.cursospring.modelo;

public class Talle {
	private String talle;
	
	public Talle(String talle) {
		this.talle=talle;
	}	


	/*GETTERS Y SETTERS*/

	public String getTalle() {
		return talle;
	}

	public void setTalle(String talle) {
		this.talle = talle;
	}

	/*EQUALS Y HASHCODE*/

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((talle == null) ? 0 : talle.hashCode());
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
		Talle other = (Talle) obj;
		if (talle == null) {
			if (other.talle != null)
				return false;
		} else if (!talle.equals(other.talle))
			return false;
		return true;
	}


	/*SOBREESCRITURA DE METODO TOSTRING*/
	@Override
	public String toString() {
		talle.toString();
		return talle;
	}
}
