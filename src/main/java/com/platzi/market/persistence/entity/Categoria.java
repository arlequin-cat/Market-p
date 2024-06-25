package com.platzi.market.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "categorias")
public class Categoria {

    //Definición de variables(columnas)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Integer idCategoria;

    private String descripcion;

    private boolean estado;

    //representa las relaciones entre las tablas (analizar la logica del negocio)
    @OneToMany(mappedBy = "categoria")
    private List<Producto> productos;

    //Getters y setters

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
