package ar.edu.grupoesfera.cursospring.servicios;

import java.util.Set;

import ar.edu.grupoesfera.cursospring.modelo.Usuario;

public interface UsuarioServicio {

	Boolean altaUsuario();
	Boolean bajaUsuario();
	void guardaUsuarioExistente();
	void modificacionUsuario();
	Set<Usuario> verUsuarios();
}
