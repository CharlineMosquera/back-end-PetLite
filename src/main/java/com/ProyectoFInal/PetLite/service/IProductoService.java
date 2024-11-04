package com.ProyectoFInal.PetLite.service;

import com.ProyectoFInal.PetLite.dto.ProductoDTO;

import java.util.List;

public interface IProductoService {
    ProductoDTO createProducto(ProductoDTO productoDTO);
    ProductoDTO getProductoById(Long id);
    List<ProductoDTO> getAllProductos();
    List<ProductoDTO> crearProductos(List<ProductoDTO> productosDTO);
    ProductoDTO updateProducto(Long id, ProductoDTO productoDTO);
    void deleteProducto(Long id);
}
