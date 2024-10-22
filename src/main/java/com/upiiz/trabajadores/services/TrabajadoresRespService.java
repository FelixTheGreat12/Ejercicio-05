package com.upiiz.trabajadores.services;

import com.upiiz.trabajadores.models.TrabajadoresRespuesta;
import com.upiiz.trabajadores.repository.TrabajadoresRespRespository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrabajadoresRespService {
    TrabajadoresRespRespository trabajadoresR;

    public TrabajadoresRespService(TrabajadoresRespRespository trabajadoresR) {
        this.trabajadoresR = trabajadoresR;
    }

    public List<TrabajadoresRespuesta> getAllTrabajadoresRespuesta() {
        return trabajadoresR.getTrabajadoresResp();
    }

    public TrabajadoresRespuesta getTrabajadoresRespuestaById(Long id) {
        return trabajadoresR.getTrabajadoresRespById(id);
    }

    public TrabajadoresRespuesta saveTrabajo(TrabajadoresRespuesta trabajadoresRespuesta) {
        return trabajadoresR.guardar(trabajadoresRespuesta);
    }

    public TrabajadoresRespuesta updateTrabajo(TrabajadoresRespuesta trabajadoresRespuesta) {
        return trabajadoresR.actualizar(trabajadoresRespuesta);
    }

    public void deleteTrabajo(Long id) {
        trabajadoresR.eliminar(id);
    }

}
