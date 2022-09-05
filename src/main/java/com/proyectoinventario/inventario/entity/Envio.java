package com.proyectoinventario.inventario.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Envio")
public class Envio {

    @ManyToMany(cascade = CascadeType.ALL)
    private Long producto_id;

    @ManyToMany(cascade = CascadeType.ALL)
    private Long envio_id;

    public Envio(Long id) {
        this.envio_id = id;
    }

    public Envio(Long producto_id, Long envio_id) {
        this.producto_id = producto_id;
        this.envio_id = envio_id;
    }

    public Long getProducto_id() {
        return producto_id;
    }

    public void setProducto_id(Long producto_id) {
        this.producto_id = producto_id;
    }

    public Long getEnvio_id() {
        return envio_id;
    }

    public void setEnvio_id(Long envio_id) {
        this.envio_id = envio_id;
    }

}
