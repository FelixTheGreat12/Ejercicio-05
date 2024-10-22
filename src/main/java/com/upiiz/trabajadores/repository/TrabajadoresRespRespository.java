package com.upiiz.trabajadores.repository;

import com.upiiz.trabajadores.models.TrabajadoresRespuesta;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class TrabajadoresRespRespository {
    private List<TrabajadoresRespuesta> trabajadoresResp = new ArrayList<>();
    private AtomicLong id_trabajador = new AtomicLong();

    public TrabajadoresRespuesta guardar(TrabajadoresRespuesta trabajadoresRespuesta) {
        trabajadoresRespuesta.setId(id_trabajador.incrementAndGet());
        trabajadoresResp.add(trabajadoresRespuesta);
        return trabajadoresRespuesta;
    }

    public List<TrabajadoresRespuesta> getTrabajadoresResp() {
        return trabajadoresResp;
    }

    public TrabajadoresRespuesta getTrabajadoresRespById(Long id) {
        return trabajadoresResp.stream().filter(notification -> notification.getId() == id).findFirst().orElse(null);
    }


    public TrabajadoresRespuesta actualizar(TrabajadoresRespuesta trabajadoresRespuesta) {
        trabajadoresRespuesta.setId(id_trabajador.incrementAndGet());
        trabajadoresResp.add(trabajadoresRespuesta);
        return trabajadoresRespuesta;
    }

    public void eliminar(Long id) {
        trabajadoresResp.removeIf(notification -> notification.getId().equals(id));
    }

}
