package com.example.SpringBootNTT.entity;

public class Facturas {
    private Integer num;
    private String fecha;

    public Facturas() {
    }

    public Facturas(int num, String fecha) {
        this.num = num;
        this.fecha = fecha;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
