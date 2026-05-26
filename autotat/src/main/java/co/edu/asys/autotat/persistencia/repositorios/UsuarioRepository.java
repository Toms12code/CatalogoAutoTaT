package co.edu.asys.autotat.persistencia.repositorios;

import co.edu.asys.autotat.persistencia.entidades.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

    void eliminar(Long id);
}