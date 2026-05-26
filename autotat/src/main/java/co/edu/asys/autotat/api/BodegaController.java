package co.edu.asys.autotat.api;

import co.edu.asys.autotat.persistencia.entidades.BodegaEntity;
import co.edu.asys.autotat.servicios.BodegaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Bodega")
public class BodegaController {
    private final BodegaService bodegaService;

    @Autowired
    public BodegaController(BodegaService bodegaService){
        this.bodegaService = bodegaService;
    }

    @PostMapping
    public ResponseEntity<BodegaEntity> create(@RequestBody BodegaEntity bodega){
        return ResponseEntity.ok(bodegaService.save(bodega));
    }

    @GetMapping
    public ResponseEntity<List<BodegaEntity>> findAll(){
        return ResponseEntity.ok(bodegaService.findAll());
    }
}