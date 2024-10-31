package com.ProyectoFInal.PetLite.service;

import com.ProyectoFInal.PetLite.model.Cliente;

import java.util.List;

public interface IClienteService {

    void createCliente(Cliente cliente);

    Cliente getCliente(Long id);

    List<Cliente> getAllClientes();

    void editCliente(Long id, String nombre_cliente, String apellido_cliente, String direccion, String telefono, String email);

    void deleteCliente(Long id);
}
