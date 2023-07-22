package com.getechnologies.apirest.controller;

import com.getechnologies.apirest.FacturaService;
import com.getechnologies.apirest.models.Factura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/facturas")
public class FacturaController {
    @Autowired
    private FacturaService facturaService;
    @PostMapping
    public Factura createFactura(@RequestBody Factura factura){return facturaService.createFactura(factura);}
    @GetMapping("{id}")
    public List<Factura> getAllFacturaByID(@PathVariable("id") Long id){
        return facturaService.getFacturasByID(id);
    }
    @DeleteMapping("{id}")
    public void deleteFacturaID(@PathVariable("id") Long id){ facturaService.deleteFactura(id);}

}
