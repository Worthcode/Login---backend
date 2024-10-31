package com.gestion.proyectos.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PruebaConexionController {

    @GetMapping("/ruta-de-prueba")
    public String pruebaConexion() {
        return "Conexión exitosa";
    }
}
