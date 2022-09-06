package com.proyectoinventario.inventario.caseuse.fabricante;

import com.proyectoinventario.inventario.service.FabricanteService;
import org.springframework.stereotype.Component;

@Component
public class DeleteFabricante {

    private FabricanteService fabricanteService;

    public DeleteFabricante(FabricanteService fabricanteService) {
        this.fabricanteService = fabricanteService;
    }

    public void remove(Long id) {
        fabricanteService.delete(id);
    }

}
