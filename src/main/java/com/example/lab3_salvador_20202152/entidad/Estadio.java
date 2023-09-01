package com.example.lab3_salvador_20202152.entidad;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

@Entity
@Table(name = "estadio")
@Getter
@Setter
public class Estadio {
    //id estadio - string nombre - string provincia - string club

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEstadio;

    @Column(name = "nombre",nullable = false,length = 40)
    private String nombre;
    @Column(name = "provincia",nullable = false,length = 40)
    private String provincia;
    private String club;


}
