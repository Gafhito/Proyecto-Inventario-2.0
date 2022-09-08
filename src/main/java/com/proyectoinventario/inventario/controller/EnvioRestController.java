package com.proyectoinventario.inventario.controller;

import com.proyectoinventario.inventario.caseuse.envio.CreateEnvio;
import com.proyectoinventario.inventario.caseuse.envio.DeleteEnvio;
import com.proyectoinventario.inventario.caseuse.envio.UpdateEnvio;
import com.proyectoinventario.inventario.entity.Envio;
import com.proyectoinventario.inventario.repository.EnvioRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/envio")
public class EnvioRestController {

    private CreateEnvio createEnvio;
    private UpdateEnvio updateEnvio;
    private DeleteEnvio deleteEnvio;
    private EnvioRepository envioRepository;

    public EnvioRestController(CreateEnvio createEnvio, UpdateEnvio updateEnvio, DeleteEnvio deleteEnvio, EnvioRepository envioRepository) {
        this.createEnvio = createEnvio;
        this.updateEnvio = updateEnvio;
        this.deleteEnvio = deleteEnvio;
        this.envioRepository = envioRepository;
    }

    @PostMapping("/")
    ResponseEntity<Envio> newEnvio(@RequestBody Envio newEnvio) {
        return new ResponseEntity<>(createEnvio.save(newEnvio), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    ResponseEntity<Envio> replaceEnvio(@RequestBody Envio newEnvio, @PathVariable Long id) {
        return new ResponseEntity<>(updateEnvio.update(newEnvio, id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    ResponseEntity deleteEnvio(@PathVariable Long id) {
        deleteEnvio.remove(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

}
