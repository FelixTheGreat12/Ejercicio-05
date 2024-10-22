package com.upiiz.trabajadores.repository;


import com.upiiz.trabajadores.models.Preguntas;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class PreguntasRep {
    private List<Preguntas> preguntas  = new ArrayList<>();
    private AtomicLong id = new AtomicLong();

    public List<Preguntas> getPreguntas() {
        return preguntas;
    }

    public Preguntas guardarPreguntas(Preguntas pregunta) {
        pregunta.setIdPregunta(id.incrementAndGet());
        preguntas.add(pregunta);
        return pregunta;
    }

    public Preguntas getPreguntaId(Long id) {
        return preguntas.stream().filter(e -> e.getIdPregunta().equals(id)).findFirst().orElse(null);
    }

    public void eliminarPregunta(Long id){
        preguntas.removeIf(e -> e.getIdPregunta().equals(id));
    }

    public Preguntas actualizarPregunta(Preguntas pregunta) {
        pregunta.setIdPregunta(id.incrementAndGet());
        preguntas.add(pregunta);
        return pregunta;
    }
}
