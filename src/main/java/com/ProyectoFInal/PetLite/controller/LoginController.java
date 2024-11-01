package com.ProyectoFInal.PetLite.controller;

import com.ProyectoFInal.PetLite.model.Cliente;
import com.ProyectoFInal.PetLite.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/login")
public class LoginController {

    @Autowired
    private IClienteService clienteService;

    @GetMapping("/iniciar-sesion")
    public ResponseEntity<Cliente> inicioSesion(@RequestBody Cliente cliente) {
        Cliente clienteExiste = clienteService.findClienteByEmailAndContrasenia(cliente);
        return ResponseEntity.ok(clienteExiste);
    }
}
