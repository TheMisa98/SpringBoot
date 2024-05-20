package com.demo.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> getAllProductos() {
        System.out.println("Service");
        return productoRepository.findByCantidadDisponibleGreaterThanZero();
    }

    // public Producto getProductoById(Integer id) {
    //     return productoRepository.findById(id).orElse(null);
    // }

    // public Producto addProducto(Producto producto) {
    //     return productoRepository.save(producto);
    // }

    // public Producto updateProducto(Integer productoId, Producto updatedProducto) {
    //     if (!productoRepository.existsById(productoId)) {
    //         return null;
    //     }
    //     Producto existingProducto = productoRepository.getReferenceById(productoId);
    //     return productoRepository.save(existingProducto);
    // }

    // public void deleteProducto(Integer productoId) {
    //     if (!productoRepository.existsById(productoId)) {
    //         return;
    //     }
    //     productoRepository.deleteById(productoId);
    // }
}
