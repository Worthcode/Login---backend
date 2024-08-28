package com.Proyect.login.modelo;

import java.io.Serializable;
import java.util.Date;

public class Log implements Serializable {

    private int id;

    private Usuarios usuario;
    private String evento;
    private String descripcion;
    private Date fecha;
}
