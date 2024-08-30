package com.Proyect.login.servicio;

import com.Proyect.login.modelo.Log;

import java.util.List;

public interface LogServicio {
    
    List<Log> obtenerTodosLosLogs();
    Log obtenerLogPorId(int id);
    Log crearLog(Log log);
    Log actualizarLog(int id, Log log);
    boolean eliminarLog(int id);
}
