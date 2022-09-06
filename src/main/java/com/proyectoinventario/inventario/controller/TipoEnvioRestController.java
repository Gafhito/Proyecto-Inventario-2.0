package com.proyectoinventario.inventario.controller;

import com.proyectoinventario.inventario.caseuse.tipoenvio.CreateTipoEnvio;
import com.proyectoinventario.inventario.caseuse.tipoenvio.DeleteTipoEnvio;
import com.proyectoinventario.inventario.caseuse.tipoenvio.UpdateTipoEnvio;
import com.proyectoinventario.inventario.entity.TipoEnvio;
import com.proyectoinventario.inventario.repository.TipoEnvioRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tipo-envio")
public class TipoEnvioRestController {

    private CreateTipoEnvio createTipoEnvio;
    private UpdateTipoEnvio updateTipoEnvio;
    private DeleteTipoEnvio deleteTipoEnvio;
    private TipoEnvioRepository tipoEnvioRepository;

    public TipoEnvioRestController(CreateTipoEnvio createTipoEnvio, UpdateTipoEnvio updateTipoEnvio, DeleteTipoEnvio deleteTipoEnvio, TipoEnvioRepository tipoEnvioRepository) {
        this.createTipoEnvio = createTipoEnvio;
        this.updateTipoEnvio = updateTipoEnvio;
        this.deleteTipoEnvio = deleteTipoEnvio;
        this.tipoEnvioRepository = tipoEnvioRepository;
    }

    @PostMapping("/")
    ResponseEntity<TipoEnvio> newTipoEnvio(@RequestBody TipoEnvio newTipoEnvio) {
        return new ResponseEntity<>(createTipoEnvio.save(newTipoEnvio), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    ResponseEntity<TipoEnvio> replaceTipoEnvio(@RequestBody TipoEnvio newTipoEnvio, @PathVariable Long id) {
        return new ResponseEntity<>(updateTipoEnvio.update(newTipoEnvio, id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    ResponseEntity deleteTipoEnvio(@PathVariable Long id) {
        deleteTipoEnvio.remove(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

}
