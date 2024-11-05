package com.ProyectoFInal.PetLite.service;

import com.ProyectoFInal.PetLite.dto.MascotaDTO;
import com.ProyectoFInal.PetLite.dto.ProductoDTO;
import com.ProyectoFInal.PetLite.model.Producto;
import com.ProyectoFInal.PetLite.repository.ProductoRepository;
import com.ProyectoFInal.PetLite.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class ProductoService implements IProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Autowired
    private CategoriaRepository categoriaRepository; // Para manejar las categorías

    @Override
    public ProductoDTO createProducto(ProductoDTO productoDTO) {
        Producto producto = new Producto();
        // Mapea los campos del DTO a la entidad
        producto.setNombre_producto(productoDTO.getNombre_producto());
        producto.setPrecio(productoDTO.getPrecio());
        producto.setDisponibilidad(productoDTO.getDisponibilidad());
        producto.setDescripcion(productoDTO.getDescripcion());
        producto.setRangoEdad(productoDTO.getRangoEdad());
        producto.setTamanio(productoDTO.getTamanio());
        producto.setImagen(productoDTO.getImagen());

        if (productoDTO.getId_categoria() != null) {
            producto.setCategoriaProducto(categoriaRepository.findById(productoDTO.getId_categoria()).orElse(null));
        }

        return mapToDTO(productoRepository.save(producto));
    }

    public List<ProductoDTO> crearProductos(List<ProductoDTO> productosDTO) {
        List<Producto> productos = new ArrayList<>();
        for (ProductoDTO dto : productosDTO) {
            Producto producto = new Producto();
            producto.setNombre_producto(dto.getNombre_producto());
            producto.setPrecio(dto.getPrecio());
            producto.setDisponibilidad(dto.getDisponibilidad());
            producto.setDescripcion(dto.getDescripcion());
            producto.setRangoEdad(dto.getRangoEdad());
            producto.setTamanio(dto.getTamanio());
            producto.setImagen(dto.getImagen());

            if (dto.getId_categoria() != null) {
                producto.setCategoriaProducto(categoriaRepository.findById(dto.getId_categoria()).orElse(null));
            }
            productos.add(producto);
        }
        productoRepository.saveAll(productos);
        return productosDTO;
    }

    @Override
    public ProductoDTO getProductoById(Long id) {
        return productoRepository.findById(id)
                .map(this::mapToDTO)
                .orElse(null); // O lanzar una excepción
    }

    @Override
    public List<ProductoDTO> getAllProductos() {
        return productoRepository.findAll().stream()
                .map(this::mapToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public ProductoDTO updateProducto(Long id, ProductoDTO productoDTO) {
        Producto producto = productoRepository.findById(id).orElse(null); // O lanzar excepción
        if (producto != null) {
            // Actualiza los campos
            producto.setNombre_producto(productoDTO.getNombre_producto());
            producto.setPrecio(productoDTO.getPrecio());
            producto.setDisponibilidad(productoDTO.getDisponibilidad());
            producto.setDescripcion(productoDTO.getDescripcion());
            producto.setRangoEdad(productoDTO.getRangoEdad());
            producto.setTamanio(productoDTO.getTamanio());
            producto.setImagen(productoDTO.getImagen());

            if (productoDTO.getId_categoria() != null) {
                producto.setCategoriaProducto(categoriaRepository.findById(productoDTO.getId_categoria()).orElse(null));
            }

            return mapToDTO(productoRepository.save(producto));
        }
        return null; // O lanzar una excepción
    }

    @Override
    public void deleteProducto(Long id) {
        productoRepository.deleteById(id);
    }

    // Método para mapear Producto a ProductoDTO
    private ProductoDTO mapToDTO(Producto producto) {
        ProductoDTO dto = new ProductoDTO();
        dto.setId_producto(producto.getId_producto());
        dto.setNombre_producto(producto.getNombre_producto());
        dto.setPrecio(producto.getPrecio());
        dto.setDisponibilidad(producto.isDisponibilidad());
        dto.setDescripcion(producto.getDescripcion());
        dto.setRangoEdad(producto.getRangoEdad());
        dto.setTamanio(producto.getTamanio());
        dto.setImagen(producto.getImagen());
        if (producto.getCategoriaProducto() != null) {
            dto.setId_categoria(producto.getCategoriaProducto().getId_categoria());
        }
        return dto;
    }

    public List<Producto> obtenerProductosPorMascota(MascotaDTO mascotaDTO) {
        // Obtener todos los productos
        List<Producto> productos = productoRepository.findAll();

        // Filtrar productos que coincidan con el tamaño y rango de edad
        List<Producto> productosFiltrados = productos.stream()
                .filter(producto -> producto.getTamanio().contains(mascotaDTO.getTamanio()) &&
                        producto.getRangoEdad().contains(mascotaDTO.getEdad()))
                .toList(); // Coleccionar resultados en una lista

        // Agrupar los productos por ID de categoría
        Map<Long, List<Producto>> productosPorCategoria = productosFiltrados.stream()
                .collect(Collectors.groupingBy(Producto::getIdCategoria));

        // Seleccionar un producto aleatorio de cada categoría si está disponible
        return productosPorCategoria.values().stream()
                .map(listaProductos -> listaProductos.get(new Random().nextInt(listaProductos.size())))
                .collect(Collectors.toList());
    }
}
