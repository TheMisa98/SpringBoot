package com.demo.classes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {
    // Método para consultar productos con cantidad disponible mayor que cero
    @Query("SELECT p FROM Producto p WHERE p.cantidad_disponible > 0")
    List<Producto> findByCantidadDisponibleGreaterThanZero();
}

