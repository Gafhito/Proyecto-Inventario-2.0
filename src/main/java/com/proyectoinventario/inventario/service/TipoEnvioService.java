package com.proyectoinventario.inventario.service;

import com.proyectoinventario.inventario.entity.TipoEnvio;
import com.proyectoinventario.inventario.repository.TipoEnvioRepository;
import org.springframework.stereotype.Service;

@Service
public class TipoEnvioService {

    private TipoEnvioRepository tipoEnvioRepository;

    public TipoEnvioService(TipoEnvioRepository tipoEnvioRepository) {
        this.tipoEnvioRepository = tipoEnvioRepository;
    }

    public TipoEnvio save(TipoEnvio newTipoEnvio) {
        return tipoEnvioRepository.save(newTipoEnvio);
    }

    public TipoEnvio update(TipoEnvio newTipoEnvio, Long id) {
        return tipoEnvioRepository.findById(id).map(
                tipoEnvio -> {
                    tipoEnvio.setTipo(newTipoEnvio.getTipo());
                    return tipoEnvioRepository.save(tipoEnvio);
                }
        ).get();
    }

    public void delete(Long id) {
        tipoEnvioRepository.delete(new TipoEnvio(id));
    }

}
