package com.proyectoinventario.inventario.caseuse.tipoenvio;

import com.proyectoinventario.inventario.service.TipoEnvioService;
import org.springframework.stereotype.Component;

@Component
public class DeleteTipoEnvio {

    private TipoEnvioService tipoEnvioService;

    public DeleteTipoEnvio(TipoEnvioService tipoEnvioService) {
        this.tipoEnvioService = tipoEnvioService;
    }

    public void remove(Long id) {
        tipoEnvioService.delete(id);
    }

}
