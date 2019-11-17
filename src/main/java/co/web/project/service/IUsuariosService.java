package co.web.project.service;

import java.util.List;

import co.web.project.entity.Usuarios;

public interface IUsuariosService {
	public List <Usuarios> getAllList();
    public Usuarios getById(long id);
    Usuarios add(Usuarios p);
}
