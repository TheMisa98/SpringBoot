package com.demo.classes;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Producto {
    @Id
    public Integer id;
    public String nombre;
    public String descripcion;
    public Float precio;
    public int cantidad_disponible;
    public String categoria;
    public String imagen_url;
    // Getters
    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Float getPrecio() {
        return precio;
    }

    public int getCantidadDisponible() {
        return cantidad_disponible;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getImagenUrl() {
        return imagen_url;
    }

    // Setters
    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public void setCantidadDisponible(int cantidad_disponible) {
        this.cantidad_disponible = cantidad_disponible;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setImagenUrl(String imagen_url) {
        this.imagen_url = imagen_url;
    }
}
