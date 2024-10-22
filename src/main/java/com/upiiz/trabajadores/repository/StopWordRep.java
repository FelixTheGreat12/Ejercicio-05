package com.upiiz.trabajadores.repository;

import com.upiiz.trabajadores.models.StopWords;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class StopWordRep {
    private List<StopWords> stopWords = new ArrayList<>();
    private AtomicLong id = new AtomicLong();

    public List<StopWords> getStopWords() {
        return stopWords;
    }

    public StopWords guardarStopWords(StopWords stopWords) {
        stopWords.setId_stop(id.getAndIncrement());
        this.stopWords.add(stopWords);
        return stopWords;
    }

    public StopWords getStopWordsById(long id) {
        return stopWords.stream().filter(stopWord -> stopWord.getId_stop() == id).findFirst().orElse(null);
    }

    public void eliminarStopWords(Long id) {
        stopWords.removeIf(stopWord -> stopWord.getId_stop() == id);
    }

    public StopWords actualizarStopWords(StopWords stopWords) {
        stopWords.setId_stop(id.getAndIncrement());
        this.stopWords.add(stopWords);
        return stopWords;
    }
}
