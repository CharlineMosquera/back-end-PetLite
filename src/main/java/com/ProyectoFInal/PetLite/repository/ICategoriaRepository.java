package com.ProyectoFInal.PetLite.repository;

import com.ProyectoFInal.PetLite.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoriaRepository extends JpaRepository<Categoria, Long> {
}
