package co.web.project.service;

import java.util.List;

import co.web.project.entity.Respuesta;

public interface IRespuestaService {
	public List <Respuesta> getAllList();
    public Respuesta getById(long id);
    Respuesta add(Respuesta r);
}
