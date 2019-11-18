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

import co.web.project.entity.Respuesta;
import co.web.project.service.IRespuestaService;

//Direcciona directamente al proyecto front
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping({ "/Respuesta" }) // Mapping principal del puerto 8080
public class RespuestaController {
	@Autowired
	IRespuestaService service;

	@GetMapping
	public List<Respuesta> getList() {
		return service.getAllList();
	}

	@GetMapping(path = "/{id}")
	public Respuesta getById(@PathVariable("id") long id) {
		return service.getById(id);
	}
	
	@PostMapping
	public Respuesta agregar(@RequestBody Respuesta r) {
		r.setidRespuesta(null);
		return service.add(r);
	}
	
}