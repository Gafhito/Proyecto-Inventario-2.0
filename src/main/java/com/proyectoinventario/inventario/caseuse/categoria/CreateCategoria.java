package com.proyectoinventario.inventario.caseuse.categoria;

import com.proyectoinventario.inventario.entity.Categoria;
import com.proyectoinventario.inventario.service.CategoriaService;
import org.springframework.stereotype.Component;

@Component
public class CreateCategoria {

    private CategoriaService categoriaService;

    public CreateCategoria(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    public Categoria save(Categoria newCategoria) {
        return categoriaService.save(newCategoria);
    }

}
