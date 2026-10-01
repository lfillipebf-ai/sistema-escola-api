package br.com.luisfillipe.escola.controller;
import br.com.luisfillipe.escola.model.Professor; import br.com.luisfillipe.escola.repository.ProfessorRepository; import jakarta.validation.Valid; import org.springframework.http.HttpStatus; import org.springframework.web.bind.annotation.*; import java.util.List;
@RestController @RequestMapping("/api/professores") public class ProfessorController{
 private final ProfessorRepository r; public ProfessorController(ProfessorRepository r){this.r=r;}
 @GetMapping public List<Professor> listar(){return r.findAll();}
 @PostMapping @ResponseStatus(HttpStatus.CREATED) public Professor criar(@Valid @RequestBody Professor p){return r.save(p);}
}
