package com.ProyectoFInal.PetLite.service;

import com.ProyectoFInal.PetLite.model.Categoria;
import com.ProyectoFInal.PetLite.model.Producto;
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
    public Categoria getCategoriaById(Long id) {
        Categoria categoria = categoriaRepository.findById(id).orElse(null);
        return categoria;
    }

    @Override
    public List<Categoria> getAllCategorias() {
        List<Categoria> categorias = categoriaRepository.findAll();
        return categorias;
    }

    @Override
    public List<Producto> getAllProductosByCategoriaId(Long id_categoria) {
        Categoria categoria = this.getCategoriaById(id_categoria);
        List<Producto> productosCategoria = categoria.getProductos();
        return productosCategoria;
    }

    @Override
    public void editCategoria(Long id, String nombre_categoria, List<Producto> productos) {
        Categoria categoria = this.getCategoriaById(id);
        categoria.setNombre_categoria(nombre_categoria);
        categoria.setProductos(productos);
        categoriaRepository.save(categoria);
    }

    @Override
    public void deleteCategoriaById(Long id) {
        Categoria categoria = this.getCategoriaById(id);
        categoriaRepository.delete(categoria);
    }
}
