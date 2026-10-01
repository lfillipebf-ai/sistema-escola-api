package br.com.luisfillipe.escola.repository;
import br.com.luisfillipe.escola.model.Professor; import org.springframework.data.jpa.repository.JpaRepository;
public interface ProfessorRepository extends JpaRepository<Professor,Long>{}
