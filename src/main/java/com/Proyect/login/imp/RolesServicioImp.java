package com.Proyect.login.imp;

import com.Proyect.login.modelo.Roles;
import com.Proyect.login.repositorio.RolesRepositorio;
import com.Proyect.login.servicio.RolesServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolesServicioImp implements RolesServicio {

    @Autowired
    private RolesRepositorio rolesRepositorio;

    @Override
    public List<Roles> obtenerTodosLosRoles() {
        return rolesRepositorio.findAll();
    }

    @Override
    public Roles obtenerRolPorId(int id) {
        return rolesRepositorio.findById(id).orElse(null);
    }

    @Override
    public Roles crearRol(Roles rol) {
        return rolesRepositorio.save(rol);
    }

    @Override
    public Roles actualizarRol(int id, Roles rol) {
        if (rolesRepositorio.existsById(id)) {
            rol.setId(id);
            return rolesRepositorio.save(rol);
        } else {
            return null;
        }
    }

    @Override
    public boolean eliminarRol(int id) {
        if (rolesRepositorio.existsById(id)) {
            rolesRepositorio.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
