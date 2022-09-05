package com.proyectoinventario.inventario.repository;

import com.proyectoinventario.inventario.entity.TipoEnvio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoEnvioRepository extends JpaRepository<TipoEnvio, Long> {
}
