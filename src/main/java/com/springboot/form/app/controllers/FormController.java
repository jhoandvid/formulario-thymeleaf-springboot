package com.springboot.form.app.controllers;

import com.springboot.form.app.models.domain.Usuario;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

    @GetMapping("/form")
    public String form(Model model){
        model.addAttribute("titulo","Formulario Usuairo");
        return "form";
    }

    @PostMapping("/form")
    public String procesar(Usuario usuario, Model model){
        model.addAttribute("titulo", "Resultado Form");
        model.addAttribute("usuario", usuario);
        return "resultado";
    }
}
