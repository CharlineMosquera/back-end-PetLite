package com.ProyectoFInal.PetLite.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Mascota {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_mascota;

    private String nombre_mascota;
    private String raza;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente duenio;

    public Mascota() {
    }
}
