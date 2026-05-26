package co.edu.asys.autotat.api;

import co.edu.asys.autotat.persistencia.entidades.UsuarioEntity;
import co.edu.asys.autotat.servicios.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Usuario")
public class UsuarioController {
    private final UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public ResponseEntity<UsuarioEntity> create(@RequestBody UsuarioEntity usuario){
        return ResponseEntity.ok(usuarioService.save(usuario));
    }

    @GetMapping
    public ResponseEntity<List<UsuarioEntity>> findAll(){
        return ResponseEntity.ok(usuarioService.findAll());
    }
}