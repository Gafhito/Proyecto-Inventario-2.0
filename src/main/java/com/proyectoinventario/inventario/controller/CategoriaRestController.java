package com.proyectoinventario.inventario.controller;

import com.proyectoinventario.inventario.caseuse.categoria.CreateCategoria;
import com.proyectoinventario.inventario.caseuse.categoria.DeleteCategoria;
import com.proyectoinventario.inventario.caseuse.categoria.GetCategoria;
import com.proyectoinventario.inventario.caseuse.categoria.UpdateCategoria;
import com.proyectoinventario.inventario.entity.Categoria;
import com.proyectoinventario.inventario.repository.CategoriaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaRestController {

    private GetCategoria getCategoria;
    private CreateCategoria createCategoria;
    private UpdateCategoria updateCategoria;
    private DeleteCategoria deleteCategoria;
    private CategoriaRepository categoriaRepository;

    public CategoriaRestController(GetCategoria getCategoria, CreateCategoria createCategoria, UpdateCategoria updateCategoria, DeleteCategoria deleteCategoria, CategoriaRepository categoriaRepository) {
        this.getCategoria = getCategoria;
        this.createCategoria = createCategoria;
        this.updateCategoria = updateCategoria;
        this.deleteCategoria = deleteCategoria;
        this.categoriaRepository = categoriaRepository;
    }

    @GetMapping
    List<Categoria> get() {
        return getCategoria.getAll();
    }

    @PostMapping
    ResponseEntity<Categoria> newCategoria(@RequestBody Categoria newCategoria) {
        return new ResponseEntity<>(createCategoria.save(newCategoria), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    ResponseEntity<Categoria> replaceCategoria(@RequestBody Categoria newCategoria, @PathVariable Long id) {
        return new ResponseEntity<>(updateCategoria.update(newCategoria, id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    ResponseEntity deleteCategoria(@PathVariable Long id) {
        deleteCategoria.remove(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

}
