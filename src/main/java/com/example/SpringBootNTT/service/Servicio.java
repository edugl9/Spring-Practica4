package com.example.SpringBootNTT.service;

import com.example.SpringBootNTT.entity.Clientes;
import com.example.SpringBootNTT.entity.Productos;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Servicio {
    private List<Clientes> clientes = new ArrayList<>(List.of(
            new Clientes(1, "Eduardo Garcia", "eduardo@mail.com")));

    private List<Productos> productos = new ArrayList<>(List.of(
            new Productos(11, "Lg", "SmartTV","Tv 32 ",2500),
            new Productos(22, "Dell", "123","Laptop",7000)));

    public void addCliente(Clientes clientes){
        this.clientes.add(clientes);
    }

    public void addProducto(Productos productos){
        this.productos.add(productos);
    }

    public Clientes getCliente(String cliente){
        for (Clientes c: clientes) {
            if(cliente.equals(c.getName())){
                return c;
            }
        }
        return new Clientes("Cliente no encontrado");
    }

    public List<Clientes> getLista() {
        return clientes;
    }
    public List<Productos> getListaProductos() {
        return productos;
    }
}
