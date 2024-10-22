package com.upiiz.trabajadores.models;

public class Preguntas {
    private Long idPregunta;
    private String Pregunta;
    private Long tipo_id;

    public Preguntas(){}

    public Preguntas(Long idPregunta, String Pregunta, Long tipo_id) {
        this.idPregunta = idPregunta;
        this.Pregunta = Pregunta;
        this.tipo_id = tipo_id;
    }

    public Long getIdPregunta() { return idPregunta; }
    public String getPregunta() { return Pregunta; }
    public Long getTipo_id() { return tipo_id; }
    public void setIdPregunta(Long idPregunta) { this.idPregunta = idPregunta; }
    public void setPregunta(String Pregunta) { this.Pregunta = Pregunta; }
    public void setTipo_id(Long tipo_id) { this.tipo_id = tipo_id; }
}
