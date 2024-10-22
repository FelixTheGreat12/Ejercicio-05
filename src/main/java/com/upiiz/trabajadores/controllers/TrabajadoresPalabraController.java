package com.upiiz.trabajadores.controllers;

import com.upiiz.trabajadores.models.TrabajadoresPalabras;
import com.upiiz.trabajadores.services.TrabajadoresPalabrasService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/trabajadores_palabra")
public class TrabajadoresPalabraController {

    TrabajadoresPalabrasService trabajadoresPalabrasService;

    public TrabajadoresPalabraController(TrabajadoresPalabrasService service) {
        this.trabajadoresPalabrasService = service;
    }

    @GetMapping
    public ResponseEntity<List<TrabajadoresPalabras>> getAllPalabras() {
        return ResponseEntity.ok(trabajadoresPalabrasService.getAllPalabras());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TrabajadoresPalabras> getPalabrasById(@PathVariable Long id) {
        return ResponseEntity.ok(trabajadoresPalabrasService.getPalabrabyId(id));
    }

    @PostMapping
    public ResponseEntity<TrabajadoresPalabras> createPalabras(@RequestBody TrabajadoresPalabras palabras) {
        return ResponseEntity.ok(trabajadoresPalabrasService.savePalabra(palabras));
    }

    @PutMapping("/{id}")
    public ResponseEntity<TrabajadoresPalabras> updatePalabras(@RequestBody TrabajadoresPalabras palabras, @PathVariable Long id) {
        palabras.setId_palabras(id);
        return ResponseEntity.ok(trabajadoresPalabrasService.updatePalabra(palabras));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<TrabajadoresPalabras> deletePalabras(@PathVariable Long id) {
        trabajadoresPalabrasService.deletePalabras(id);
        return ResponseEntity.noContent().build();
    }
}
