package com.microservicio.ventas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservicio.ventas.entity.ProductoEntity;



@Repository


public interface ventasRepository extends JpaRepository<ProductoEntity, Integer> {

    ProductoEntity findByIdProducto(int idProducto);
    boolean exexistsByIdProducto(int idProducto);
    void deleteByIdProducto(int idProducto);


}
