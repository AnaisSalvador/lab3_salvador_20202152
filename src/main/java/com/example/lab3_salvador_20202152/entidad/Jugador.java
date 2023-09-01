package com.example.lab3_salvador_20202152.entidad;
import lombok.Getter;
import lombok.Setter;

import java.util.Random;
import java.util.UUID;

@Getter
@Setter
public class Jugador {

    private int id = new Random().nextInt();
    private String nombre;
    private Integer edad;
    private String posicion;
    private String club;

    public Jugador(){
    }

    public Jugador(String nombre, Integer edad, String posicion, String club){
        this.nombre = nombre;
        this.posicion = posicion;
        this.club = club;
        this.edad = edad;
    }

}
