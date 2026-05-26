package co.edu.asys.autotat.persistencia.repositorios;

import co.edu.asys.autotat.persistencia.entidades.BodegaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BodegaRepository extends JpaRepository<BodegaEntity, Long> {
}