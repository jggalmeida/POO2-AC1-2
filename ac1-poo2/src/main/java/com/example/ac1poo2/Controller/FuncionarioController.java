package com.example.ac1poo2.Controller;

import com.example.ac1poo2.Service.FuncionarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FuncionarioController {

    @Autowired
    private FuncionarioService service;

    @GetMapping("/funcionarios")
    public ModelAndView getFuncionarios(){

        ModelAndView mv = new ModelAndView("funcionarios");
        mv.addObject("funcionarios", service.getFuncionarios());

        return mv;
    }

}