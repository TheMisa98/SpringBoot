package com.demo.classes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

    // Método para consultar productos con cantidad disponible mayor que cero
    @Query("SELECT p FROM Producto p WHERE p.cantidadDisponible > 0")
    List<Producto> findByCantidadDisponibleGreaterThanZero();
}

