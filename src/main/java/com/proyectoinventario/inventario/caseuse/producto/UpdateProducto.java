package com.proyectoinventario.inventario.caseuse.producto;

import com.proyectoinventario.inventario.entity.Producto;
import com.proyectoinventario.inventario.service.ProductoService;
import org.springframework.stereotype.Component;

@Component
public class UpdateProducto {

    private ProductoService productoService;

    public UpdateProducto(ProductoService productoService) {
        this.productoService = productoService;
    }

    public Producto update(Producto newProducto, Long id) {
        return productoService.update(newProducto, id);
    }

}
