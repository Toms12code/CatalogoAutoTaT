package co.edu.asys.autotat.api;

import co.edu.asys.autotat.persistencia.entidades.ProductoEntity;
import co.edu.asys.autotat.servicios.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Producto")
public class ProductoController {
    private final ProductoService productoService;

    @Autowired
    public ProductoController(ProductoService productoService){
        this.productoService = productoService;
    }

    @PostMapping
    public ResponseEntity<ProductoEntity> create(@RequestBody ProductoEntity producto){
        return ResponseEntity.ok(productoService.save(producto));
    }

    @GetMapping
    public ResponseEntity<List<ProductoEntity>> findAll(){
        return ResponseEntity.ok(productoService.findAll());
    }
}