package br.com.luisfillipe.escola.controller;
import br.com.luisfillipe.escola.model.Matricula; import br.com.luisfillipe.escola.repository.*; import jakarta.validation.Valid; import org.springframework.web.bind.annotation.*; import java.util.List;
@RestController @RequestMapping("/api/matriculas") public class MatriculaController{
 private final MatriculaRepository r; private final AlunoRepository ar; private final DisciplinaRepository dr;
 public MatriculaController(MatriculaRepository r,AlunoRepository ar,DisciplinaRepository dr){this.r=r;this.ar=ar;this.dr=dr;}
 @GetMapping public List<Matricula> listar(){return r.findAll();}
 @PostMapping public Matricula criar(@Valid @RequestBody Matricula m){m.setAluno(ar.findById(m.getAluno().getId()).orElseThrow());m.setDisciplina(dr.findById(m.getDisciplina().getId()).orElseThrow());return r.save(m);}
 @PatchMapping("/{id}/nota") public Matricula nota(@PathVariable Long id,@RequestParam Double valor){if(valor==null||valor<0||valor>10) throw new IllegalArgumentException("A nota deve estar entre 0 e 10"); Matricula m=r.findById(id).orElseThrow();m.setNota(valor);return r.save(m);}
}
