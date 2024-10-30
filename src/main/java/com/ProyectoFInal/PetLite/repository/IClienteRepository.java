package com.ProyectoFInal.PetLite.repository;

import com.ProyectoFInal.PetLite.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteRepository extends JpaRepository<Cliente, Long> {
}
