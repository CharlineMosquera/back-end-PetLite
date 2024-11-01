package com.ProyectoFInal.PetLite.service;

import com.ProyectoFInal.PetLite.model.Categoria;
import com.ProyectoFInal.PetLite.model.Producto;

import java.util.List;
import java.util.Optional;

public interface ICategoriaService {

    void createCategoria(Categoria categoria);

    Categoria getCategoriaById(Long id);

    List<Categoria> getAllCategorias();

    List<Producto> getAllProductosByCategoriaId(Long id_categoria);

    void editCategoria(Long id, String nombre_categoria, List<Producto> productos);

    void deleteCategoriaById(Long id);
}
