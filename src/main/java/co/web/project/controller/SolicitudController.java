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

import co.web.project.entity.Solicitudes;
import co.web.project.service.ISolicitudesService;

//Direcciona directamente al proyecto front
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping({ "/Solicitudes" }) // Mapping principal del puerto 8080
public class SolicitudController {
	@Autowired
	ISolicitudesService service;

	@GetMapping
	public List<Solicitudes> getList() {
		return service.getAllList();
	}

	@GetMapping(path = "/{id}")
	public Solicitudes getById(@PathVariable("id") Integer id) {
		return service.getById(id);
	}

	@PostMapping
	public Solicitudes agregar(@RequestBody Solicitudes s) {
		s.setIdSolicitud(null);
		return service.add(s);
	}
	
	@PutMapping(path = { "/{id}" })
	public Solicitudes editar(@RequestBody Solicitudes s, @PathVariable("id") Integer id) {
		s.setIdSolicitud(id);;
		return service.edit(s);
	}
}