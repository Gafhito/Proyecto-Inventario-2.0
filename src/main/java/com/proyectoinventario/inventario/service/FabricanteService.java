package com.proyectoinventario.inventario.service;

import com.proyectoinventario.inventario.entity.Fabricante;
import com.proyectoinventario.inventario.repository.FabricanteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FabricanteService {

    private FabricanteRepository fabricanteRepository;

    public FabricanteService(FabricanteRepository fabricanteRepository) {
        this.fabricanteRepository = fabricanteRepository;
    }

    public List<Fabricante> getAllCategoria() {
        return fabricanteRepository.findAll();
    }

    public Fabricante save(Fabricante newFabricante) {
        return fabricanteRepository.save(newFabricante);
    }

    public Fabricante update(Fabricante newFabricante, Long id) {
        return fabricanteRepository.findById(id).map(
                fabricante -> {
                    fabricante.setNombre(newFabricante.getNombre());
                    return fabricanteRepository.save(fabricante);
                }
        ).get();
    }

    public void delete(Long id) {
        fabricanteRepository.delete(new Fabricante(id));
    }

}
