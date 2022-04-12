package br.com.empresa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.empresa.entity.Aluno;
import br.com.empresa.entity.AlunoDisciplina;
import br.com.empresa.entity.Avaliacao;


@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer>{

	//select * from avaliacao where idaluno = 3 and iddisciplina = 6
//	Avaliacao findByAlunoDisciplina(AlunoDisciplina);
}
