package com.proyectoinventario.inventario.controller;

import com.proyectoinventario.inventario.caseuse.fabricante.CreateFabricante;
import com.proyectoinventario.inventario.caseuse.fabricante.DeleteFabricante;
import com.proyectoinventario.inventario.caseuse.fabricante.GetFabricante;
import com.proyectoinventario.inventario.caseuse.fabricante.UpdateFabricante;
import com.proyectoinventario.inventario.entity.Fabricante;
import com.proyectoinventario.inventario.repository.FabricanteRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fabricante")
public class FabricanteRestController {

    private GetFabricante getFabricante;
    private CreateFabricante createFabricante;
    private UpdateFabricante updateFabricante;
    private DeleteFabricante deleteFabricante;
    private FabricanteRepository fabricanteRepository;

    public FabricanteRestController(GetFabricante getFabricante, CreateFabricante createFabricante, UpdateFabricante updateFabricante, DeleteFabricante deleteFabricante, FabricanteRepository fabricanteRepository) {
        this.getFabricante = getFabricante;
        this.createFabricante = createFabricante;
        this.updateFabricante = updateFabricante;
        this.deleteFabricante = deleteFabricante;
        this.fabricanteRepository = fabricanteRepository;
    }

    @GetMapping
    List<Fabricante> get() {
        return getFabricante.getAll();
    }

    @PostMapping
    ResponseEntity<Fabricante> newFabricante(@RequestBody Fabricante newFabricante) {
        return new ResponseEntity<>(createFabricante.save(newFabricante), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    ResponseEntity<Fabricante> replaceFabricante(@RequestBody Fabricante newFabricante, @PathVariable Long id) {
        return new ResponseEntity<>(updateFabricante.update(newFabricante, id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    ResponseEntity deleteFabricante(@PathVariable Long id) {
        deleteFabricante.remove(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

}
