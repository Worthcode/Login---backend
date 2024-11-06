package com.gestion.proyectos.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Documento" )
public class Documento {
    @Id
    @SequenceGenerator(name = "SEQ_DOC", sequenceName = "SEQ_DOC",allocationSize = 1)
    @Column(name = "Id_documento")
    private int id;

    @Column(name = "id_tarea")
    private int idTarea;

    @Column(name = "codigo")
    private String codigo;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "tipo")
    private String tipo;

    @Override
    public String toString() {
        return "Documento{" +
                "id=" + id +
                ", idTarea=" + idTarea +
                ", codigo='" + codigo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
