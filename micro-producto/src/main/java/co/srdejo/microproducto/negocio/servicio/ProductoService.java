package co.srdejo.microproducto.negocio.servicio;

import co.srdejo.microproducto.modelo.ProductoEntity;
import co.srdejo.microproducto.modelo.dto.Producto;
import co.srdejo.microproducto.negocio.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public ResponseEntity<Producto> findAll(){
        List<ProductoEntity> entities = productoRepository.findAll();


        return (ResponseEntity<Producto>) productoRepository.findAll();
    };
}
