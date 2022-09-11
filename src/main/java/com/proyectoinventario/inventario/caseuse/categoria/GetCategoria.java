package com.proyectoinventario.inventario.caseuse.categoria;

import com.proyectoinventario.inventario.entity.Categoria;
import com.proyectoinventario.inventario.service.CategoriaService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetCategoria {

    private CategoriaService categoriaService;

    public GetCategoria(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    public List<Categoria> getAll() {
        return categoriaService.getAllCategoria();
    }

}
