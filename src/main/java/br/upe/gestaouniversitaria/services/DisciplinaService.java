package br.upe.gestaouniversitaria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.upe.gestaouniversitaria.entities.Disciplina;
import br.upe.gestaouniversitaria.repositories.DisciplinaRepository;

@Service
public class DisciplinaService {
	
	@Autowired
	private DisciplinaRepository repository;

	public List<Disciplina> buscarTodos(){
		return repository.findAll();
	}
	
	public Disciplina buscarPorId(Long id){
		return repository.findById(id).get();
	}
	
	public Disciplina salvar(Disciplina disciplina) {
		return repository.save(disciplina);
	}
	
	public void deletarPorId(Long id) {
		repository.deleteById(id);
	}
	
	public Disciplina atualizarPorId(Long id, Disciplina disciplina) {
		disciplina.setId(id);
		return repository.save(disciplina);
	}
	
}
