package ExercicioFixacao.application;

import ExercicioFixacao.entities.Aluno;
import ExercicioFixacao.entities.Curso;
import ExercicioFixacao.entities.Professor;

public class Main {
    public static void main(String[] args){
        Professor professor = new Professor("Augusto Ferreira","Cientista" );
        Curso curso = new Curso("Introdução a Programação II", 60, professor);
        Aluno aluno1 = new Aluno("Davi Vinícius", 20);
        Aluno aluno2 = new Aluno(
                "João Lucas",
                21,
                curso[] );
        System.out.println(aluno1.exibirInfo());
        System.out.println(aluno2.exibirInfo());


    }
}
