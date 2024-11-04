package com.ProyectoFInal.PetLite.controller;

import com.ProyectoFInal.PetLite.dto.LoginDTO;
import com.ProyectoFInal.PetLite.model.Cliente;
import com.ProyectoFInal.PetLite.service.IClienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/login")
public class LoginController {

    @Autowired
    private IClienteService clienteService;
    @PostMapping("/iniciar-sesion")
    public ResponseEntity<String> inicioSesion(@Valid @RequestBody LoginDTO request) {
        Cliente clienteExiste = clienteService.findClienteByEmailAndContrasenia(request);

        if (clienteExiste != null) {
            return ResponseEntity.ok("Usuario logueado con exito");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Email o contraseña incorrectos");
        }
    }
}
