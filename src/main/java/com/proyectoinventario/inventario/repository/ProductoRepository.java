package com.proyectoinventario.inventario.repository;

import com.proyectoinventario.inventario.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

    @Query(value = "select * from Producto order by categoria", nativeQuery = true)
    List<Producto> findAll();

    @Query(value = "select * from Producto as p where p.id = ?1", nativeQuery = true)
    Producto findOneById(Long id);

}
