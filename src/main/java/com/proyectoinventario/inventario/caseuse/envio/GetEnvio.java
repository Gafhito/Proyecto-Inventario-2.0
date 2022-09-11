package com.proyectoinventario.inventario.caseuse.envio;

import com.proyectoinventario.inventario.entity.Envio;
import com.proyectoinventario.inventario.service.EnvioService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetEnvio {

    private EnvioService envioService;

    public GetEnvio(EnvioService envioService) {
        this.envioService = envioService;
    }

    public List<Envio> getAll() {
        return envioService.getAllCategoria();
    }

}
