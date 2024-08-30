package com.Proyect.login.controlador;

import com.Proyect.login.modelo.UsuariosRoles;
import com.Proyect.login.servicio.UsuariosRolesServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios-roles")
public class UsuariosRolesControlador {

    @Autowired
    private UsuariosRolesServicio usuariosRolesServicio;

    @GetMapping
    public List<UsuariosRoles> obtenerTodosLosUsuariosRoles() {
        return usuariosRolesServicio.obtenerTodosLosUsuariosRoles();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuariosRoles> obtenerUsuariosRolesPorId(@PathVariable long id) {
        UsuariosRoles usuariosRoles = usuariosRolesServicio.obtenerUsuariosRolesPorId(id);
        return usuariosRoles != null ? ResponseEntity.ok(usuariosRoles) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public UsuariosRoles crearUsuariosRoles(@RequestBody UsuariosRoles usuariosRoles) {
        return usuariosRolesServicio.crearUsuariosRoles(usuariosRoles);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UsuariosRoles> actualizarUsuariosRoles(@PathVariable long id, @RequestBody UsuariosRoles usuariosRoles) {
        UsuariosRoles actualizado = usuariosRolesServicio.actualizarUsuariosRoles(id, usuariosRoles);
        return actualizado != null ? ResponseEntity.ok(actualizado) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarUsuariosRoles(@PathVariable long id) {
        if (usuariosRolesServicio.eliminarUsuariosRoles(id)) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
