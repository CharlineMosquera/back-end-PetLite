package com.ProyectoFInal.PetLite.model;

import com.ProyectoFInal.PetLite.model.enums.RangoEdad;
import com.ProyectoFInal.PetLite.model.enums.Tamanio;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_producto;

    private String nombre_producto;
    private double precio;
    private boolean disponibilidad;
    private String descripcion;

    // Atributo para edad de mascota
    // babies, cachorro, adulto, senior, Todas las edades

    @Enumerated(EnumType.STRING)
    private RangoEdad rangoEdad = RangoEdad.TODASLASEDADES;
    @Enumerated(EnumType.STRING)
    private Tamanio tamanio;

    // relacion
    private Long categoria_id;

    public Producto() {
    }

    public Producto(Long id_producto, String nombre_producto, double precio, boolean disponibilidad, String descripcion, Long categoria_id) {
        this.id_producto = id_producto;
        this.nombre_producto = nombre_producto;
        this.precio = precio;
        this.disponibilidad = disponibilidad;
        this.descripcion = descripcion;
        this.categoria_id = categoria_id;
    }
}
