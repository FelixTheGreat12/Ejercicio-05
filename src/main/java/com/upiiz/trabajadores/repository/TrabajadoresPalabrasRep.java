package com.upiiz.trabajadores.repository;


import com.upiiz.trabajadores.models.TrabajadoresPalabras;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class TrabajadoresPalabrasRep {
    private List<TrabajadoresPalabras> trabajadores = new ArrayList<>();
    private AtomicLong Palabraid = new AtomicLong();

    public List<TrabajadoresPalabras> getTrabajadores() {
        return trabajadores;
    }

    public TrabajadoresPalabras savePalabras(TrabajadoresPalabras palabras) {
        palabras.setId_palabras(Palabraid.incrementAndGet());
        trabajadores.add(palabras);
        return palabras;
    }

    public TrabajadoresPalabras getPalabrasId(long id) {
        return trabajadores.stream().filter(p -> p.getId_palabras() == id).findFirst().orElse(null);
    }

    public void eliminarPalabras(long id) {
        trabajadores.removeIf(p -> p.getId_palabras().equals(id));
    }

    public TrabajadoresPalabras updatePalabras(TrabajadoresPalabras palabras) {
        eliminarPalabras(palabras.getId_palabras());
        trabajadores.add(palabras);
        return palabras;
    }
}
