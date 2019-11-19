package co.web.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.web.project.service.ISolicitudesService;
import co.web.project.repository.ISolicitudesRepository;
import co.web.project.entity.Solicitudes;

//Implementan todos los metodos del servicio
@Service
public class SolicitudesService implements ISolicitudesService {
	@Autowired
	private ISolicitudesRepository repositorio;
	
	@Override
	public List<Solicitudes> getAllList() {
		return repositorio.findAll();
	}
	
	@Override
	public Solicitudes add(Solicitudes s) {
		return repositorio.save(s);	
	}
	
	@Override
	public Solicitudes getById(long id) {
      return repositorio.findById(id).get();
	}
	
	@Override
	public Solicitudes edit(Solicitudes s) {
		return repositorio.save(s);
	}
}
