package com.Proyect.login.modelo;


import jakarta.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;


public class Usuario implements Serializable {


    private long id;

    private String nombre;
    private String email;
    private String password;
    private Date fecha;
    private Date ultimoLogin;

    public Usuario() {
    }

    public Usuario(long id, String nombre, String email, String password, Date fecha, Date ultimoLogin) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.fecha = fecha;
        this.ultimoLogin = ultimoLogin;
    }

    public long getid() {
        return id;
    }

    public void setid(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getUltimoLogin() {
        return ultimoLogin;
    }

    public void setUltimoLogin(Date ultimoLogin) {
        this.ultimoLogin = ultimoLogin;
    }

    
    

}
