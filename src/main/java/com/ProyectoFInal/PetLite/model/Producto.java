package com.ProyectoFInal.PetLite.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
