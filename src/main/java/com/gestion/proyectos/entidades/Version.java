package com.gestion.proyectos.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "Version")
public class Version {
    @Id
    @SequenceGenerator(name = "SEQ_VERSION", sequenceName = "SEQ_VERSION",allocationSize = 1)
    @Column(name = "Id_version")
    private int idversion;

    @Column(name = "fecha")
    private Date fecha;

    @Override
    public String toString() {
        return "Version{" +
                "idversion=" + idversion +
                ", fecha=" + fecha +
                '}';
    }
}
