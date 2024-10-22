package com.upiiz.trabajadores.models;

public class TrabajadoresPalabras {
    private Long id_palabras;
    private Long trabajador_respuesta_id;
    private Long Palabra_clave_id;

    public TrabajadoresPalabras() {}

    public TrabajadoresPalabras(Long id_palabras, Long trabajador_respuesta_id, Long Palabra_clave_id) {
        this.id_palabras = id_palabras;
        this.trabajador_respuesta_id = trabajador_respuesta_id;
        this.Palabra_clave_id = Palabra_clave_id;
    }

    public Long getId_palabras() { return id_palabras; }
    public void setId_palabras(Long id_palabras) { this.id_palabras = id_palabras; }
    public Long getTrabajador_respuesta_id() { return trabajador_respuesta_id; }
    public void setTrabajador_respuesta_id(Long trabajadorRespuestaId) { this.trabajador_respuesta_id = trabajador_respuesta_id; }
    public Long getPalabra_clave_id() { return Palabra_clave_id; }
    public void setPalabra_clave_id(Long Palabra_clave_id) { this.Palabra_clave_id = Palabra_clave_id; }
}
