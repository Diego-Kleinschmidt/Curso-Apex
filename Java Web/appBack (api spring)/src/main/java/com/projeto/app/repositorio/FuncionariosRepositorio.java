package com.projeto.app.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.app.modelo.FuncionariosModelo;

public interface FuncionariosRepositorio extends JpaRepository<FuncionariosModelo, Integer>{

}
