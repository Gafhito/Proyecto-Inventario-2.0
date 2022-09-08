package com.proyectoinventario.inventario.caseuse.envio;

import com.proyectoinventario.inventario.entity.Envio;
import com.proyectoinventario.inventario.service.EnvioService;
import org.springframework.stereotype.Component;

@Component
public class UpdateEnvio {

    private EnvioService envioService;

    public UpdateEnvio(EnvioService envioService) {
        this.envioService = envioService;
    }

    public Envio update(Envio newEnvio, Long id) {
        return envioService.update(newEnvio, id);
    }

}
