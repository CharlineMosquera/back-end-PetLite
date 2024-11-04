package com.ProyectoFInal.PetLite.service;

import com.ProyectoFInal.PetLite.dto.LoginDTO;
import com.ProyectoFInal.PetLite.dto.RegistroDTO;
import com.ProyectoFInal.PetLite.model.Cliente;
import com.ProyectoFInal.PetLite.model.Mascota;
import com.ProyectoFInal.PetLite.model.Orden;

import java.util.List;

public interface IClienteService {

    void createCliente(RegistroDTO cliente);

    Cliente getClienteById(Long id);

    List<Cliente> getAllClientes();

    List<Mascota> getAllMascotasByClienteId(Long id);

    List<Orden> getAllOrdenesByClienteId(Long id);

    void editCliente(Long id, String nombre_cliente, String apellido_cliente, String direccion, String telefono, String email, String contrasenia, List<Mascota> mascotas, List<Orden> ordenes);

    void deleteClienteById(Long id);

    // Valida si un cliente existe por correo y password
    Cliente findClienteByEmailAndContrasenia(LoginDTO cliente);
}
