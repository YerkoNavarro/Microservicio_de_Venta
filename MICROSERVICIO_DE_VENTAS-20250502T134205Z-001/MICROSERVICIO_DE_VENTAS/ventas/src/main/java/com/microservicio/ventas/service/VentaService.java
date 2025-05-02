package com.microservicio.ventas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.microservicio.ventas.entity.*;
import com.microservicio.ventas.entity.VentaEntity;
import com.microservicio.ventas.model.Venta;
import com.microservicio.ventas.repository.ventasRepository ;
@Service
public class VentaService {
    @Autowired
    private ventasRepository  ventasRepository;
    
    VentaEntity nVenta = new VentaEntity();



    public String crearVenta(Venta v){
        try {
            nVenta.setIdVenta(v.getIdVenta());
            nVenta.setIdUsuario(v.getIdUsuario());
            nVenta.setProductos(v.getProductos());
            ventasRepository.save(nVenta);
            return "Venta creada";
        } catch (Exception e) {
            return e.getMessage();
        }

    }


    public void generarFactura(int idVenta){

        try { ventaEntity  v = ventasRepository.findByIdVenta(idVenta);
            if (v != null) {
                System.out.println("Factura generada  ID Venta:" + v.getIdVenta()+ "ID Usuario:" + v.getIdUsuario() + "Productos totales:" + v.getProductos());  ;
            }

        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }

    }

}
