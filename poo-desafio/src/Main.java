package com.dio.desafio.poo;

import com.dio.desafio.poo.model.Curso;
import com.dio.desafio.poo.model.Dev;
import com.dio.desafio.poo.model.Bootcamp;
import com.dio.desafio.poo.model.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Java Básico", "Descrição do curso de Java", 8);
        Curso curso2 = new Curso("Spring Boot", "Descrição do curso de Spring Boot", 10);

        Mentoria mentoria1 = new Mentoria("Mentoria de Java", "Descrição da mentoria de Java", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getCursos().add(curso1);
        bootcamp.getCursos().add(curso2);

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);

        System.out.println("Cursos inscritos João: " + devJoao.getCursosInscritos());
        devJoao.progredir();
        System.out.println("Cursos concluídos João: " + devJoao.getCursosConcluidos());
        System.out.println("XP total João: " + devJoao.calcularTotalXp());
    }
}
