package com.Proyect.login.modelo;


import jakarta.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;


public class Usuarios implements Serializable {


    private long id_producto;

    private String nombre;
    private String email;
    private String password;
    private Date fecha;
    private Date ultimoLogin;

}
