package com.ProyectoFInal.PetLite.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter @Setter
@Entity
public class Orden {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_orden;

    private Date fecha;
    private double total;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @OneToMany(mappedBy = "orden")
    private List<Producto> productos;

    public Orden() {
    }

}
