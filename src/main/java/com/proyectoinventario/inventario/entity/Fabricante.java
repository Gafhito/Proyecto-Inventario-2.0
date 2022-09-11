package com.proyectoinventario.inventario.entity;

import javax.persistence.*;

@Entity
@Table(name = "Fabricante")
public class Fabricante {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;

    public Fabricante() {
    }

    public Fabricante(Long id) {
        this.id = id;
    }

    public Fabricante(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
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
}
