package com.ProyectoFInal.PetLite.dto;

import com.ProyectoFInal.PetLite.model.enums.RangoEdad;
import com.ProyectoFInal.PetLite.model.enums.Tamanio;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ProductoDTO {
    private Long id_producto;

    @NotBlank(message = "El nombre del producto es obligatorio")
    private String nombre_producto;

    @NotNull(message = "El precio es obligatorio")
    private Double precio;

    @NotNull(message = "La disponibilidad es obligatoria")
    private Boolean disponibilidad;

    @NotBlank(message = "La descripción es obligatoria")
    private String descripcion;

    private List<RangoEdad> rangoEdad;
    private List<Tamanio> tamanio;
    private String imagen;

    @NotNull(message = "La categoría es obligatoria")
    private Long id_categoria;
}
