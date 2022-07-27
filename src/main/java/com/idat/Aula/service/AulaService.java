package com.idat.Aula.service;

import java.util.List;

import com.idat.Aula.modelo.Aula;

public interface AulaService {
	
	void guardarAula(Aula aula);
	void actualizarAula(Aula aula);
	void eliminarAula(Integer id);
	List<Aula> listarAula();
	Aula obtenerAulaId(Integer id);

}
