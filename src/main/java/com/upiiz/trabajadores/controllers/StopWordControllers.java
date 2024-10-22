package com.upiiz.trabajadores.controllers;

import com.upiiz.trabajadores.models.StopWords;
import com.upiiz.trabajadores.services.StopWordServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/stop_words")
public class StopWordControllers {
    StopWordServices stopWordServices;

    public StopWordControllers(StopWordServices stopWordServices) {
        this.stopWordServices = stopWordServices;
    }

    @GetMapping
    public ResponseEntity<List<StopWords>> getAllStopWords() {
        return ResponseEntity.ok(stopWordServices.getAllStopWords());
    }

    @GetMapping("/{id}")
    public ResponseEntity<StopWords> getStopWordById(@PathVariable Long id) {
        return ResponseEntity.ok(stopWordServices.getStopWordById(id));
    }

    @PostMapping
    public ResponseEntity<StopWords> addStopWord(@RequestBody StopWords stopWords) {
        return ResponseEntity.ok(stopWordServices.saveStopWord(stopWords));
    }

    @PutMapping("/{id}")
    public ResponseEntity<StopWords> updateStopWord(@PathVariable Long id, @RequestBody StopWords stopWords) {
        stopWords.setId_stop(id);
        return ResponseEntity.ok(stopWordServices.updateStopWord(stopWords));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStopWord(@PathVariable Long id) {
        stopWordServices.deleteStopWord(id);
        return ResponseEntity.noContent().build();
    }
}
