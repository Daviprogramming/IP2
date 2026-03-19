package ExercicioFixacao.entities;

public class Curso {
    private String nome;
    private int cargaHoraria;
    private Professor professor;

    public Curso(String nome, int cargaHoraria, Professor professor){
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.professor = professor;
    }

    public String getNomeCurso(){
        return nome;
    }
    public int getCargaHoraria(){
        return cargaHoraria;
    }
    public Professor getProfessor(){
        return professor;
    }
    public void setNomeCurso(String nome){
        this.nome = nome;
    }
    public void setCargaHoraria(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }
    public void setProfessor(Professor professor){
        this.professor = professor;
    }
    public String toString(){
        return getNomeCurso();
    }




}
