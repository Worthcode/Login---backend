package com.Proyect.login.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;
@Entity
@Table(name="UsuariosRoles")
public class UsuariosRoles implements Serializable {

    @Id
    @Column(name = "id_producto")
    private long id_producto;

    @Column(name = "usuario")
    private Usuario usuario;

    @Column(name = "rol")
    private Roles rol;
    public UsuariosRoles() {
    }
    public UsuariosRoles(long id_producto, Usuario usuario, Roles rol) {
        this.id_producto = id_producto;
        this.usuario = usuario;
        this.rol = rol;
    }
    public long getId_producto() {
        return id_producto;
    }
    public void setId_producto(long id_producto) {
        this.id_producto = id_producto;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public Roles getRol() {
        return rol;
    }
    public void setRol(Roles rol) {
        this.rol = rol;
    }
    @Override
    public String toString() {
        return "UsuariosRoles [id_producto=" + id_producto + ", usuario=" + usuario + ", rol=" + rol + "]";
    }

    
}
