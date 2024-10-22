package com.upiiz.trabajadores.models;

public class TrabajadoresRespuesta {
    private Long id;
    private String respuesta;
    private int pregunta_id;
    private int trabajador_id;

    public TrabajadoresRespuesta(){}

    public TrabajadoresRespuesta(Long id, String respuesta, int pregunta_id, int trabajador_id) {
        this.id = id;
        this.respuesta = respuesta;
        this.pregunta_id = pregunta_id;
        this.trabajador_id = trabajador_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public int getPregunta_id() {
        return pregunta_id;
    }

    public void setPregunta_id(int pregunta_id) {
        this.pregunta_id = pregunta_id;
    }

    public int getTrabajador_id() {
        return trabajador_id;
    }

    public void setTrabajador_id(int trabajador_id) {
        this.trabajador_id = trabajador_id;
    }
}
