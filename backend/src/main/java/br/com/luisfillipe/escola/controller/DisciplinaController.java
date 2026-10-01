package br.com.luisfillipe.escola.controller;
import br.com.luisfillipe.escola.model.Disciplina; import br.com.luisfillipe.escola.repository.*; import jakarta.validation.Valid; import org.springframework.http.HttpStatus; import org.springframework.web.bind.annotation.*; import java.util.List;
@RestController @RequestMapping("/api/disciplinas") public class DisciplinaController{
 private final DisciplinaRepository r; private final ProfessorRepository pr;
 public DisciplinaController(DisciplinaRepository r,ProfessorRepository pr){this.r=r;this.pr=pr;}
 @GetMapping public List<Disciplina> listar(){return r.findAll();}
 @PostMapping @ResponseStatus(HttpStatus.CREATED) public Disciplina criar(@Valid @RequestBody Disciplina d){d.setProfessor(pr.findById(d.getProfessor().getId()).orElseThrow());return r.save(d);}
}
