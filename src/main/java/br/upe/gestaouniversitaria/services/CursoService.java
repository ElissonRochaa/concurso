package br.upe.gestaouniversitaria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.upe.gestaouniversitaria.entities.Curso;
import br.upe.gestaouniversitaria.repositories.CursoRepository;

@Service
public class CursoService {

	@Autowired
	private CursoRepository repository;
	
	public List<Curso> buscarTodos(){
		return repository.findAll();
	}
	
	public Curso buscarPorId(Long id){
		return repository.findById(id).get();
	}
	
	public List<Curso> buscarPorNome(String nome) {
		return repository.findByName(nome);
	}
	
	public Curso salvar(Curso curso) {
		return repository.save(curso);
	}
	
	public void deletarPorId(Long id) {
		repository.deleteById(id);
	}
	
	public Curso atualizarPorId(Long id, Curso curso) {
		curso.setId(id);
		return repository.save(curso);
	}
}
