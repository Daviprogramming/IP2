package Atividade1;
// Crie a classe ‘Ingresso’ com seus respectivos atributos. Atenção para os
//tipos de cada atributo. Implemente um construtor que receba como
//parâmetros os valores para inicializar os atributos. Implemente somente os
//métodos do tipo set para os atributos que precisam de alguma validação,
//que neste caso são todos, e invoque esses métodos no construtor.
//Considere que todos os métodos get devem ser implementados.
public class Ingresso {
    private Pessoa pessoa;
    private Jogo jogo;
    private String assento;

    public Ingresso(Pessoa pessoa, Jogo jogo, String assento) {
        setPessoa(pessoa);
        setJogo(jogo);
        setAssento(assento);
    }
    private void setPessoa(Pessoa pessoa){
        if(pessoa == null){
            throw new IllegalArgumentException();
        }
        this.pessoa = pessoa;
    }
    public Pessoa getPessoa(){
        return pessoa;
    }
    private void setJogo(Jogo jogo){
        if(jogo == null){
            throw new IllegalArgumentException();
        }
        this.jogo = jogo;
    }
    public Jogo getJogo(){
        return jogo;
    }
    private void setAssento(String assento){
        if(assento == null || assento.trim().isEmpty()){
            throw new IllegalArgumentException();
        }
        this.assento = assento;
    }
    public String getAssento(){
        return assento;
    }

}
