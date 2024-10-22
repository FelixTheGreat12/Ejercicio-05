package com.upiiz.trabajadores.controllers;


import com.upiiz.trabajadores.models.Trabajadores;
import com.upiiz.trabajadores.services.TrabajadoresService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/trabajadores")
public class TrabajadoresControllers {
    TrabajadoresService trabajadoresService;

    public TrabajadoresControllers(TrabajadoresService trabajadoresService) {
        this.trabajadoresService = trabajadoresService;
    }

    @GetMapping
    public ResponseEntity<List<Trabajadores>> getAllTrabajadores() {
        return ResponseEntity.ok(trabajadoresService.getAllTrabajadores());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Trabajadores> getTrabajadorById(@PathVariable Long id) {
        return ResponseEntity.ok(trabajadoresService.getByIdTrabajadores(id));
    }

    @PostMapping
    public ResponseEntity<Trabajadores> addTrabajador(@RequestBody Trabajadores trabajadores) {
        return ResponseEntity.ok(trabajadoresService.save(trabajadores));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Trabajadores> updateTrabajador(@RequestBody Trabajadores trabajadores, @PathVariable Long id) {
        trabajadores.setId_trabajador(id);
        return ResponseEntity.ok(trabajadoresService.updateTrabajadores(trabajadores));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTrabajador(@PathVariable Long id) {
        trabajadoresService.deleteTrabajadores(id);
        return ResponseEntity.noContent().build();
    }

}
