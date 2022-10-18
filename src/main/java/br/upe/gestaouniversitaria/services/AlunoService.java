package br.upe.gestaouniversitaria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.upe.gestaouniversitaria.entities.Aluno;
import br.upe.gestaouniversitaria.repositories.AlunoRepository;


@Service
public class AlunoService {

	@Autowired
	private AlunoRepository repository;

	public List<Aluno> buscarTodos(){
		return repository.findAll();
	}
	
	public Aluno buscarPorId(Long id){
		return repository.findById(id).get();
	}
	
	public Aluno salvar(Aluno aluno) {
		return repository.save(aluno);
	}
	
	public void deletarPorId(Long id) {
		repository.deleteById(id);
	}
	
	public Aluno atualizarPorId(Long id, Aluno aluno) {
		aluno.setId(id);
		return repository.save(aluno);
	}
	
}
