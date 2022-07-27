package com.idat.Aula.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.Aula.modelo.Aula;
import com.idat.Aula.repository.AulaRepository;

@Service
public class AulaServiceImpl implements AulaService{
	
	@Autowired
	private AulaRepository repository;

	@Override
	public void guardarAula(Aula aula) {
		// TODO Auto-generated method stub
		repository.save(aula);
	}

	@Override
	public void actualizarAula(Aula aula) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(aula);
	}

	@Override
	public void eliminarAula(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public List<Aula> listarAula() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Aula obtenerAulaId(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

}
