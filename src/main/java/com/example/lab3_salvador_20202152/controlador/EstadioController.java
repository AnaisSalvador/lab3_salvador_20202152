package com.example.lab3_salvador_20202152.controlador;

import com.example.lab3_salvador_20202152.repositorio.EstadioRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/estadio")
public class EstadioController {

    @GetMapping(value = {"","/list"})
    public String listar(@PatchMapping("id") String idEstadio, @PatchMapping("nombre") String nombre,
                         @PatchMapping("provincia") String provincia, @PatchMapping("club") String club){
        System.out.println("Nombre recibido" + nombre);
        System.out.println("Id recibido" + idEstadio);
        System.out.println("Provincia: " + provincia);
        System.out.println("Club: " + club);
        return "../resources/templates/estadio/list.html";
    }
    @GetMapping("/newForm")
    public String crear() {
        return "../resources/templates/estadio/newForm.html";
    }
}
