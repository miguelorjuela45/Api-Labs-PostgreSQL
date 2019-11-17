package co.web.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.web.project.service.IUsuariosService;
import co.web.project.repository.IUsuariosRepository;
import co.web.project.entity.Usuarios;

//Implementan todos los metodos del servicio
@Service
public class UsuariosService implements IUsuariosService {
	@Autowired
	private IUsuariosRepository repositorio;
	
	@Override
	public List<Usuarios> getAllList() {
		return repositorio.findAll();
	}
	
	@Override
	public Usuarios add(Usuarios p) {
		return repositorio.save(p);	
	}
	
	@Override
	public Usuarios getById(long id) {
      return repositorio.findById(id).get();
	}
}
