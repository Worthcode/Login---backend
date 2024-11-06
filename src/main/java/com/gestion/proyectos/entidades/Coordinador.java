package com.gestion.proyectos.entidades;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Coordinador")
public class Coordinador {
    @Id
    @SequenceGenerator(name = "SEQ_COORDI", sequenceName = "SEQ_COORDI",allocationSize = 1)
    @Column(name = "Id_coordinador")
    private int id;

    @Column(name = "docuemento_empleado")
    private String docuemento;

    @Column(name = "correo")
    private String correo;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "Proyec_asignados")
    private String Proyec_asignados;

    @Override
    public String toString() {
        return "Coordinador{" +
                "id=" + id +
                ", docuemento='" + docuemento + '\'' +
                ", correo='" + correo + '\'' +
                ", telefono='" + telefono + '\'' +
                ", Proyec_asignados='" + Proyec_asignados + '\'' +
                '}';
    }
}
