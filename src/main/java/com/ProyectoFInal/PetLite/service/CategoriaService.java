package com.ProyectoFInal.PetLite.service;

import com.ProyectoFInal.PetLite.model.Categoria;
import com.ProyectoFInal.PetLite.repository.ICategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService implements ICategoriaService{

    @Autowired
    private ICategoriaRepository categoriaRepository;

    @Override
    public void createCategoria(Categoria categoria) {
        categoriaRepository.save(categoria);
    }

    @Override
    public Categoria getCategoria(Long id) {
        Categoria categoria = categoriaRepository.findById(id).orElse(null);
        return categoria;
    }

    @Override
    public List<Categoria> getAllCategorias() {
        List<Categoria> categorias = categoriaRepository.findAll();
        return categorias;
    }

    @Override
    public void editCategoria(Long id, String nombre_categoria) {
        Categoria categoria = this.getCategoria(id);
        categoria.setNombre_categoria(nombre_categoria);
        categoriaRepository.save(categoria);
    }

    @Override
    public void deleteCategoria(Long id) {
        Categoria categoria = this.getCategoria(id);
        categoriaRepository.delete(categoria);
    }
}
