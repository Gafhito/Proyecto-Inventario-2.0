package com.proyectoinventario.inventario.caseuse.categoria;

import com.proyectoinventario.inventario.service.CategoriaService;
import org.springframework.stereotype.Component;

@Component
public class DeleteCategoria {

    private CategoriaService categoriaService;

    public DeleteCategoria(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    public void remove(Long id) {
        categoriaService.delete(id);
    }

}
