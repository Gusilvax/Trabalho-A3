package Modulo_F;

import java.util.*;
import java.util.List;

public class implantacao {
   
    public static boolean verificarImplantacao(String dia, boolean alugada, int data){
        
        //Lista de datas disponiveis para implantação
        List<Integer> datasDisponiveis = Arrays.asList(19,26); // Exemplo de sexta para implantação no mês de julho
        
        //Vertifica se a data fornecida está na lista de datas disponíveis e não está alugada 
        return "Sexta".equalsIgnoreCase(dia) && datasDisponiveis.contains(data) && !alugada;
    }
    
    public void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> datasDisponiveis = Arrays.asList(19, 26); // Datas disponíveis para implantação
        String dia;
        int data;
        boolean alugada;

        while (true){

            //Solicita a data de implantação
            System.out.println("Digite a data de implantação:");
            if (!scanner.hasNextInt()) {
                System.err.println("Entrada inválida. Por favor, digite um número inteiro.");
                scanner.next();
                continue;
            }
            data = scanner.nextInt();
            System.out.println();

            //Determina o dia da semana com base na data fornecida
            switch (data) {
                case 19, 26 -> dia = "Sexta";
                case 1, 2, 3, 4, 5, 6,7, 8, 9,10, 11, 12, 13, 14, 15, 16, 17, 18, 20, 21, 22, 23, 24, 25, 27, 28,29, 30 -> dia = "Datas alugadas";
                default -> {
                        System.out.println("Data alugada ou fora do calendário de implantação.");
                        System.out.println();
                    continue;

                }
            }

            if (!datasDisponiveis.contains(data)){
                System.out.println("Data alugada ou fora do calendário de implantação.");
                continue; //Solicita uma nova data
            }
            System.out.println("Janela de implantação alugada com sucesso");
            alugada = scanner.nextBoolean();

            //Verifica se a implnatação é liberada
            boolean liberado = verificarImplantacao(dia, alugada, data);

            if (liberado){
                System.out.println("Implantação liberada para a data: " + data);
                break;
            } else {
                System.out.println("Implantação não liberada para a data: " + data);

            }

        }
scanner.close();
    }
}
