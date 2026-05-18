package Modulo_C;

public class Funcao {

    //Método para calcular o valor de uma função linear (f(x) = ax + b)
    public double calcularFuncaoLinear(double a, double b, double x){
        return a * x + b;
    }

    //Método para calcular o valor de uma função quadrática (f(x) = ax^2 + bx + c)
    public double calcularFuncaoQuadratica(double a, double b, double c, double x){
        return a * Math.pow(x, 2) + b * x + c;
        //Retorna o valor de uma função quadrática para o valor de x fornecido
    }
}
