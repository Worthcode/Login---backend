package com.Proyect.login.controlador;

import com.Proyect.login.modelo.Roles;
import com.Proyect.login.servicio.RolesServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/roles")
public class RolesControlador {

    @Autowired
    private RolesServicio rolesServicio;

    @GetMapping
    public List<Roles> obtenerTodosLosRoles() {
        return rolesServicio.obtenerTodosLosRoles();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Roles> obtenerRolPorId(@PathVariable int id) {
        Roles rol = rolesServicio.obtenerRolPorId(id);
        return rol != null ? ResponseEntity.ok(rol) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public Roles crearRol(@RequestBody Roles rol) {
        return rolesServicio.crearRol(rol);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Roles> actualizarRol(@PathVariable int id, @RequestBody Roles rol) {
        Roles actualizado = rolesServicio.actualizarRol(id, rol);
        return actualizado != null ? ResponseEntity.ok(actualizado) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarRol(@PathVariable int id) {
        if (rolesServicio.eliminarRol(id)) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
