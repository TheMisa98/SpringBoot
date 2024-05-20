package com.demo.classes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController("/productos")
// @RestController()
// @RequestMapping("/productos")
public class ProductoServiceController {

    private static final Logger logger = LoggerFactory.getLogger(ProductoServiceController.class);


    @Autowired
    private ProductoService productoService;

    @GetMapping("/getAll")
    public List<Producto> getAllProductos() {
        logger.info("Iniciando la obtención de todos los productos...");
        List<Producto> productos = productoService.getAllProductos();
        logger.info("Productos obtenidos: {}", productos);
        return productos;
    }

    @GetMapping("/getProduct/{id}")
    public Producto getProductoById(@PathVariable Integer id) {
        logger.info("Iniciando la obtención del producto con ID: {}", id);
        Producto producto = productoService.getProductoById(id);
        logger.info("Producto obtenido: {}", producto);
        return producto;
    }

    // // POST: Crear un nuevo producto
    // @PostMapping
    // public Producto crearProducto(@RequestBody Producto producto) {
    //     return productoService.save(producto);
    // }

    // // PUT: Actualizar un producto existente
    // @PutMapping("/{id}")
    // public Producto actualizarProducto(@PathVariable Integer id, @RequestBody Producto productoActualizado) {
    //     Optional<Producto> optionalProducto = productoService.findById(id);
    //     if (optionalProducto.isPresent()) {
    //         Producto producto = optionalProducto.get();
    //         producto.setNombre(productoActualizado.getNombre());
    //         producto.setCantidad_disponible(productoActualizado.getCantidad_disponible());
    //         return productoService.save(producto);
    //     } else {
    //         throw new RuntimeException("Producto no encontrado con ID: " + id);
    //     }
    // }
}
