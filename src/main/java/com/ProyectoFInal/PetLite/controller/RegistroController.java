package com.ProyectoFInal.PetLite.controller;

import com.ProyectoFInal.PetLite.dto.RegistroDTO;
import com.ProyectoFInal.PetLite.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/registro")
public class RegistroController {

    @Autowired
    private IClienteService clienteService;

    @PostMapping("/crear")
    public ResponseEntity<String> register(@Valid @RequestBody RegistroDTO request) {
        clienteService.createCliente(request);
        return ResponseEntity.ok("Registro exitoso!!");
    }
}
