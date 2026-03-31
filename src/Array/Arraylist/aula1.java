package Array.Arraylist;

import java.util.ArrayList;

public class aula1 {
    static void main() {
        ArrayList<String> nomes = new ArrayList();
        nomes.add("Walterlan");
        nomes.add("João");

        if(nomes.contains("João")){
            nomes.remove("João");
        }
        System.out.println(nomes.size());

        for(int i = 0; i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        }

        for(String nome : nomes) { // utiliza o nome para alocar os nomes contidos na lista
            System.out.println(nome);
        }
        Integer il = 10;

    }
    // definição - definir a variavel
    // inicialização - quando você fazer o new (new conta[25])
    // população - arrayContas[0] = new Conta();

    /* Tipos Wrapper - usados para fazer listas de inteiros / char
    char - Character;
    int - Integer;
     Auto-box :
     Integer g = 10;
     int e = g;

     Garbage Collection

     Pessoa P = new Pessoa(); Criando o primeiro objeto
     .
     .
     .
     P = new Pessoa(); Criando outro objeto com o mesmo nome

     Coletor de lixo destroi o primeiro objeto.





     */

}
