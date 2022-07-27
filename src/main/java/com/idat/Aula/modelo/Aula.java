package com.idat.Aula.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "aula")
public class Aula {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer idAula;
	private String nombreaula;
	
	/**
	 * @return the idAula
	 */
	public Integer getIdAula() {
		return idAula;
	}
	/**
	 * @param idAula the idAula to set
	 */
	public void setIdAula(Integer idAula) {
		this.idAula = idAula;
	}
	/**
	 * @return the nombreaula
	 */
	public String getNombreaula() {
		return nombreaula;
	}
	/**
	 * @param nombreaula the nombreaula to set
	 */
	public void setNombreaula(String nombreaula) {
		this.nombreaula = nombreaula;
	}
	
	

}
