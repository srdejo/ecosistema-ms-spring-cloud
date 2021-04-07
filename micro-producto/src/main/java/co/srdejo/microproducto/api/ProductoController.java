package co.srdejo.microproducto.api;


import co.srdejo.microproducto.modelo.dto.Producto;
import co.srdejo.microproducto.negocio.servicio.ProductoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.util.UUID;

@RequestMapping("/producto")
@RestController
@Api(value = "Producto Controller", description = "Controller para el manejo de los productos.")
public class ProductoController {

    @Autowired
    private ProductoService productoService;


    @ApiOperation(value = "Permite Listar todas los productos de la base de datos.")
    @GetMapping
    @ResponseBody
    public ResponseEntity<String> findAll() {
        return ResponseEntity.ok("prueba");
    }


}
