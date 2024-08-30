package com.Proyect.login.servicio;

import com.Proyect.login.modelo.UsuariosRoles;

import java.util.List;

public interface UsuariosRolesServicio {
    List<UsuariosRoles> obtenerTodosLosUsuariosRoles();
    UsuariosRoles obtenerUsuariosRolesPorId(long id);
    UsuariosRoles crearUsuariosRoles(UsuariosRoles usuariosRoles);
    UsuariosRoles actualizarUsuariosRoles(long id, UsuariosRoles usuariosRoles);
    boolean eliminarUsuariosRoles(long id);
}
