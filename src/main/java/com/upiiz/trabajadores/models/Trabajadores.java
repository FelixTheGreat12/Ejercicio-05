package com.upiiz.trabajadores.models;

public class Trabajadores {
    private Long id_trabajador;
    private String nombre;
    private Long id_ocupacion;
    private String tiempo_ocupacion;

    public Trabajadores() {}

    public Trabajadores(Long id_trabajador, String nombre, Long id_ocupacion, String tiempo_ocupacion) {
        this.id_trabajador = id_trabajador;
        this.nombre = nombre;
        this.id_ocupacion = id_ocupacion;
        this.tiempo_ocupacion = tiempo_ocupacion;
    }

    public Long getId_trabajador() {
        return id_trabajador;
    }
    public void setId_trabajador(Long id_trabajador) {
        this.id_trabajador = id_trabajador;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Long getId_ocupacion() {
        return id_ocupacion;
    }
    public void setId_ocupacion(Long id_ocupacion) {
        this.id_ocupacion = id_ocupacion;
    }
    public String getTiempo_ocupacion() {
        return tiempo_ocupacion;
    }
    public void setTiempo_ocupacion(String tiempo_ocupacion) {
        this.tiempo_ocupacion = tiempo_ocupacion;
    }

}
