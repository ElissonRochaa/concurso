package br.upe.gestaouniversitaria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.upe.gestaouniversitaria.entities.Professor;
import br.upe.gestaouniversitaria.repositories.ProfessorRepository;


@Service
public class ProfessorService {

	@Autowired
	private ProfessorRepository repository;

	public List<Professor> buscarTodos(){
		return repository.findAll();
	}
	
	public Professor buscarPorId(Long id){
		return repository.findById(id).get();
	}
	
	public Professor salvar(Professor professor) {
		return repository.save(professor);
	}
	
	public void deletarPorId(Long id) {
		repository.deleteById(id);
	}
	
	public Professor atualizarPorId(Long id, Professor professor) {
		professor.setId(id);
		return repository.save(professor);
	}
	
}
