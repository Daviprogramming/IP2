package Atividade1;

import java.util.ArrayList;
import java.util.List;

public class RepositorioIngresso {

    private List<Ingresso> listaIngressos = new ArrayList<>();

    public RepositorioIngresso(){

    }
    public void adicionarIngressos(Ingresso ingresso){
        if(ingresso != null){
            this.listaIngressos.add(ingresso);
        }
    }

    public List<Ingresso> listarIngressos(){
        return this.listaIngressos;
    }

    public List<String> listarNomesPorEquipe(String equipe){

        List<String> nomeEncontrados = new ArrayList<>();

        for(Ingresso ingresso : this.listaIngressos){
            String equipeA = ingresso.getJogo().getEquipeA();
            String equipeB = ingresso.getJogo().getEquipeB();
            if(equipeA.equals(equipe) || equipeB.equals(equipe)){
                String nomeDaPessoa = ingresso.getPessoa().getNome();
                nomeEncontrados.add(nomeDaPessoa);
            }
        }
        return nomeEncontrados;
    }
}
