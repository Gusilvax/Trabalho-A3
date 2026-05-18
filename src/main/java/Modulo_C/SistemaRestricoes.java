package Modulo_C;

public class SistemaRestricoes {

    //Método para verificar se um valor está dentro de um intervalo
    public boolean verificarIntervalo(double valor, double limiteInferior, double limiteSuperior){
        return valor >= limiteInferior && valor <= limiteSuperior;
    }

    //Método para verificar se um conjunto de valores satisfaz uma restrição personalizada
    public boolean verificarRestricaoPersonalizada(double[] valores, double limite ){
        double soma = 0;
        for (double valor : valores) {
            soma += valor;
        }
        return soma <= limite;
        // Retorna verdadeiro se a soma dos valores for menor ou igual ao limite
    }
}
