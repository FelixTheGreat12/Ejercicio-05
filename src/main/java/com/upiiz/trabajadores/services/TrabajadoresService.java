package com.upiiz.trabajadores.services;


import com.upiiz.trabajadores.models.Trabajadores;
import com.upiiz.trabajadores.repository.TrabajadoresResp;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrabajadoresService {
    TrabajadoresResp trabajadoresResp;


    public TrabajadoresService(TrabajadoresResp trabajadores, TrabajadoresResp trabajadoresResp) {
        this.trabajadoresResp = trabajadores;
    }

    public List<Trabajadores> getAllTrabajadores() {
        return trabajadoresResp.getTrabajadores();
    }

    public Trabajadores getByIdTrabajadores(Long id) {
        return trabajadoresResp.getTrabajadoresId(id);
    }

    public Trabajadores save(Trabajadores trabajadores) {
        return trabajadoresResp.save(trabajadores);
    }

    public Trabajadores updateTrabajadores(Trabajadores trabajadores) {
        return trabajadoresResp.actualizar(trabajadores);
    }

    public void deleteTrabajadores(Long id) {
        trabajadoresResp.eliminar(id);
    }

}
