package com.gestion.proyectos.entidades;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Administrador")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Administrador {
    @Id
    @SequenceGenerator(name = "SEQ_ADMIN", sequenceName = "SEQ_ADMIN",allocationSize = 1)
    @Column(name = "Id_admon")
    private int id;

    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "Apellido")
    private String apellido;

    @Column(name = "Telefono")
    private String telefono;

    @Column(name = "Contrasena")
    private String contrasena;

    @Column(name = "Estado")
    private String estado;


    @Override
    public String toString() {
        return "Administrador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", contrasena='" + contrasena + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
