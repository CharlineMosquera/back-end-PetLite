package com.ProyectoFInal.PetLite.dto;

import com.ProyectoFInal.PetLite.model.enums.RangoEdad;
import com.ProyectoFInal.PetLite.model.enums.Tamanio;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class MascotaDTO {
    @NotBlank(message = "El nombre de la mascota es obligatorio.")
    private String nombreMascota;

    @NotBlank(message = "La raza es obligatoria.")
    private String raza;

    private Tamanio tamanio;

    private RangoEdad edad;

    private String historialMedico;
}
