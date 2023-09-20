package com.br.piolaschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.br.piolaschool.entidade.administrador.Administrador;

@Component
public interface IAdministrador extends JpaRepository<Administrador, Long> {
    
    Administrador getById(Long matricula);
}
