package com.example.SpringBootNTT.controller;

import com.example.SpringBootNTT.service.Servicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlControler {
    @Autowired
    private Servicio servicio;

    @GetMapping("/clientes")
    public String clientes(Model model){
        model.addAttribute("clientes", servicio.getLista());
        return "clientes";
    }

    @GetMapping("/productos")
    public String productos(Model model){
        model.addAttribute("productos", servicio.getListaProductos());
        return "productos";
    }
}
