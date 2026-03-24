package ExercicioFixacao.entities;

public class Aluno {
    private String nome;
    private int idade;
    private Curso[] curso;

    public Aluno(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public Aluno(String nome, int idade, Curso[] curso){
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }
    public String getNomeAluno(){
        return nome;
    }
    public void setNomeAluno(String nome){
        this.nome = nome;
    }

    public int getIdadeAluno(){
        return idade;
    }
    public void setIdadeAluno(int idade){
        this.idade = idade;
    }

    public Curso[] getCursoAluno(){
        return curso;
    }
    public void setCursoAluno(Curso[] curso){
        this.curso = curso;
    }

    public String exibirInfo(){
        String mensagem = "";
        mensagem+= "Aluno: " + getNomeAluno() + " | Idade: " + getIdadeAluno();
        for(int i = 0; i < curso.length; i++){

        if(getCursoAluno() != null){
            mensagem+= "\nCurso: " + getCursoAluno() + " | Carga Horária: " + curso[i].getCargaHoraria() + "h";
            if(curso[i].getProfessor() != null){
                mensagem+= "\nProfessor: " + curso[i].getProfessor() + " | Especialidade: " + curso[i].getProfessor().getEspecialidade();
            }
        } else {
            mensagem+= "\nNenhum curso associado.";
        }
        }

        return mensagem;
    }


}