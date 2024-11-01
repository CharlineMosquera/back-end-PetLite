package com.ProyectoFInal.PetLite.service;

import com.ProyectoFInal.PetLite.model.Cliente;
import com.ProyectoFInal.PetLite.model.Orden;
import com.ProyectoFInal.PetLite.model.Producto;
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
    public Orden getOrdenById(Long id) {
        Orden orden = ordenRepository.findById(id).orElse(null);
        return orden;
    }

    @Override
    public List<Orden> getAllOrdenes() {
        List<Orden> ordenes = ordenRepository.findAll();
        return ordenes;
    }

    @Override
    public List<Producto> getAllProductosByOrdenId(Long id_orden) {
        Orden orden = this.getOrdenById(id_orden);
        List<Producto> productosEnOrden = orden.getProductos();
        return productosEnOrden;
    }

    @Override
    public void editOrden(Long id, Date fecha, double total, Cliente cliente, List<Producto> productos) {
        Orden orden = this.getOrdenById(id);
        orden.setFecha(fecha);
        orden.setTotal(total);
        orden.setCliente(cliente);
        orden.setProductos(productos);
        ordenRepository.save(orden);
    }

    @Override
    public void deleteOrdenById(Long id) {
        Orden orden = this.getOrdenById(id);
        ordenRepository.delete(orden);
    }
}
