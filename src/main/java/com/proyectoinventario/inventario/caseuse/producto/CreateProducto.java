package com.proyectoinventario.inventario.caseuse.producto;

import com.proyectoinventario.inventario.entity.Producto;
import com.proyectoinventario.inventario.service.ProductoService;
import org.springframework.stereotype.Component;

@Component
public class CreateProducto {

    private ProductoService productoService;

    public CreateProducto(ProductoService productoService) {
        this.productoService = productoService;
    }

    public Producto save(Producto newProducto) {
        return productoService.save(newProducto);
    }

}
