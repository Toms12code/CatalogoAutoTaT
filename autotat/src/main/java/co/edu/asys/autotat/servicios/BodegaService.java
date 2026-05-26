package co.edu.asys.autotat.servicios;

import co.edu.asys.autotat.persistencia.entidades.BodegaEntity;
import co.edu.asys.autotat.persistencia.repositorios.BodegaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BodegaService {
    private final BodegaRepository bodegaRepository;

    @Autowired
    public BodegaService(BodegaRepository bodegaRepository){
        this.bodegaRepository = bodegaRepository;
    }

    public BodegaEntity save(BodegaEntity bodega){
        return bodegaRepository.save(bodega);
    }

    public List<BodegaEntity> findAll(){
        return bodegaRepository.findAll();
    }
}