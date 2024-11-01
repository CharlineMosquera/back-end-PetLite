package com.ProyectoFInal.PetLite.service;

import com.ProyectoFInal.PetLite.model.Categoria;
import com.ProyectoFInal.PetLite.model.Producto;
import com.ProyectoFInal.PetLite.model.enums.RangoEdad;
import com.ProyectoFInal.PetLite.model.enums.Tamanio;

import java.util.Date;
import java.util.List;

public interface IProductoService {

    void createProducto(Producto producto);

    Producto getProductoById(Long id);

    List<Producto> getAllProductos();

    void editProducto(
            Long id, String nombre_producto, double precio, boolean disponibilidad,
            String descripcion, RangoEdad rangoEdad, Tamanio tamanio, Categoria categoria);

    void deleteProductoById(Long id);
}
