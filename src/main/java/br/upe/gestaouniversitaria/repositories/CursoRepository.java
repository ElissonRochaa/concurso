package br.upe.gestaouniversitaria.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.upe.gestaouniversitaria.entities.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {
	@Query("select c from Curso c where c.nome like %:nome%")
	public List<Curso> findByName(String nome);
}
