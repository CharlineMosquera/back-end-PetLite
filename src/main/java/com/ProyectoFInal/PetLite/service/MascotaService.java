package com.ProyectoFInal.PetLite.service;

import com.ProyectoFInal.PetLite.model.Cliente;
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
    public Mascota getMascotaById(Long id) {
        Mascota mascota = mascotaRepository.findById(id).orElse(null);
        return mascota;
    }

    @Override
    public List<Mascota> getAllMascotas() {
        List<Mascota> mascotas = mascotaRepository.findAll();
        return mascotas;
    }

    @Override
    public void editMascota(Long id, String nombre_mascota, String raza, Cliente cliente) {
        Mascota mascota = this.getMascotaById(id);
        mascota.setNombre_mascota(nombre_mascota);
        mascota.setRaza(raza);
        mascota.setDuenio(cliente);
        mascotaRepository.save(mascota);
    }

    @Override
    public void deleteMascotaById(Long id) {
        Mascota mascota = this.getMascotaById(id);
        mascotaRepository.delete(mascota);
    }
}
