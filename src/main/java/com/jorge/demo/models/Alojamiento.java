package com.jorge.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "alojamientos")
public class Alojamiento extends Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 2, max = 30)
    private String titulo;

    @Size(min = 2, max = 80)
    private String descripcion;

    @Size(min = 2, max = 30)
    private String direccion;
}
 