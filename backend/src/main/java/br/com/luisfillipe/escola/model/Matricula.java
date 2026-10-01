package br.com.luisfillipe.escola.model;
import jakarta.persistence.*; import jakarta.validation.constraints.*;
@Entity public class Matricula {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @ManyToOne(optional=false) private Aluno aluno;
 @ManyToOne(optional=false) private Disciplina disciplina;
 @NotNull @DecimalMin("0.0") @DecimalMax("10.0") private Double nota;
 public Long getId(){return id;} public Aluno getAluno(){return aluno;} public void setAluno(Aluno v){aluno=v;}
 public Disciplina getDisciplina(){return disciplina;} public void setDisciplina(Disciplina v){disciplina=v;}
 public Double getNota(){return nota;} public void setNota(Double v){nota=v;}
}
