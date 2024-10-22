package com.upiiz.trabajadores.services;

import com.upiiz.trabajadores.models.TrabajadoresPalabras;
import com.upiiz.trabajadores.repository.TrabajadoresPalabrasRep;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrabajadoresPalabrasService {
    TrabajadoresPalabrasRep rep;

    public TrabajadoresPalabrasService(TrabajadoresPalabrasRep Palabrarepo) {
        this.rep = Palabrarepo;
    }

    public List<TrabajadoresPalabras> getAllPalabras() {
        return rep.getTrabajadores();
    }

    public TrabajadoresPalabras getPalabrabyId(Long id) {
        return rep.getPalabrasId(id);
    }

    public TrabajadoresPalabras savePalabra(TrabajadoresPalabras Palabras) {
        return rep.savePalabras(Palabras);
    }

    public TrabajadoresPalabras updatePalabra(TrabajadoresPalabras Palabras) {
        return rep.updatePalabras(Palabras);
    }

    public void deletePalabras(Long id) {
        rep.eliminarPalabras(id);
    }

}
