package com.br.piolaschool.entidade.professor;


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


@Table(name = "professor")
@Entity(name = "professor")
@EqualsAndHashCode(of = "matricula")
public class Professor {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    // @Column(name = "matricula", length = 20, nullable = true)
    private Long matricula;
    
    @NotBlank(message = "Este campo é obrigatório")
    // @Column(name = "usuario", length = 255, nullable = true)
    private String usuario;

    @Email(message = "Insira um e-mail válido")
    @NotBlank(message = "Este campo é obrigatório")
    // @Column(name = "email", length = 255, nullable = true)
    private String email;

    @Size(min = 6, message = "Mínimo de 6 caracteres")
    @NotBlank(message = "Este campo é obrigatório")
    // @Column(name = "senha", length = 255, nullable = true)
    private String senha;

    @NotBlank(message = "Este campo é obrigatório")
    // @Column(name = "telefone", length = 14, nullable = true)
    private String telefone;

    public Professor(Long matricula, @NotBlank(message = "Este campo é obrigatório") String usuario,
            @Email(message = "Insira um e-mail válido") @NotBlank(message = "Este campo é obrigatório") String email,
            @Size(min = 6, message = "Mínimo de 6 caracteres") @NotBlank(message = "Este campo é obrigatório") String senha,
            @NotBlank(message = "Este campo é obrigatório") String telefone) {
        this.matricula = matricula;
        this.usuario = usuario;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
    }

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    

    
}
