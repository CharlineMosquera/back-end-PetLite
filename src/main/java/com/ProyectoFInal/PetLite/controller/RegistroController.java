package com.ProyectoFInal.PetLite.controller;

import com.ProyectoFInal.PetLite.model.Cliente;
import com.ProyectoFInal.PetLite.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/registro")
public class RegistroController {

    @Autowired
    private IClienteService clienteService;

    // Creacion del cliente desde el form de registro
    @PostMapping("/crear")
    public void creacionClienteDesdeForm(@RequestBody Cliente cliente) {
        clienteService.createCliente(cliente);
    }
}
