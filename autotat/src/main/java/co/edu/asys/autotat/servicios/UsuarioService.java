package co.edu.asys.autotat.servicios;

import co.edu.asys.autotat.persistencia.entidades.UsuarioEntity;
import co.edu.asys.autotat.persistencia.repositorios.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    public UsuarioEntity save(UsuarioEntity usuario){
        return usuarioRepository.save(usuario);
    }

    public List<UsuarioEntity> findAll(){
        return usuarioRepository.findAll();
    }


    public void eliminar(long id) {
    }
}