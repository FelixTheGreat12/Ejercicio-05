package com.upiiz.trabajadores.controllers;

import com.upiiz.trabajadores.models.TrabajadoresRespuesta;
import com.upiiz.trabajadores.services.TrabajadoresRespService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/trabajadores_respuesta")
public class TrabajadoresRespControllers {

    TrabajadoresRespService trabajadoresRespService;

    public TrabajadoresRespControllers(TrabajadoresRespService trabajadoresRespService) {
        this.trabajadoresRespService = trabajadoresRespService;
    }

    @GetMapping
    public ResponseEntity<List<TrabajadoresRespuesta>> getAllTrabajadoresRespuesta() {
        return ResponseEntity.ok(trabajadoresRespService.getAllTrabajadoresRespuesta());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TrabajadoresRespuesta> getTrabajadoresRespuestaById(@PathVariable Long id){
        return ResponseEntity.ok(trabajadoresRespService.getTrabajadoresRespuestaById(id));
    }

    @PostMapping
    public ResponseEntity<TrabajadoresRespuesta> createTrabajoResp(@RequestBody TrabajadoresRespuesta trabajadoresRespuesta) {
        return ResponseEntity.ok(trabajadoresRespService.saveTrabajo(trabajadoresRespuesta));
    }

    @PutMapping("/{id}")
    public ResponseEntity<TrabajadoresRespuesta> updateTrabajoResp(@RequestBody TrabajadoresRespuesta trabajadoresRespuesta, @PathVariable Long id ){
        trabajadoresRespuesta.setId(id);
        return ResponseEntity.ok(trabajadoresRespService.saveTrabajo(trabajadoresRespuesta));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTrabajoResp(@PathVariable Long id){
        trabajadoresRespService.deleteTrabajo(id);
        return ResponseEntity.noContent().build();
    }
}
