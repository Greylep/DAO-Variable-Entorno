package org.example;

import jdk.jfr.DataAmount;
import lombok.Data;

@Data
public class VideoJuegos {
    private Integer id;
    private String nombre;
    private String desarrollador;
    private Integer año;
    private String genero;
    private String plataforma;
}
