package Modulo_E;

public class Ponto {

    private double x;
    private double y;

    //Construtor para inicializar o ponto

    public Ponto (double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getters


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    //Método para calcular a distância entre dois pontos

    public double calcularDistancia(Ponto outro) {
        return Math.sqrt(Math.pow(outro.x - this.x, 2) + Math.pow(outro.getY() - this.y, 2));
    }
}
