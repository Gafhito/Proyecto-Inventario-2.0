package com.proyectoinventario.inventario.caseuse.categoria;

import com.proyectoinventario.inventario.entity.Categoria;
import com.proyectoinventario.inventario.service.CategoriaService;
import org.springframework.stereotype.Component;

@Component
public class UpdateCategoria {

    private CategoriaService categoriaService;

    public UpdateCategoria(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    public Categoria update(Categoria newCategoria, Long id) {
        return categoriaService.update(newCategoria, id);
    }

}
