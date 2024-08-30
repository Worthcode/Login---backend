package com.Proyect.login.servicio;

import com.Proyect.login.modelo.Roles;

import java.util.List;

public interface RolesServicio {
    List<Roles> obtenerTodosLosRoles();
    Roles obtenerRolPorId(int id);
    Roles crearRol(Roles rol);
    Roles actualizarRol(int id, Roles rol);
    boolean eliminarRol(int id);
}
