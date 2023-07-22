package com.getechnologies.apirest;

import com.getechnologies.apirest.models.Factura;
import com.getechnologies.apirest.repository.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class FacturaService {
    @Autowired
    private FacturaRepository facturaRepository;

    public Factura createFactura(Factura factura){return facturaRepository.save(factura);}

    public List<Factura> getFacturasByID(Long id){
        Optional<Factura> optionalFactura = facturaRepository.findById(id);
        return optionalFactura.stream().toList();
    }
    public List<Factura> getAllFacturaByIdPersona(Long id){


        return facturaRepository.findAll();
    }
    public void deleteFactura(Long id){facturaRepository.deleteById(id);}
}
