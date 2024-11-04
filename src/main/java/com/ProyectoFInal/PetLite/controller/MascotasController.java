package com.ProyectoFInal.PetLite.controller;

import com.ProyectoFInal.PetLite.dto.MascotaDTO;
import com.ProyectoFInal.PetLite.model.Producto;
import com.ProyectoFInal.PetLite.service.ProductoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mascotas")
public class MascotasController {

    @Autowired
    private ProductoService productoService;

    @PostMapping("/buscar-productos")
    public ResponseEntity<List<Producto>> buscarProductos(@Valid @RequestBody MascotaDTO mascotaDTO) {
        List<Producto> productos = productoService.obtenerProductosPorMascota(mascotaDTO);
        return ResponseEntity.ok(productos);
    }
}
