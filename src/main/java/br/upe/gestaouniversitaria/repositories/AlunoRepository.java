package br.upe.gestaouniversitaria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.upe.gestaouniversitaria.entities.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
