package com.proyectoinventario.inventario.controller;

import com.proyectoinventario.inventario.caseuse.producto.CreateProducto;
import com.proyectoinventario.inventario.caseuse.producto.DeleteProducto;
import com.proyectoinventario.inventario.caseuse.producto.GetProducto;
import com.proyectoinventario.inventario.caseuse.producto.UpdateProducto;
import com.proyectoinventario.inventario.entity.Producto;
import com.proyectoinventario.inventario.repository.ProductoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/producto")
public class ProductoRestController {

    private GetProducto getProducto;
    private CreateProducto createProducto;
    private UpdateProducto updateProducto;
    private DeleteProducto deleteProducto;
    private ProductoRepository productoRepository;

    public ProductoRestController(GetProducto getProducto, CreateProducto createProducto, UpdateProducto updateProducto, DeleteProducto deleteProducto, ProductoRepository productoRepository) {
        this.getProducto = getProducto;
        this.createProducto = createProducto;
        this.updateProducto = updateProducto;
        this.deleteProducto = deleteProducto;
        this.productoRepository = productoRepository;
    }

    @GetMapping
    List<Producto> get() {
        return getProducto.getAll();
    }

    @GetMapping("/{id}")
    Producto getProducto(@PathVariable Long id) {
        return getProducto.getOne(id);
    }

    @PostMapping
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
