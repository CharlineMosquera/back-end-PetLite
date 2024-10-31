package com.ProyectoFInal.PetLite.service;

import com.ProyectoFInal.PetLite.model.Categoria;

import java.util.List;
import java.util.Optional;

public interface ICategoriaService {

    void createCategoria(Categoria categoria);

    Categoria getCategoria(Long id);

    List<Categoria> getAllCategorias();

    void editCategoria(Long id, String nombre_categoria);

    void deleteCategoria(Long id);
}
