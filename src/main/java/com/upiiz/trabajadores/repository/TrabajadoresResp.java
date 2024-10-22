package com.upiiz.trabajadores.repository;

import com.upiiz.trabajadores.models.Trabajadores;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class TrabajadoresResp {
    private List<Trabajadores> trabajadores_1 = new ArrayList<>();
    private AtomicLong TrabajadorId = new AtomicLong();


    public List<Trabajadores> getTrabajadores() {
        return trabajadores_1;
    }

    public Trabajadores save(Trabajadores trabajador) {
        trabajador.setId_trabajador(TrabajadorId.incrementAndGet());
        trabajadores_1.add(trabajador);
        return trabajador;
    }

    public Trabajadores getTrabajadoresId(long id){
        return trabajadores_1.stream().filter(trabajadores1 -> trabajadores1.getId_trabajador() == id).findFirst().orElse(null);
    }

    public void eliminar(Long id){
        trabajadores_1.removeIf(trabajador -> trabajador.getId_trabajador().equals(id));
    }

    public Trabajadores actualizar(Trabajadores trabajador) {
        eliminar(trabajador.getId_trabajador());
        trabajadores_1.add(trabajador);
        return trabajador;
    }
}
