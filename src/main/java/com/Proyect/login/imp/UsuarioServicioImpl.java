package com.Proyect.login.imp;

import com.Proyect.login.modelo.Usuario;
import com.Proyect.login.repositorio.UsuarioRepositorio;
import com.Proyect.login.servicio.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServicioImpl implements UsuarioServicio {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @Override
    public List<Usuario> obtenerTodosLosUsuarios() {
        return usuarioRepositorio.findAll();
    }

    @Override
    public Usuario obtenerUsuarioPorId(long id) {
        return usuarioRepositorio.findById(id).orElse(null);
    }

    @Override
    public Usuario crearUsuario(Usuario usuario) {
        return usuarioRepositorio.save(usuario);
    }

    @Override
    public Usuario actualizarUsuario(long id, Usuario usuario) {
        if (usuarioRepositorio.existsById(id)) {
            usuario.setid(id);
            return usuarioRepositorio.save(usuario);
        } else {
            return null;
        }
    }

    @Override
    public boolean eliminarUsuario(long id) {
        if (usuarioRepositorio.existsById(id)) {
            usuarioRepositorio.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
