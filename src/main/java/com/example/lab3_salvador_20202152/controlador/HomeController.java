package com.example.lab3_salvador_20202152.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    @ResponseBody
    public String inicio(){
        return "../resources/templates/inicio.html";
    }
    @RequestMapping(value = {"/inicio"})
    public String jugador(){
        return "../resources/templates/jugador/list.html";
    }

}
