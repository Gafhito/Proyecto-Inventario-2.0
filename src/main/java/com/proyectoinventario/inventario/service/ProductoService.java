package com.proyectoinventario.inventario.service;

import com.proyectoinventario.inventario.entity.Producto;
import com.proyectoinventario.inventario.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    private ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public List<Producto> getAllProductos() {
        return productoRepository.findAll();
    }

    public Producto save(Producto newProducto) {
        return productoRepository.save(newProducto);
    }

    public Producto update(Producto newProducto, Long id) {
        return productoRepository.findById(id).map(
                producto -> {
                    producto.setNombre(newProducto.getNombre());
                    producto.setCantidad(newProducto.getCantidad());
                    producto.setPrecio(newProducto.getPrecio());
                    return productoRepository.save(producto);
                }
        ).get();
    }

    public void delete(Long id) {
        productoRepository.delete(new Producto(id));
    }

}
