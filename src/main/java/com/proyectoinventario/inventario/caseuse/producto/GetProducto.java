package com.proyectoinventario.inventario.caseuse.producto;

import com.proyectoinventario.inventario.entity.Producto;
import com.proyectoinventario.inventario.service.ProductoService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class GetProducto {

    private ProductoService productoService;

    public GetProducto(ProductoService productoService) {
        this.productoService = productoService;
    }

    public List<Producto> getAll() {
        return productoService.getAllProductos();
    }

    public Producto getOne(Long id) {
        return productoService.getOneProducto(id);
    }

}
