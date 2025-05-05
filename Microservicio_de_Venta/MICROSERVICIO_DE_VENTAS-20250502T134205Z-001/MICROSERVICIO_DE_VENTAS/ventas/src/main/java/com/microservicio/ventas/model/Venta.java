package com.microservicio.ventas.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Venta {
    private int idVenta;
    private int idUsuario;
    private String productos;
    
}
