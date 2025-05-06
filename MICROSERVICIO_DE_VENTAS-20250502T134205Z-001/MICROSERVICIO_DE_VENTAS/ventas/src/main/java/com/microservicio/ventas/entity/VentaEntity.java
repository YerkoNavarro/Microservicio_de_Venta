package com.microservicio.ventas.entity;


import jakarta.persistence.GenerationType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class VentaEntity {
    

    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Id
    private int idVenta;

    private int idUsuario;
    private String productos;

}
