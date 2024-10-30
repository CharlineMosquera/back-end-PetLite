package com.ProyectoFInal.PetLite.repository;

import com.ProyectoFInal.PetLite.model.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMascotaRepository extends JpaRepository<Mascota, Long> {
}
