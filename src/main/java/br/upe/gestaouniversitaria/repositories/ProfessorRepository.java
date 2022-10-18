package br.upe.gestaouniversitaria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.upe.gestaouniversitaria.entities.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long>{

}
