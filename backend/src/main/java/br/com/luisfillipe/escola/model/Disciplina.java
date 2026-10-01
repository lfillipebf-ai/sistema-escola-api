package br.com.luisfillipe.escola.model;
import jakarta.persistence.*; import jakarta.validation.constraints.*;
@Entity public class Disciplina {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @NotBlank private String nome;
 @ManyToOne(optional=false) private Professor professor;
 public Long getId(){return id;} public String getNome(){return nome;} public void setNome(String v){nome=v;}
 public Professor getProfessor(){return professor;} public void setProfessor(Professor v){professor=v;}
}
