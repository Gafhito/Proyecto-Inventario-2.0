package com.proyectoinventario.inventario.caseuse.fabricante;

import com.proyectoinventario.inventario.entity.Fabricante;
import com.proyectoinventario.inventario.service.FabricanteService;
import org.springframework.stereotype.Component;

@Component
public class UpdateFabricante {

    private FabricanteService fabricanteService;

    public UpdateFabricante(FabricanteService fabricanteService) {
        this.fabricanteService = fabricanteService;
    }

    public Fabricante update(Fabricante newFabricante, Long id) {
        return fabricanteService.update(newFabricante, id);
    }

}
