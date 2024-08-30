package com.Proyect.login.servicio;

import com.Proyect.login.modelo.Usuario;

import java.util.List;

public interface UsuarioServicio {
    List<Usuario> obtenerTodosLosUsuarios();
    Usuario obtenerUsuarioPorId(long id);
    Usuario crearUsuario(Usuario usuario);
    Usuario actualizarUsuario(long id, Usuario usuario);
    boolean eliminarUsuario(long id);
}
