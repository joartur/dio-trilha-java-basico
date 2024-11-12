package com.dio.desafio.poo.model;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final Set<Curso> cursos = new HashSet<>();
    private final Set<Dev> devsInscritos = new LinkedHashSet<>();

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Set<Curso> getCursos() {
        return cursos;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }
}
