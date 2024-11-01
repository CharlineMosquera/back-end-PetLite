package com.ProyectoFInal.PetLite.service;

import com.ProyectoFInal.PetLite.model.Cliente;
import com.ProyectoFInal.PetLite.model.Orden;
import com.ProyectoFInal.PetLite.model.Producto;

import java.util.Date;
import java.util.List;

public interface IOrdenService {

    void createOrden(Orden orden);

    Orden getOrdenById(Long id);

    List<Orden> getAllOrdenes();

    List<Producto> getAllProductosByOrdenId(Long id_orden);

    void editOrden(Long id, Date fecha, double total, Cliente cliente, List<Producto> productos);

    void deleteOrdenById(Long id);
}
