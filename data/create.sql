CREATE DATABASE online_shop;
CREATE TABLE producto (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    descripcion TEXT,
    precio DECIMAL(10, 2) NOT NULL,
    cantidad_disponible INT NOT NULL,
    categoria VARCHAR(50),
    imagen_url VARCHAR(255)
);
