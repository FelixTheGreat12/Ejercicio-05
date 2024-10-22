package com.upiiz.trabajadores.services;

import com.upiiz.trabajadores.models.StopWords;
import com.upiiz.trabajadores.repository.StopWordRep;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StopWordServices {
    StopWordRep stopWordRep;

    public StopWordServices(StopWordRep stopWordRep) {
        this.stopWordRep = stopWordRep;
    }

    public List<StopWords> getAllStopWords() {
        return stopWordRep.getStopWords();
    }

    public StopWords getStopWordById(Long id) {
        return stopWordRep.getStopWordsById(id);
    }

    public StopWords saveStopWord(StopWords stopWord) {
        return stopWordRep.guardarStopWords(stopWord);
    }

    public StopWords updateStopWord(StopWords stopWord) {
        return stopWordRep.actualizarStopWords(stopWord);
    }

    public void deleteStopWord(Long id) {
        stopWordRep.eliminarStopWords(id);
    }
}
