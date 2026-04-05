package Atividade1;
import java.time.LocalDateTime;
public class Main {
    public static void main(String[] args){

        Pessoa pessoaA = new Pessoa("Davi", 70754345345L, "Brasil");
        Pessoa pessoaB = new Pessoa("Jose", 10209402483L, "Jamaica");
        Pessoa pessoaC = new Pessoa("Emily", 9401390924L, "Brasil");

        LocalDateTime dataJogo1 = LocalDateTime.of(2026, 5, 10, 14, 50);
        Jogo jogo1 = new Jogo("Sport", "Ibis", "Arena de Pernambuco", dataJogo1 );

        LocalDateTime dataJogo2 = LocalDateTime.of(2026, 5, 10, 16, 30);
        Jogo jogo2 = new Jogo("Nautico", "Santa Cruz", "Arena do Arruda", dataJogo2 );

        Ingresso ingresso1 = new Ingresso(pessoaA, jogo1, "A35, Fileira B");
        Ingresso ingresso2 = new Ingresso(pessoaB, jogo1, "A36, Fileira C");
        Ingresso ingresso3 = new Ingresso(pessoaC, jogo2, "A54, Fileira J");

        System.out.println(ingresso1.getPessoa().getPais());
        System.out.printf("Equipe %s vs Equipe %s - Na %s",ingresso2.getJogo().getEquipeA(), ingresso2.getJogo().getEquipeB(), ingresso2.getJogo().getEstadio());

    }
}
