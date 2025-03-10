package com.teste.primeiro_teste.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class teste_controller {

    @GetMapping("/")
    public ModelAndView nada() {
        ModelAndView modelo = new ModelAndView("index.html");
        return modelo;
    }
    

    @GetMapping("/string")
    public String texto() {
        return "retorno de texto";
    }

    @GetMapping("/parametro")
    public String parametro() {
        return "retorno de texto";
    }
    
    
}
