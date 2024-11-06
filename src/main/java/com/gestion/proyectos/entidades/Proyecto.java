package com.gestion.proyectos.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Proyecto")
public class Proyecto {
    @Id
    @SequenceGenerator(name = "SEQ_PROYECTO", sequenceName = "SEQ_PROYECTO",allocationSize = 1)
    @Column(name = "Id_proyecto")
    private int idProyecto;

    @Column(name = "Nombre_clave")
    private String nombreClave;

    @Column(name = "denominacion_comercial")
    private String denominacionComercial;

    @Column(name = "fechaInicio")
    private String fechaInicio;

    @Column(name = "fechaFinalizacion")
    private String fechaFinalizacion;

    @Column(name = "estadoActual")
    private String estadoActual;

    @Column(name = "porcentajeAvance")
    private String porcentajeAvance;

    @Override
    public String toString() {
        return "Proyecto{" +
                "idProyecto=" + idProyecto +
                ", nombreClave='" + nombreClave + '\'' +
                ", denominacionComercial='" + denominacionComercial + '\'' +
                ", fechaInicio='" + fechaInicio + '\'' +
                ", fechaFinalizacion='" + fechaFinalizacion + '\'' +
                ", estadoActual='" + estadoActual + '\'' +
                ", porcentajeAvance='" + porcentajeAvance + '\'' +
                '}';
    }
}
