package com.proyectoinventario.inventario.caseuse.fabricante;

import com.proyectoinventario.inventario.entity.Fabricante;
import com.proyectoinventario.inventario.service.FabricanteService;
import org.springframework.stereotype.Component;

@Component
public class CreateFabricante {

    private FabricanteService fabricanteService;

    public CreateFabricante(FabricanteService fabricanteService) {
        this.fabricanteService = fabricanteService;
    }

    public Fabricante save(Fabricante newFabricante) {
        return fabricanteService.save(newFabricante);
    }

}
