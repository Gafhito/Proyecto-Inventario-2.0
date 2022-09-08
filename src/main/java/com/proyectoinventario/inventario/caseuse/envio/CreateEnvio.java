package com.proyectoinventario.inventario.caseuse.envio;

import com.proyectoinventario.inventario.entity.Envio;
import com.proyectoinventario.inventario.service.EnvioService;
import org.springframework.stereotype.Component;

@Component
public class CreateEnvio {

    private EnvioService envioService;

    public CreateEnvio(EnvioService envioService) {
        this.envioService = envioService;
    }

    public Envio save(Envio newEnvio) {
        return envioService.save(newEnvio);
    }

}
