package com.br.piolaschool.entidade.curso;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;


@Table(name = "curso")
@Entity(name = "curso")
@EqualsAndHashCode(of = "codigo")
public class Curso {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codigo;

    private String nome;

    private Long numeroalunos;

    private Long tarefas;

    private Long aulas;

    public Curso(Long codigo, String nome, Long numeroalunos, Long tarefas, Long aulas) {
        this.codigo = codigo;
        this.nome = nome;
        this.numeroalunos = numeroalunos;
        this.tarefas = tarefas;
        this.aulas = aulas;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getNumeroalunos() {
        return numeroalunos;
    }

    public void setNumeroalunos(Long numeroalunos) {
        this.numeroalunos = numeroalunos;
    }

    public Long getTarefas() {
        return tarefas;
    }

    public void setTarefas(Long tarefas) {
        this.tarefas = tarefas;
    }

    public Long getAulas() {
        return aulas;
    }

    public void setAulas(Long aulas) {
        this.aulas = aulas;
    }

    

}
