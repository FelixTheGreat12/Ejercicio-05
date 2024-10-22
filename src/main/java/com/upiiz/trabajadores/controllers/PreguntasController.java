package com.upiiz.trabajadores.controllers;

import com.upiiz.trabajadores.models.Preguntas;
import com.upiiz.trabajadores.services.PreguntasService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/preguntas")
public class PreguntasController {
    PreguntasService preguntasService;

    public PreguntasController(PreguntasService preguntasService) {
        this.preguntasService = preguntasService;
    }

    @GetMapping
    public ResponseEntity<List<Preguntas>> getAllPreguntas(){
        return ResponseEntity.ok(preguntasService.getAllPreguntas());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Preguntas> getPregunta(@PathVariable Long id){
        return ResponseEntity.ok(preguntasService.getPalabraById(id));
    }

    @PostMapping
    public ResponseEntity<Preguntas> createPregunta(@RequestBody Preguntas preguntas){
        return ResponseEntity.ok(preguntasService.savePregunta(preguntas));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Preguntas> updatePregunta(@PathVariable Long id, @RequestBody Preguntas preguntas){
        preguntas.setIdPregunta(id);
        return ResponseEntity.ok(preguntasService.updatePregunta(preguntas));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Preguntas> deletePregunta(@PathVariable Long id){
        preguntasService.deletePregunta(id);
        return ResponseEntity.noContent().build();
    }

}
