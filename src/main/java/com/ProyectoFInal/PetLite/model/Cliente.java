package com.ProyectoFInal.PetLite.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_cliente;

    private String nombre_cliente;
    private String apellido_cliente;
    private String direccion;
    private String telefono;
    private String email;
    private String contrasenia;

    @OneToMany(mappedBy = "duenio")
    private List<Mascota> mascotas;

    @OneToMany(mappedBy = "cliente")
    private List<Orden> ordenes;

    public Cliente() {
    }

}
