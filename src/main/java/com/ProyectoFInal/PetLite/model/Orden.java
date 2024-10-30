package com.ProyectoFInal.PetLite.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
@Entity
public class Orden {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_orden;

    private Date fecha;
    private double total;

    // relacion
    private Long cliente_id;

    public Orden() {
    }

    public Orden(Long id_orden, Date fecha, double total, Long cliente_id) {
        this.id_orden = id_orden;
        this.fecha = fecha;
        this.total = total;
        this.cliente_id = cliente_id;
    }
}
