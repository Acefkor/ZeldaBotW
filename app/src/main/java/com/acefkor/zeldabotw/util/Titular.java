package com.acefkor.zeldabotw.util;

/**
 * Created by cedal on 31/07/2017.
 */

public class Titular {

    private String titulo;
    private String subTitulo;
    private Integer img;

    public Titular(String titulo, Integer img, String subTitulo) {
        this.titulo = titulo;
        this.img = img;
        this.subTitulo = subTitulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getSubTitulo(){
        return subTitulo;
    }

    public Integer getImg() {
        return img;
    }
}
