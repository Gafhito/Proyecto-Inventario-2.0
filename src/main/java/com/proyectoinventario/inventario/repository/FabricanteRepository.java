package com.proyectoinventario.inventario.repository;

import com.proyectoinventario.inventario.entity.Fabricante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FabricanteRepository extends JpaRepository<Fabricante, Long> {
}
