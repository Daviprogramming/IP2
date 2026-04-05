package Atividade1;
// Crie a classe ‘Jogo’ com seus respectivos atributos. Implemente um
//construtor que receba como parâmetros os valores para inicializar os
//atributos. Implemente somente os métodos do tipo set para os atributos
//que precisam de alguma validação, que neste caso são todos, e invoque
//esses métodos no construtor. Implemente somente os métodos get nesta
//classe, não precisa implementar os métodos set.
import java.time.LocalDateTime;
public class Jogo {
    private String equipeA;
    private String equipeB;
    private String estadio;
    private LocalDateTime dataHora;


    public Jogo(String equipeA, String equipeB, String estadio, LocalDateTime dataHora) {
        setEquipeA(equipeA);
        setEquipeB(equipeB);
        setEstadio(estadio);
        setDataHora(dataHora);
    }

    private void setEquipeA(String equipeA){
        if(equipeA == null || equipeA.trim().isEmpty()){
            throw new IllegalArgumentException();
        }
        this.equipeA = equipeA;
    }

    public String getEquipeA(){
        return equipeA;
    }
    private void setEquipeB(String equipeB){
        if(equipeB == null || equipeB.trim().isEmpty()){
            throw new IllegalArgumentException();
        }
        this.equipeB = equipeB;
    }

    public String getEquipeB(){
        return equipeB;
    }
    private void setEstadio(String estadio){
        if(estadio == null || estadio.trim().isEmpty()){
            throw new IllegalArgumentException();
        }
        this.estadio = estadio;
    }

    public String getEstadio(){
        return estadio;
    }

    private void setDataHora(LocalDateTime dataHora){
        if(dataHora == null){
            throw new IllegalArgumentException();
        }
        this.dataHora = dataHora;
    }

    public LocalDateTime getDataHora(){
        return dataHora;
    }


}
