package com.proyectoinventario.inventario.caseuse.envio;

import com.proyectoinventario.inventario.service.EnvioService;
import org.springframework.stereotype.Component;

@Component
public class DeleteEnvio {

    private EnvioService envioService;

    public DeleteEnvio(EnvioService envioService) {
        this.envioService = envioService;
    }

    public void remove(Long id) {
        envioService.delete(id);
    }

}
