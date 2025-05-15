package com.microservicio.ventas.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;


import com.microservicio.ventas.model.Venta;
import com.microservicio.ventas.service.VentaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;






@RestController
@RequestMapping("/api/v1/ventas")
public class ventaController {
    @Autowired
    private VentaService ventaService;


    @PostMapping("/")
    ResponseEntity<String> obtenerVenta(@RequestBody Venta venta){
        return ResponseEntity.ok(ventaService.crearVenta(venta));
    }
   

    
    @GetMapping("/{idVenta}")
    public ResponseEntity<Venta> obtenerVenta(@PathVariable int idVenta){ 

        return ResponseEntity.ok(ventaService.traerVenta(idVenta));
            
    }

    
    
    @DeleteMapping("/{idVenta}")
    public ResponseEntity<String> eliminarVenta(@PathVariable int idVenta){ {
        return ResponseEntity.ok(ventaService.eliminarVenta(idVenta));
    }
}
}
