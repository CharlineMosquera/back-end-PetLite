package com.ProyectoFInal.PetLite.service;

import com.ProyectoFInal.PetLite.model.Cliente;
import com.ProyectoFInal.PetLite.model.Mascota;

import java.util.List;

public interface IMascotaService {

    void createMascota(Mascota mascota);

    Mascota getMascotaById(Long id);

    List<Mascota> getAllMascotas();

    void editMascota(Long id, String nombre_mascota, String raza, Cliente cliente);

    void deleteMascotaById(Long id);
}
