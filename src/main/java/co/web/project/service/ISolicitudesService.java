package co.web.project.service;

import java.util.List;

import co.web.project.entity.Solicitudes;

public interface ISolicitudesService {
	public List <Solicitudes> getAllList();
    public Solicitudes getById(long id);
    Solicitudes add(Solicitudes u);
    Solicitudes edit(Solicitudes s);
}
