package com.idat.Aula.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.Aula.modelo.Aula;
import com.idat.Aula.service.AulaService;

@Controller
@RequestMapping("/aula")
public class AulaController {
	
	@Autowired
	private AulaService service;
	
	@RequestMapping("/listar")
	public @ResponseBody ResponseEntity<List<Aula>> listar(){
		return new ResponseEntity<List<Aula>>(service.listarAula(), HttpStatus.OK);
	}
	
	@RequestMapping(path = "/guardar", method = RequestMethod.POST)
	public ResponseEntity<Void> guardar(@RequestBody Aula aula){
		service.guardarAula(aula);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@RequestMapping(path = "/eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
		Aula a = service.obtenerAulaId(id);
		if (a != null) {
			service.eliminarAula(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	
	@RequestMapping(path = "/actualizar", method = RequestMethod.PUT)
	public ResponseEntity<Void> actualizar(@RequestBody Aula aula){
		Aula a = service.obtenerAulaId(aula.getIdAula());
		if (a != null) {
			service.actualizarAula(aula);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	
	@RequestMapping(path = "/listar/{id}", method = RequestMethod.GET)
	public ResponseEntity<Aula> obtenerId(@PathVariable Integer id) {
		Aula a = service.obtenerAulaId(id);
		if (a != null) {
			return new ResponseEntity<Aula>(service.obtenerAulaId(id),HttpStatus.OK);
		}
		return new ResponseEntity<Aula>(HttpStatus.NOT_FOUND);
	}
	
}
