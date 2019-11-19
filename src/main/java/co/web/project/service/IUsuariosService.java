package co.web.project.service;

import java.util.List;

import co.web.project.entity.Usuarios;

public interface IUsuariosService {
	public List <Usuarios> getAllList();
    public Usuarios getById(Integer id);
    Usuarios add(Usuarios u);
}
