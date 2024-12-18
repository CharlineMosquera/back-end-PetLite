package com.ProyectoFInal.PetLite.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@Entity
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_categoria;
    private String nombre_categoria;

    @JsonIgnore
    @OneToMany(mappedBy = "categoriaProducto")
    private List<Producto> productos;

    public Categoria() {
    }

}
