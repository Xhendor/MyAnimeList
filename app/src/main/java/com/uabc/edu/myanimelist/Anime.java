package com.uabc.edu.myanimelist;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
public class Anime {

    private int imagen;
    private String nombre;
    private int visitas;

    public Anime(int imagen, String nombre, int visitas) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.visitas = visitas;
    }
}
