package com.ProyectoFInal.PetLite.controller;

import com.ProyectoFInal.PetLite.dto.CategoriaDTO;
import com.ProyectoFInal.PetLite.model.Categoria;
import com.ProyectoFInal.PetLite.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/api/categorias")
@Validated
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public List<Categoria> getAll() {
        return categoriaService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Categoria> getById(@PathVariable Long id) {
        return categoriaService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Categoria> create(@Valid @RequestBody CategoriaDTO categoriaDTO) {
        Categoria createdCategoria = categoriaService.save(categoriaDTO);
        return ResponseEntity.status(201).body(createdCategoria);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Categoria> update(@PathVariable Long id, @Valid @RequestBody CategoriaDTO categoriaDTO) {
        return ResponseEntity.ok(categoriaService.update(id, categoriaDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        categoriaService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
