package br.com.luisfillipe.escola.controller;
import br.com.luisfillipe.escola.model.Aluno; import br.com.luisfillipe.escola.repository.AlunoRepository; import jakarta.validation.Valid; import org.springframework.http.HttpStatus; import org.springframework.web.bind.annotation.*; import java.util.List;
@RestController @RequestMapping("/api/alunos") public class AlunoController{
 private final AlunoRepository r; public AlunoController(AlunoRepository r){this.r=r;}
 @GetMapping public List<Aluno> listar(){return r.findAll();}
 @PostMapping @ResponseStatus(HttpStatus.CREATED) public Aluno criar(@Valid @RequestBody Aluno a){return r.save(a);}
}
