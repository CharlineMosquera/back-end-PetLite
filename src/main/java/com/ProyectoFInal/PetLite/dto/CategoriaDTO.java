package com.ProyectoFInal.PetLite.dto;

import lombok.Getter;
import lombok.Setter;

import jakarta.validation.constraints.NotBlank;

@Getter @Setter
public class CategoriaDTO {
    private Long id_categoria;

    @NotBlank(message = "El nombre de la categoría no puede estar vacío")
    private String nombre_categoria;
}
