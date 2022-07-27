package com.idat.Aula.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.Aula.modelo.Aula;


@Repository
public interface AulaRepository extends JpaRepository<Aula, Integer>{

}
