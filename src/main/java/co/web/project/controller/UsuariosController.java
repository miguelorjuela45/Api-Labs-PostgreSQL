package co.web.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.web.project.entity.Usuarios;
import co.web.project.service.IUsuariosService;

//Direcciona directamente al proyecto front
//@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@CrossOrigin(origins = "http://localhost:8080", maxAge = 3600)
@RestController
@RequestMapping({ "/Usuarios" }) // Mapping principal del puerto 8080
public class UsuariosController {
	@Autowired
	IUsuariosService service;

	@GetMapping
	public List<Usuarios> getList() {
		return service.getAllList();
	}

	@GetMapping(path = "/{id}")
	public Usuarios getById(@PathVariable("id") long id) {
		return service.getById(id);
	}

	@PostMapping
	public Usuarios agregar(@RequestBody Usuarios u) {
		u.setIdUsuario(null);
		return service.add(u);
	}
}