package Modulo_E;

public class Triangulo {

    private Ponto pontoA;
    private Ponto pontoB;
    private Ponto pontoC;

    public Triangulo (Ponto ponto1, Ponto ponto2, Ponto ponto3){
    }

    //Construtor para inicializar o triângulo

    public double calcularPerimetro() {
        double ladoAB = pontoA.calcularDistancia(pontoB);
        double ladoBC = pontoB.calcularDistancia(pontoC);
        double ladoCA = pontoC.calcularDistancia(pontoA);
        return ladoAB + ladoBC + ladoCA;
    }

    //Método para a área do triângulo usando a fórmula de Heron

    public double calcularArea() {
        double ladoAB = pontoA.calcularDistancia(pontoB);
        double ladoBC = pontoB.calcularDistancia(pontoC);
        double ladoCA = pontoC.calcularDistancia(pontoA);
        double semiPerimetro = (ladoAB + ladoBC + ladoCA) / 2;
        return Math.sqrt(semiPerimetro * (semiPerimetro - ladoAB) * (semiPerimetro - ladoBC) * (semiPerimetro - ladoCA));
    }
}
