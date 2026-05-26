package co.edu.asys.autotat.persistencia.repositorios;

import co.edu.asys.autotat.persistencia.entidades.ProductoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<ProductoEntity, Long> {
}