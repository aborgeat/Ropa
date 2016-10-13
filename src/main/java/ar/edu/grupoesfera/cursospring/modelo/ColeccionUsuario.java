package ar.edu.grupoesfera.cursospring.modelo;

import java.util.TreeSet;
import java.util.Iterator;
import java.util.Set;


import ar.edu.grupoesfera.cursospring.modelo.Usuario;


public class ColeccionUsuario {

	private static ColeccionUsuario instance = new ColeccionUsuario();
	private Set<Usuario> usuarios = new TreeSet<Usuario>();
	private ColeccionUsuario(){}
	
	public static ColeccionUsuario getInstance(){
		return instance;
	}

	/*GUARDAR USUARIO EXISTENTE*/
	public void guardaUsuarioExistente(Usuario usuario){
	      for(Iterator<Usuario> it = usuarios.iterator(); it.hasNext();){
	    	  Usuario cada = it.next();
	    		if(usuario.geteMail().equals(cada.geteMail())){
	    			usuario.seteMail(cada.geteMail());
	    			usuario.setNombreYapellido(cada.getNombreYapellido());
	    			usuario.setDni(cada.getDni());
	    			usuario.setDomicilio(cada.getDomicilio());
	    			usuario.setTelefono(cada.getTelefono());
	    			usuario.setFechaNacimiento(cada.getFechaNacimiento());
				    usuario.setClave(cada.getClave());
					usuario.setTipo(cada.getTipo());
	          }
	      }
	}
	
	/*ALTA DE USUARIO*/
	public Boolean altaUsuario(Usuario usuario)throws Exception{
  		if(this.usuarios.contains(usuario)){
        	throw new Exception("EL USUARIO YA EXISTE"); 
        }
        else{
        	this.usuarios.add(usuario);  
        	return true;
        } 
    }
	
	/*LISTADO DE PRODUCTOS*/
	public Set<Usuario> verUsuarios(){
		return this.usuarios;
	}
	
	/*BAJA DE USUARIO*/
	public Boolean bajaUsuario(Usuario usuario)throws Exception{
        if(this.usuarios.contains(usuario)){
        	this.usuarios.remove(usuario);
        	return true;
        }
        else{
        	throw new Exception("EL USUARIO NO EXISTE");      	
        }
    }

	/*MODIFICACION DE USUARIO*/
	public void modificacionUsuario(Usuario usuario){
            for(Iterator<Usuario> it = usuarios.iterator(); it.hasNext();){
  	    	  Usuario cada = it.next();
	    		if(cada.geteMail().equals(usuario.geteMail())){
	    			cada.geteMail();
	    			cada.setNombreYapellido(usuario.getNombreYapellido());
	    			cada.setDni(usuario.getDni());
	    			cada.setDomicilio(usuario.getDomicilio());
	    			cada.setTelefono(usuario.getTelefono());
	    			cada.setFechaNacimiento(usuario.getFechaNacimiento());
					cada.setClave(usuario.getClave());
					cada.setTipo(usuario.getTipo());
            }
          }
    }

	/*GETTERS Y SETERS*/
	public Set<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Set<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public static void setInstance(ColeccionUsuario instance) {
		ColeccionUsuario.instance = instance;
	}

	/*EQUALS Y HASHCODE*/
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((usuarios == null) ? 0 : usuarios.hashCode());
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
		ColeccionUsuario other = (ColeccionUsuario) obj;
		if (usuarios == null) {
			if (other.usuarios != null)
				return false;
		} else if (!usuarios.equals(other.usuarios))
			return false;
		return true;
	}
		
}
