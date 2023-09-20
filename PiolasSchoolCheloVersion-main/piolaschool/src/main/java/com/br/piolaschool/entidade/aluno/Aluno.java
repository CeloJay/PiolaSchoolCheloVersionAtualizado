package com.br.piolaschool.entidade.aluno;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.EqualsAndHashCode;

@Table(name = "aluno")
@Entity(name = "aluno")
@EqualsAndHashCode(of = "matricula")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    // @Column(name = "matricula", length = 20, nullable = true)
    private Long matricula;

    @NotBlank(message = "Este campo é obrigatório")
    // @Column(name = "nome_completo", length = 255, nullable = true)
    private String nome_completo;

    @Email(message = "Insira um e-mail válido")
    @NotBlank(message = "Este campo é obrigatório")
    // @Column(name = "email", length = 255, nullable = true)
    private String email;

    @Size(min = 6, message = "Mínimo de 6 caracteres")
    @NotBlank(message = "Este campo é obrigatório")
    // @Column(name = "telefone", length = 14, nullable = true)
    private String telefone;

    @NotBlank(message = "Este campo é obrigatório")
    // @Column(name = "senha", length = 255, nullable = true)
    private String senha;

    public Aluno(Long matricula, @NotBlank(message = "Este campo é obrigatório") String nome_completo,
            @Email(message = "Insira um e-mail válido") @NotBlank(message = "Este campo é obrigatório") String email,
            @Size(min = 6, message = "Mínimo de 6 caracteres") @NotBlank(message = "Este campo é obrigatório") String telefone,
            @NotBlank(message = "Este campo é obrigatório") String senha) {
        this.matricula = matricula;
        this.nome_completo = nome_completo;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
    }

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public String getNome_completo() {
        return nome_completo;
    }

    public void setNome_completo(String nome_completo) {
        this.nome_completo = nome_completo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
