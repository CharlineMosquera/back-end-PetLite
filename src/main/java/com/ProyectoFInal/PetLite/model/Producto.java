package com.ProyectoFInal.PetLite.model;

import com.ProyectoFInal.PetLite.model.enums.RangoEdad;
import com.ProyectoFInal.PetLite.model.enums.Tamanio;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_producto;

    private String nombre_producto;
    private double precio;
    private boolean disponibilidad;
    private String imagen;

    @Column(length = 500)
    private String descripcion;

    @Enumerated(EnumType.STRING)
    private RangoEdad rangoEdad;

    @Enumerated(EnumType.STRING)
    private Tamanio tamanio;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoriaProducto;

    @ManyToOne
    @JoinColumn(name = "id_orden")
    private Orden orden;

    public Producto() {
    }

}
