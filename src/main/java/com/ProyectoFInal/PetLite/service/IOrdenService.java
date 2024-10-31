package com.ProyectoFInal.PetLite.service;

import com.ProyectoFInal.PetLite.model.Orden;

import java.util.Date;
import java.util.List;

public interface IOrdenService {

    void createOrden(Orden orden);

    Orden getOrden(Long id);

    List<Orden> getAllOrdenes();

    void editOrden(Long id, Date fecha, double total, Long cliente_id);

    void deleteOrden(Long id);
}
