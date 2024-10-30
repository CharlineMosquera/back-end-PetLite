package com.ProyectoFInal.PetLite.repository;

import com.ProyectoFInal.PetLite.model.Orden;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrdenRepository extends JpaRepository<Orden, Long> {
}
