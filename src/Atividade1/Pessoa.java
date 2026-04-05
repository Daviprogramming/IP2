package Atividade1;

public class Pessoa {

    private String nome;
    private long cpf;
    private String pais;

    public Pessoa(String nome, long cpf, String pais) {
        setNome(nome);
        if(cpf == 0){
            throw new IllegalArgumentException();
        }
        this.cpf = cpf;
        this.pais = pais;
    }

    public void setNome(String nome){
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public long getCpf(){
        return cpf;
    }

    public void setPais(String pais){
        this.pais = pais;
    }
    public String getPais(){
        return this.pais;
    }


}
