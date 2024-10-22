package com.upiiz.trabajadores.services;

import com.upiiz.trabajadores.models.Preguntas;
import com.upiiz.trabajadores.repository.PreguntasRep;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PreguntasService {
    PreguntasRep rep;

    public PreguntasService(PreguntasRep preguntasRep){
        this.rep = preguntasRep;
    }

    public List<Preguntas> getAllPreguntas(){
        return rep.getPreguntas();
    }

    public Preguntas getPalabraById(long id){
        return rep.getPreguntaId(id);
    }

    public Preguntas savePregunta(Preguntas pregunta){
        return rep.guardarPreguntas(pregunta);
    }

    public Preguntas updatePregunta(Preguntas pregunta){
        return rep.actualizarPregunta(pregunta);
    }

    public void deletePregunta(Long id){
        rep.eliminarPregunta(id);
    }


}
