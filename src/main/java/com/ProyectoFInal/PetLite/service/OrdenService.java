package com.ProyectoFInal.PetLite.service;

import com.ProyectoFInal.PetLite.model.Orden;
import com.ProyectoFInal.PetLite.repository.IOrdenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OrdenService implements IOrdenService{

    @Autowired
    private IOrdenRepository ordenRepository;

    @Override
    public void createOrden(Orden orden) {
        ordenRepository.save(orden);
    }

    @Override
    public Orden getOrden(Long id) {
        Orden orden = ordenRepository.findById(id).orElse(null);
        return orden;
    }

    @Override
    public List<Orden> getAllOrdenes() {
        List<Orden> ordenes = ordenRepository.findAll();
        return ordenes;
    }

    @Override
    public void editOrden(Long id, Date fecha, double total, Long cliente_id) {
        Orden orden = this.getOrden(id);
        orden.setFecha(fecha);
        orden.setTotal(total);
        orden.setCliente_id(cliente_id);
        ordenRepository.save(orden);
    }

    @Override
    public void deleteOrden(Long id) {
        Orden orden = this.getOrden(id);
        ordenRepository.delete(orden);
    }
}
