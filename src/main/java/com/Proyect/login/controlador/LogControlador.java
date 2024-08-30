package com.Proyect.login.controlador;

import com.Proyect.login.modelo.Log;
import com.Proyect.login.servicio.LogServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/logs")
public class LogControlador {

    @Autowired
    private LogServicio logServicio;

    @GetMapping
    public List<Log> obtenerTodosLosLogs() {
        return logServicio.obtenerTodosLosLogs();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Log> obtenerLogPorId(@PathVariable int id) {
        Log log = logServicio.obtenerLogPorId(id);
        return log != null ? ResponseEntity.ok(log) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public Log crearLog(@RequestBody Log log) {
        return logServicio.crearLog(log);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Log> actualizarLog(@PathVariable int id, @RequestBody Log log) {
        Log actualizado = logServicio.actualizarLog(id, log);
        return actualizado != null ? ResponseEntity.ok(actualizado) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarLog(@PathVariable int id) {
        if (logServicio.eliminarLog(id)) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
