package com.microservicio.ventas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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


    public Venta traerVenta(int idVenta){

        try { VentaEntity  v = ventasRepository.findByIdVenta(idVenta);
            if (v != null) {
                Venta venta = new Venta();
                venta.setIdVenta(v.getIdVenta());
                venta.setIdUsuario(v.getIdUsuario());
                venta.setProductos(v.getProductos());
                return venta;
            
            }

        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
        return null;

    }


    @Transactional
    public String eliminarVenta(int idV){
        try {
            VentaEntity v = ventasRepository.findByIdVenta(idV);
            if (v != null){
                ventasRepository.deleteByIdVenta(idV);
                return "Venta eliminada";
            }
        } catch (Exception e) {
            return e.getMessage();
        }
        return "No hay venta para eliminar con el id: " + idV;
    }

}
