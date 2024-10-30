package com.ProyectoFInal.PetLite.service;

import com.ProyectoFInal.PetLite.model.Categoria;

public interface ICategoriaService {

    Categoria createCategoria(Categoria categoria);

    Categoria getCategoria(Long id);

    void editCategoria(Long id);
}
