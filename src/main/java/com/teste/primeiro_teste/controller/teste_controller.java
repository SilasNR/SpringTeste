package com.teste.primeiro_teste.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.teste.primeiro_teste.domain.usuario;
import com.teste.primeiro_teste.service.teste_service;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;




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
    public String parametro(@RequestParam(value = "param") String param) {
        return param;
    }

    @Autowired
    private teste_service texto_service;

    @GetMapping("/service")
    public String textoService() {
        return texto_service.texto();
    }
    
    @PostMapping("/usuario{id}")
    public String nome(@PathVariable("id") String id, @RequestBody usuario user, @RequestParam(value = "p") String param) {
        
        return "id : "+ id + "\nboa noite : " + user.getNome() + "\nemail : " + user.getEmail() + "\nparametro : " + param;
    }
    
    
}
