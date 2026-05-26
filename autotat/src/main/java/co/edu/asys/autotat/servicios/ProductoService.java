package co.edu.asys.autotat.servicios;

import co.edu.asys.autotat.persistencia.entidades.ProductoEntity;
import co.edu.asys.autotat.persistencia.repositorios.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {
    private final ProductoRepository productoRepository;

    @Autowired
    public ProductoService(ProductoRepository productoRepository){
        this.productoRepository = productoRepository;
    }

    public ProductoEntity save(ProductoEntity producto){
        return productoRepository.save(producto);
    }

    public List<ProductoEntity> findAll(){
        return productoRepository.findAll();
    }
}