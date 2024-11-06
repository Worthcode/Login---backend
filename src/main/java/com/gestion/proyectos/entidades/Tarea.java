package com.gestion.proyectos.entidades;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Tarea")
public class Tarea {
    @Id
    @SequenceGenerator(name = "SEQ_TAREA", sequenceName = "SEQ_TAREA",allocationSize = 1)
    @Column(name = "Id_tarea")
    private int idtarea;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "fechaInicio")
    private String fechaInicio;

    @Column(name = "fechaFinalizado")
    private String fechaFinalizado;

    @Column(name = "prioridad")
    private String prioridad;


    @Override
    public String toString() {
        return "Tarea{" +
                "idtarea=" + idtarea +
                ", tipo='" + tipo + '\'' +
                ", fechaInicio='" + fechaInicio + '\'' +
                ", fechaFinalizado='" + fechaFinalizado + '\'' +
                ", prioridad='" + prioridad + '\'' +
                '}';
    }
}
