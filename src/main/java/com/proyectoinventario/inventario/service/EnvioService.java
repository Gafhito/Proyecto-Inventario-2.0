package com.proyectoinventario.inventario.service;

import com.proyectoinventario.inventario.entity.Envio;
import com.proyectoinventario.inventario.repository.EnvioRepository;
import org.springframework.stereotype.Service;

@Service
public class EnvioService {

    private EnvioRepository envioRepository;

    public EnvioService(EnvioRepository envioRepository) {
        this.envioRepository = envioRepository;
    }

    public Envio save(Envio newEnvio) {
        return envioRepository.save(newEnvio);
    }

    public Envio update(Envio newEnvio, Long id) {
        return envioRepository.findById(id).map(
                envio -> {
                    envio.setTipo(newEnvio.getTipo());
                    return envioRepository.save(envio);
                }
        ).get();
    }

    public void delete(Long id) {
        envioRepository.delete((new Envio(id)));
    }

}
