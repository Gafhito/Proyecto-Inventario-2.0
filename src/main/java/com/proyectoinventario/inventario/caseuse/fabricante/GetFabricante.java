package com.proyectoinventario.inventario.caseuse.fabricante;

import com.proyectoinventario.inventario.entity.Fabricante;
import com.proyectoinventario.inventario.service.FabricanteService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetFabricante {

    private FabricanteService fabricanteService;

    public GetFabricante(FabricanteService fabricanteService) {
        this.fabricanteService = fabricanteService;
    }

    public List<Fabricante> getAll() {
        return fabricanteService.getAllCategoria();
    }

}
