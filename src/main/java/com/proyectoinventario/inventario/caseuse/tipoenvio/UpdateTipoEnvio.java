package com.proyectoinventario.inventario.caseuse.tipoenvio;

import com.proyectoinventario.inventario.entity.TipoEnvio;
import com.proyectoinventario.inventario.service.TipoEnvioService;
import org.springframework.stereotype.Component;

@Component
public class UpdateTipoEnvio {

    private TipoEnvioService tipoEnvioService;

    public UpdateTipoEnvio(TipoEnvioService tipoEnvioService) {
        this.tipoEnvioService = tipoEnvioService;
    }

    public TipoEnvio update(TipoEnvio newTipoEnvio, Long id) {
        return tipoEnvioService.update(newTipoEnvio, id);
    }

}
