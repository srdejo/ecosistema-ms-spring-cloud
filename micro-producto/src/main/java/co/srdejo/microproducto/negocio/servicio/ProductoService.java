package co.srdejo.microproducto.negocio.servicio;

import co.srdejo.microproducto.modelo.dto.Producto;
import co.srdejo.microproducto.negocio.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public ResponseEntity<Producto> findAll(){
        return (ResponseEntity<Producto>) productoRepository.findAll();
    };
}
