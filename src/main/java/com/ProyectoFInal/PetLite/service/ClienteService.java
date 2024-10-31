package com.ProyectoFInal.PetLite.service;

import com.ProyectoFInal.PetLite.model.Cliente;
import com.ProyectoFInal.PetLite.repository.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService implements IClienteService{

    @Autowired
    private IClienteRepository clienteRepository;

    @Override
    public void createCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    @Override
    public Cliente getCliente(Long id) {
        Cliente cliente = clienteRepository.findById(id).orElse(null);
        return cliente;
    }

    @Override
    public List<Cliente> getAllClientes() {
        List<Cliente> clientes = clienteRepository.findAll();
        return clientes;
    }

    @Override
    public void editCliente(Long id, String nombre_cliente, String apellido_cliente, String direccion, String telefono, String email) {
        Cliente cliente = this.getCliente(id);
        cliente.setNombre_cliente(nombre_cliente);
        cliente.setApellido_cliente(apellido_cliente);
        cliente.setDireccion(direccion);
        cliente.setTelefono(telefono);
        cliente.setEmail(email);
        clienteRepository.save(cliente);
    }

    @Override
    public void deleteCliente(Long id) {
        Cliente cliente = this.getCliente(id);
        clienteRepository.delete(cliente);
    }
}
