package com.dio.desafio.poo.model;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Dev {
    private String nome;
    private final Set<Curso> cursosInscritos = new LinkedHashSet<>();
    private final Set<Curso> cursosConcluidos = new HashSet<>();

    // Métodos para inscrição, conclusão e cálculo de XP
    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.cursosInscritos.addAll(bootcamp.getCursos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir() {
        // Implementação do método de progresso
    }

    public double calcularTotalXp() {
        // Implementação do cálculo de XP
        return 0;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Curso> getCursosInscritos() {
        return cursosInscritos;
    }

    public Set<Curso> getCursosConcluidos() {
        return cursosConcluidos;
    }
}
