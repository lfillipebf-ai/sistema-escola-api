package br.com.luisfillipe.escola.repository;
import br.com.luisfillipe.escola.model.Aluno; import org.springframework.data.jpa.repository.JpaRepository;
public interface AlunoRepository extends JpaRepository<Aluno,Long>{}
