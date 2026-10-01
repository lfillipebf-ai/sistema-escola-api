package br.com.luisfillipe.escola.model;
import jakarta.persistence.*; import jakarta.validation.constraints.*;
@Entity public class Aluno {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @NotBlank private String nome; @Email private String email;
 public Long getId(){return id;} public String getNome(){return nome;} public void setNome(String v){nome=v;}
 public String getEmail(){return email;} public void setEmail(String v){email=v;}
}
