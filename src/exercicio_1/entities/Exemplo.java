package exercicio_1.entities;
public class Exemplo {
    public static void main(String[] args) {


        // Definição / inicialização
        int[] valores; // Definição
        valores = new int[10]; // Inicialização
        valores[0] = 89;
        valores[1] = 155;
        valores[2] = 295;

        for(int i = 0; i < valores.length; i++){
            System.out.println(valores[i]);
        }
        int[] valorMaisRapido = new int[50];
        for(int i = 0; i < valorMaisRapido.length; i++){
            System.out.println(valorMaisRapido[i]);
        }
        int[] valoresTurbo = {234, 2343, 6656, 124, 6767};
        for(int i = 0; i < valoresTurbo.length; i = i+2){
            System.out.println(valoresTurbo[i]);
        }


        String[] tratamentos = {
                "Sr.",
                "Sra.",
                "Dra.",
                "Dr.",
                "Vsa. Excelência",
                null
        };
        System.out.println(tratamentos[2] + " Joseane, bem-vinda");

        if(tratamentos[5] != null){
            System.out.println(tratamentos[5].toString());

        } else {
            System.out.println("Valor nulo!");
        }

         // errinho quando tá fora do array - System.out.println(tratamentos[8]);

        int[][] arrayBidimensional = new int[10][];
        arrayBidimensional[0] = new int[]  {20,10,30,40,50,60,70,80,90};
        arrayBidimensional[1] = new int[]  {0, 1, 2, 3 , 4};




    }
}