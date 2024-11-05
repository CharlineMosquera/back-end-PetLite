package com.ProyectoFInal.PetLite.model;

import com.ProyectoFInal.PetLite.model.enums.RangoEdad;
import com.ProyectoFInal.PetLite.model.enums.Tamanio;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

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

    @ElementCollection(targetClass = RangoEdad.class)
    @CollectionTable(name = "producto_rango_edad", joinColumns = @JoinColumn(name = "id_producto"))
    @Enumerated(EnumType.STRING)
    private List<RangoEdad> rangoEdad;

    @ElementCollection(targetClass = Tamanio.class)
    @CollectionTable(name = "producto_tamanio", joinColumns = @JoinColumn(name = "id_producto"))
    @Enumerated(EnumType.STRING)
    private List<Tamanio> tamanio;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoriaProducto;

    @ManyToOne
    @JoinColumn(name = "id_orden")
    private Orden orden;

    public Long getIdCategoria() {
        return categoriaProducto != null ? categoriaProducto.getId_categoria() : null;
    }

    public Producto() {
    }

}
