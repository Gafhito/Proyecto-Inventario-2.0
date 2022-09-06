package com.proyectoinventario.inventario.caseuse.tipoenvio;

import com.proyectoinventario.inventario.entity.TipoEnvio;
import com.proyectoinventario.inventario.service.TipoEnvioService;
import org.springframework.stereotype.Component;

@Component
public class CreateTipoEnvio {

    private TipoEnvioService tipoEnvioService;

    public CreateTipoEnvio(TipoEnvioService tipoEnvioService) {
        this.tipoEnvioService = tipoEnvioService;
    }

    public TipoEnvio save(TipoEnvio newTipoEnvio) {
        return tipoEnvioService.save(newTipoEnvio);
    }

}
