package com.proyectoinventario.inventario.entity;

import javax.persistence.*;

@Entity
@Table(name = "Producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;

    @Column(name = "cantidad", nullable = false)
    private int cantidad;

    @Column(name = "cantidad_minima", nullable = false)
    private int cantidadMinima;

    @Column(name = "precio", nullable = false)
    private double precio;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Categoria categoria;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Fabricante fabricante;

    public Producto(Long id) {
        this.id = id;
    }

    public Producto(Long id, String nombre, int cantidad, int cantidadMinima, double precio, Categoria categoria, Fabricante fabricante) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.cantidadMinima = cantidadMinima;
        this.precio = precio;
        this.categoria = categoria;
        this.fabricante = fabricante;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidadMinima() {
        return cantidadMinima;
    }

    public void setCantidadMinima(int cantidadMinima) {
        this.cantidadMinima = cantidadMinima;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

}
