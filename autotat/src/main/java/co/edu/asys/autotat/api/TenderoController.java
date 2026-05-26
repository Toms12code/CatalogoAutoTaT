package co.edu.asys.autotat.api;

import co.edu.asys.autotat.persistencia.entidades.UsuarioEntity;
import co.edu.asys.autotat.servicios.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Tendero")
public class TenderoController {
    private final UsuarioService usuarioService;

    @Autowired
    public TenderoController(UsuarioService usuarioService){
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

    @DeleteMapping
    public ResponseEntity<Void> eliminar(@PathVariable long id){
                usuarioService.eliminar(id);
                return ResponseEntity.noContent().build();

    }
}