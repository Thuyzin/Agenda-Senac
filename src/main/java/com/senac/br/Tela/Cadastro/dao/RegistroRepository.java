package com.senac.br.Tela.Cadastro.dao;

import com.senac.br.Tela.Cadastro.model.Registro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistroRepository extends JpaRepository<Registro, Integer> {
}
