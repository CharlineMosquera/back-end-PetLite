package com.ProyectoFInal.PetLite.service;

import com.ProyectoFInal.PetLite.model.Mascota;
import com.ProyectoFInal.PetLite.repository.IMascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotaService implements IMascotaService{

    @Autowired
    private IMascotaRepository mascotaRepository;

    @Override
    public void createMascota(Mascota mascota) {
        mascotaRepository.save(mascota);
    }

    @Override
    public Mascota getMascota(Long id) {
        Mascota mascota = mascotaRepository.findById(id).orElse(null);
        return mascota;
    }

    @Override
    public List<Mascota> getAllMascotas() {
        List<Mascota> mascotas = mascotaRepository.findAll();
        return mascotas;
    }

    @Override
    public void editMascota(Long id, String nombre_mascota, String raza, Long id_cliente) {
        Mascota mascota = this.getMascota(id);
        mascota.setNombre_mascota(nombre_mascota);
        mascota.setRaza(raza);
        mascota.setId_cliente(id_cliente);
        mascotaRepository.save(mascota);
    }

    @Override
    public void deleteMascota(Long id) {
        Mascota mascota = this.getMascota(id);
        mascotaRepository.delete(mascota);
    }
}
