package com.Proyect.login.imp;

import com.Proyect.login.modelo.Log;
import com.Proyect.login.repositorio.LogRepositorio;
import com.Proyect.login.servicio.LogServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogServicioImpl implements LogServicio {

    @Autowired
    private LogRepositorio logRepositorio;

    @Override
    public List<Log> obtenerTodosLosLogs() {
        return logRepositorio.findAll();
    }

    @Override
    public Log obtenerLogPorId(int id) {
        return logRepositorio.findById(id).orElse(null);
    }

    @Override
    public Log crearLog(Log log) {
        return logRepositorio.save(log);
    }

    @Override
    public Log actualizarLog(int id, Log log) {
        if (logRepositorio.existsById(id)) {
            log.setId(id);
            return logRepositorio.save(log);
        } else {
            return null;
        }
    }

    @Override
    public boolean eliminarLog(int id) {
        if (logRepositorio.existsById(id)) {
            logRepositorio.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
