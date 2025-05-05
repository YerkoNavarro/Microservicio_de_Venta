package com.microservicio.ventas.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.microservicio.ventas.model.Venta;
import com.microservicio.ventas.service.VentaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class ventaController {
    @Autowired
    private VentaService ventaService;


    @PostMapping("/hacerVenta")
    ResponseEntity<String> obtenerVenta(@RequestBody Venta venta){
        return ResponseEntity.ok(ventaService.crearVenta(venta));
    }
    

    
    @GetMapping("/generarfactura")
    public ResponseEntity<Venta> obtenerVenta(@PathVariable int idVenta){ {
        return ResponseEntity.ok(ventaService.generarFactura(idVenta));
    }
    






    }
}
