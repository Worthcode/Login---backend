package com.Proyect.login.modelo;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.annotations.Cache;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "log")
public class Log implements Serializable {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "usuario")
    private Usuario usuario;

    @Column(name = "evento")
    private String evento;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "fecha")
    private Date fecha;

    public Log() {
    }

    

    public Log(int id, Usuario usuario, String evento, String descripcion, Date fecha) {
        this.id = id;
        this.usuario = usuario;
        this.evento = evento;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    
    
}
