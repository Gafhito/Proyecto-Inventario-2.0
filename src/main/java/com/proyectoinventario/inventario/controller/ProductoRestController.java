package com.proyectoinventario.inventario.controller;

import com.proyectoinventario.inventario.caseuse.producto.CreateProducto;
import com.proyectoinventario.inventario.caseuse.producto.DeleteProducto;
import com.proyectoinventario.inventario.caseuse.producto.UpdateProducto;
import com.proyectoinventario.inventario.entity.Producto;
import com.proyectoinventario.inventario.repository.ProductoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/producto")
public class ProductoRestController {

    private CreateProducto createProducto;
    private UpdateProducto updateProducto;
    private DeleteProducto deleteProducto;
    private ProductoRepository productoRepository;

    public ProductoRestController(CreateProducto createProducto, UpdateProducto updateProducto, DeleteProducto deleteProducto, ProductoRepository productoRepository) {
        this.createProducto = createProducto;
        this.updateProducto = updateProducto;
        this.deleteProducto = deleteProducto;
        this.productoRepository = productoRepository;
    }

    @PostMapping("/")
    ResponseEntity<Producto> newProducto(@RequestBody Producto newProducto) {
        return new ResponseEntity<>(createProducto.save(newProducto), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    ResponseEntity<Producto> replaceProducto(@RequestBody Producto newProducto, @PathVariable Long id) {
        return new ResponseEntity<>(updateProducto.update(newProducto, id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    ResponseEntity deleteProducto(@PathVariable Long id) {
        deleteProducto.remove(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

}
