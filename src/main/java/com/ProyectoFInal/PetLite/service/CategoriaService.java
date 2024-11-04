package com.ProyectoFInal.PetLite.service;

import com.ProyectoFInal.PetLite.dto.CategoriaDTO;
import com.ProyectoFInal.PetLite.model.Categoria;
import com.ProyectoFInal.PetLite.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> findAll() {
        return categoriaRepository.findAll();
    }

    public Optional<Categoria> findById(Long id) {
        return categoriaRepository.findById(id);
    }

    public Categoria save(CategoriaDTO categoriaDTO) {
        Categoria categoria = new Categoria();
        categoria.setNombre_categoria(categoriaDTO.getNombre_categoria());
        return categoriaRepository.save(categoria);
    }

    public Categoria update(Long id, CategoriaDTO categoriaDTO) {
        Categoria categoria = categoriaRepository.findById(id).orElseThrow();
        categoria.setNombre_categoria(categoriaDTO.getNombre_categoria());
        return categoriaRepository.save(categoria);
    }

    public void delete(Long id) {
        categoriaRepository.deleteById(id);
    }
}
