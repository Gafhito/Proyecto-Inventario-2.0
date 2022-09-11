package com.proyectoinventario.inventario.service;

import com.proyectoinventario.inventario.entity.Categoria;
import com.proyectoinventario.inventario.repository.CategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    private CategoriaRepository categoriaRepository;

    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    public List<Categoria> getAllCategoria() {
        return categoriaRepository.findAll();
    }

    public Categoria save(Categoria newCategoria) {
        return categoriaRepository.save(newCategoria);
    }

    public Categoria update(Categoria newCategoria, Long id) {
        return categoriaRepository.findById(id).map(
                categoria -> {
                    categoria.setNombre(newCategoria.getNombre());
                    return categoriaRepository.save(categoria);
                }
        ).get();
    }

    public void delete(Long id) {
        categoriaRepository.delete(new Categoria(id));
    }

}
