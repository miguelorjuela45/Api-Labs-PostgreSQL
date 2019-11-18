package co.web.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.web.project.service.IRespuestaService;
import co.web.project.repository.IRespuestaRepository;
import co.web.project.entity.Respuesta;

//Implementan todos los metodos del servicio
@Service
public class RespuestaService implements IRespuestaService {
	@Autowired
	private IRespuestaRepository repositorio;
	
	@Override
	public List<Respuesta> getAllList() {
		return repositorio.findAll();
	}
	
	@Override
	public Respuesta add(Respuesta r) {
		return repositorio.save(r);	
	}
	
	@Override
	public Respuesta getById(long id) {
      return repositorio.findById(id).get();
	}
}
