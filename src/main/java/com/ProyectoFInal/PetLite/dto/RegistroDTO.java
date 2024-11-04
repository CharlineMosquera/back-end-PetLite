package com.ProyectoFInal.PetLite.dto;

import lombok.Getter;
import lombok.Setter;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Getter @Setter
public class RegistroDTO {
    private Long id_cliente;

    @NotBlank(message = "El nombre es obligatorio")
    private String nombre_cliente;

    @NotBlank(message = "El apellido es obligatorio")
    private String apellido_cliente;

    @NotBlank(message = "La dirección es obligatoria")
    private String direccion;

    @NotBlank(message = "El teléfono es obligatorio")
    @Size(min = 10, message = "El teléfono debe tener al menos 10 caracteres")
    private String telefono;

    @Email(message = "El email debe ser válido")
    @NotBlank(message = "El email es obligatorio")
    private String email;

    @NotBlank(message = "La contraseña es obligatoria")
    @Size(min = 8, message = "La contraseña debe tener al menos 8 caracteres")
    private String contrasenia;
}
