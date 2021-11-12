package com.example.SpringBootNTT.entity;

public class Productos {
    private Integer codigo;
    private String marca;
    private String modelo;
    private String descripcion;
    private double precio;

    public Productos() {
    }

    public Productos(Integer codigo, String marca, String modelo, String descripcion, double precio) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
