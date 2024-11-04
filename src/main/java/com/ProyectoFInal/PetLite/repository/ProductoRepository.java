package com.ProyectoFInal.PetLite.repository;

import com.ProyectoFInal.PetLite.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
