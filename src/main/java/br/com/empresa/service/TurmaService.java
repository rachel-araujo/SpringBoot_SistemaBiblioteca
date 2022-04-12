package br.com.empresa.service;


import java.util.List;
import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.empresa.repository.TurmaRepository;
import br.com.empresa.entity.Turma;

@Service
public class TurmaService {

	@Autowired
	TurmaRepository repo;
	//criar metodo de listar todas as turmas
	
	public List<Turma> listaTodasTurmas(){
		return repo.findAll();
		
	}
	
	
	
	//criar um metodo para trazer uma turma por id
	public Turma buscaPorId(Integer id) throws ObjectNotFoundException {
		Optional<Turma> turma = repo.findById(id);
		return turma.orElseThrow(() -> new ObjectNotFoundException(null, "Turma não encontradal"));
		
	}
	
	
	
	//criar um metodo para inserir a turma
	public Turma salvar(Turma turma) {
		return repo.save(turma);
		// Mesmo que escrever: insert into turma (nome) values ("nome da turma")
	}
	
	
	
	//criar um metodo para fazer update da turma
	public Turma alterar(Turma objTurma) {
		Turma turma = buscaPorId(objTurma.getId());
		turma.setNome(objTurma.getNome());
		return salvar(turma);
	}
	
	//criar um metodo para excluir a turma
	public void excluir(Integer id) {
		repo.deleteById(id);
	}
}
