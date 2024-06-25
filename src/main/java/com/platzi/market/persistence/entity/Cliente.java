package com.platzi.market.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "clientes")
public class Cliente {

    //Definición de variables(columnas)
    @Id
    @Column(name = "id")
    private int idCliente;

    private String nombre;


    private String apellidos;

    private Double celular;

    private String direccion;

    @Column(name = "correo_electronico")
    private String correoElectronico;

    //representa las relaciones entre las tablas (analizar la logica del negocio)
    @OneToMany(mappedBy = "cliente")
    private List<Compra> compras;

    //Getters y setters


    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Double getCelular() {
        return celular;
    }

    public void setCelular(Double celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
}
