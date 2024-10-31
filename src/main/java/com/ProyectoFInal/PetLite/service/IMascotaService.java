package com.ProyectoFInal.PetLite.service;

import com.ProyectoFInal.PetLite.model.Cliente;
import com.ProyectoFInal.PetLite.model.Mascota;

import java.util.List;

public interface IMascotaService {

    void createMascota(Mascota mascota);

    Mascota getMascota(Long id);

    List<Mascota> getAllMascotas();

    void editMascota(Long id, String nombre_mascota, String raza, Long id_cliente);

    void deleteMascota(Long id);
}
