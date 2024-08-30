package com.Proyect.login.modelo;

import java.io.Serializable;

public class UsuariosRoles implements Serializable {

    private long id_producto;

    private Usuario usuario;
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
