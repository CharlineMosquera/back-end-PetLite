package com.ProyectoFInal.PetLite.service;

import com.ProyectoFInal.PetLite.model.Producto;
import com.ProyectoFInal.PetLite.model.enums.RangoEdad;
import com.ProyectoFInal.PetLite.model.enums.Tamanio;
import com.ProyectoFInal.PetLite.repository.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService implements IProductoService{

    @Autowired
    private IProductoRepository productoRepository;

    @Override
    public void createProducto(Producto producto) {
        productoRepository.save(producto);
    }

    @Override
    public Producto getProducto(Long id) {
        Producto producto = productoRepository.findById(id).orElse(null);
        return producto;
    }

    @Override
    public List<Producto> getAllProductos() {
        List<Producto> productos = productoRepository.findAll();
        return productos;
    }

    @Override
    public void editProducto(
            Long id, String nombre_producto, double precio, boolean disponibilidad,
            String descripcion, RangoEdad rangoEdad, Tamanio tamanio, Long categoria_id) {
        Producto producto = this.getProducto(id);
        producto.setNombre_producto(nombre_producto);
        producto.setPrecio(precio);
        producto.setDisponibilidad(disponibilidad);
        producto.setDescripcion(descripcion);
        producto.setRangoEdad(rangoEdad);
        producto.setTamanio(tamanio);
        producto.setCategoria_id(categoria_id);
        productoRepository.save(producto);
    }

    @Override
    public void deleteProducto(Long id) {
        Producto producto = this.getProducto(id);
        productoRepository.delete(producto);
    }
}
