package com.adri.model;

public class Curso {
    private int codigo;
    private String nombre;
    private int duracionCurso;
    private int precio;
    
    public Curso(int codigo, String nombre, int duracionCurso, int precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.duracionCurso = duracionCurso;
        this.precio = precio;
    }

    public Curso() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracionCurso() {
        return duracionCurso;
    }

    public void setDuracionCurso(int duracionCurso) {
        this.duracionCurso = duracionCurso;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    
    
}
