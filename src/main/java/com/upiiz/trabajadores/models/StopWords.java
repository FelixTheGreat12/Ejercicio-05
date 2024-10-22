package com.upiiz.trabajadores.models;

public class StopWords {
    private Long id_stop;
    private String tiempo;
    private String comparar;

    public StopWords(){}

    public StopWords(Long id_stop, String tiempo, String comparar) {
        this.id_stop = id_stop;
        this.tiempo = tiempo;
        this.comparar = comparar;
    }

    public Long getId_stop() { return id_stop; }
    public void setId_stop(Long id_stop) { this.id_stop = id_stop; }
    public String getTiempo() { return tiempo; }
    public void setTiempo(String tiempo) { this.tiempo = tiempo; }
    public String getComparar() { return comparar; }
    public void setComparar(String comparar) { this.comparar = comparar; }
}
