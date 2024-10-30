package com.ProyectoFInal.PetLite.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

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

    public Cliente() {
    }

    public Cliente(Long id_cliente, String nombre_cliente, String apellido_cliente, String direccion, String telefono, String email) {
        this.id_cliente = id_cliente;
        this.nombre_cliente = nombre_cliente;
        this.apellido_cliente = apellido_cliente;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }
}
