package com.ProyectoFInal.PetLite.service;

import com.ProyectoFInal.PetLite.dto.RegistroDTO;
import com.ProyectoFInal.PetLite.model.Cliente;
import com.ProyectoFInal.PetLite.model.Mascota;
import com.ProyectoFInal.PetLite.model.Orden;
import com.ProyectoFInal.PetLite.repository.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ClienteService implements IClienteService {

    @Autowired
    private IClienteRepository clienteRepository;

    @Override
    public void createCliente(RegistroDTO request) {
        Cliente nuevoCliente = new Cliente();

        nuevoCliente.setNombre_cliente(request.getNombre_cliente());
        nuevoCliente.setApellido_cliente(request.getApellido_cliente());
        nuevoCliente.setDireccion(request.getDireccion());
        nuevoCliente.setEmail(request.getEmail());
        nuevoCliente.setTelefono(request.getTelefono());
        nuevoCliente.setContrasenia(request.getContrasenia());

        clienteRepository.save(nuevoCliente);
    }

    @Override
    public Cliente getClienteById(Long id) {
        Cliente cliente = clienteRepository.findById(id).orElse(null);
        return cliente;
    }

    @Override
    public List<Cliente> getAllClientes() {
        List<Cliente> clientes = clienteRepository.findAll();
        return clientes;
    }

    @Override
    public List<Mascota> getAllMascotasByClienteId(Long id) {
        Cliente cliente = this.getClienteById(id);
        List<Mascota> mascotas = cliente.getMascotas();
        return mascotas;
    }

    @Override
    public List<Orden> getAllOrdenesByClienteId(Long id) {
        Cliente cliente = this.getClienteById(id);
        List<Orden> ordenes = cliente.getOrdenes();
        return ordenes;
    }

    @Override
    public void editCliente(Long id, String nombre_cliente, String apellido_cliente, String direccion, String telefono, String email, String contrasenia, List<Mascota> mascotas, List<Orden> ordenes) {
        Cliente cliente = this.getClienteById(id);
        cliente.setNombre_cliente(nombre_cliente);
        cliente.setApellido_cliente(apellido_cliente);
        cliente.setDireccion(direccion);
        cliente.setTelefono(telefono);
        cliente.setEmail(email);
        cliente.setContrasenia(contrasenia);
        cliente.setMascotas(mascotas);
        cliente.setOrdenes(ordenes);
        clienteRepository.save(cliente);
    }

    @Override
    public void deleteClienteById(Long id) {
        Cliente cliente = this.getClienteById(id);
        clienteRepository.delete(cliente);
    }

    @Override
    public Cliente findClienteByEmailAndContrasenia(Cliente cliente) {
        String email = cliente.getEmail();
        String contrasenia = cliente.getContrasenia();

        List<Cliente> currentClientes = this.getAllClientes();

        for (Cliente clienteBuscado : currentClientes) {
            if (Objects.equals(clienteBuscado.getEmail(), email) && Objects.equals(clienteBuscado.getContrasenia(), contrasenia)) {
                return clienteBuscado;
            }
        }
        return null;
    }
}
