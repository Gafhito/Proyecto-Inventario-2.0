package com.proyectoinventario.inventario.caseuse.producto;

import com.proyectoinventario.inventario.service.ProductoService;
import org.springframework.stereotype.Component;

@Component
public class DeleteProducto {

    private ProductoService productoService;

    public DeleteProducto(ProductoService productoService) {
        this.productoService = productoService;
    }

    public void remove(Long id) {
        productoService.delete(id);
    }

}
