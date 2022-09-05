package com.proyectoinventario.inventario.service;

import com.proyectoinventario.inventario.entity.Envio;
import com.proyectoinventario.inventario.entity.Producto;
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

    public Envio update(Envio newEnvio, Long id_producto, Long id_envio) {
        return envioRepository.findById(id_producto).map(
                envio -> {
                    envio.setProducto_id(newEnvio.getProducto_id());
                    envio.setEnvio_id(newEnvio.getEnvio_id());
                    return envioRepository.save(envio);
                }
        ).get();
    }

    public void delete(Long id) {
        envioRepository.delete(new Envio(id));
    }

}
