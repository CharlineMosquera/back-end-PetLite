package com.ProyectoFInal.PetLite.service;

import com.ProyectoFInal.PetLite.model.Categoria;
import com.ProyectoFInal.PetLite.repository.ICategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService implements ICategoriaService{

    @Autowired
    private ICategoriaRepository categoriaRepository;

    @Override
    public Categoria createCategoria(Categoria categoria) {
        categoriaRepository.save(categoria);
        return categoria;
    }

    @Override
    public Categoria getCategoria(Long id) {
        return null;
    }

    @Override
    public void editCategoria(Long id) {

    }
}
