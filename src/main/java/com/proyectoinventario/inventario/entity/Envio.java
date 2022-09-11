package com.proyectoinventario.inventario.entity;

import javax.persistence.*;

@Entity
@Table(name = "Envio")
public class Envio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "tipo", length = 50, nullable = false)
    private String tipo;

    public Envio() {
    }

    public Envio(Long id) {
        this.id = id;
    }

    public Envio(Long id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }

    public Long getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
