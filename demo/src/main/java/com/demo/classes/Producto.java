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

}
