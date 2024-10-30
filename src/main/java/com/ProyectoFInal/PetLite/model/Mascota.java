package com.ProyectoFInal.PetLite.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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

    // Relacion
    private Long id_cliente;

    public Mascota() {
    }

    public Mascota(Long id_mascota, String nombre_mascota, String raza, Long id_cliente) {
        this.id_mascota = id_mascota;
        this.nombre_mascota = nombre_mascota;
        this.raza = raza;
        this.id_cliente = id_cliente;
    }
}
