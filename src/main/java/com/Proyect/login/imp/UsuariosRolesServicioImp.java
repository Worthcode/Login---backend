package com.Proyect.login.imp;

import com.Proyect.login.modelo.UsuariosRoles;
import com.Proyect.login.repositorio.UsuariosRolesRepositorio;
import com.Proyect.login.servicio.UsuariosRolesServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuariosRolesServicioImp implements UsuariosRolesServicio {

    @Autowired
    private UsuariosRolesRepositorio usuariosRolesRepositorio;

    @Override
    public List<UsuariosRoles> obtenerTodosLosUsuariosRoles() {
        return usuariosRolesRepositorio.findAll();
    }

    @Override
    public UsuariosRoles obtenerUsuariosRolesPorId(long id) {
        return usuariosRolesRepositorio.findById(id).orElse(null);
    }

    @Override
    public UsuariosRoles crearUsuariosRoles(UsuariosRoles usuariosRoles) {
        return usuariosRolesRepositorio.save(usuariosRoles);
    }

    @Override
    public UsuariosRoles actualizarUsuariosRoles(long id, UsuariosRoles usuariosRoles) {
        if (usuariosRolesRepositorio.existsById(id)) {
            usuariosRoles.setId_producto(id);
            return usuariosRolesRepositorio.save(usuariosRoles);
        } else {
            return null;
        }
    }

    @Override
    public boolean eliminarUsuariosRoles(long id) {
        if (usuariosRolesRepositorio.existsById(id)) {
            usuariosRolesRepositorio.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
