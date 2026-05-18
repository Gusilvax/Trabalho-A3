package Modulo_B;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Calculadora {

    private static final Logger logger = Logger.getLogger(Calculadora.class.getName());

    //Método para somar dois números
    public double somar (double a, double b) {
        double resultado = a + b;
        logger.log(Level.INFO, "Somando {0} + {1} = {2}", new Object[]{a, b, resultado});
        return resultado;
    }

    //Método para subtrair dois números
    public double subtrair (double a, double b) {
        double resultado = a - b;
        logger.log(Level.INFO, "Subtraindo {0} - {1} = {2}", new Object[]{a, b, resultado});
        return resultado;
    }

    //Método para multoplicar dois números
    public double multiplicar (double a, double b) {
        double resultado = a * b;
        logger.log(Level.INFO, "Multiplicando {0} * {1} = {2}", new Object[]{a, b, resultado});
        return resultado;
    }

    //Método para dividir dois números
    public double dividir (double a, double b) {
        if (b == 0) {

        logger.log(Level.WARNING, "Tentativa de divisão por zero: {0} / {1}", new Object [] {a, b });
        throw new ArithmeticException("Divisão por zero não é permitida.");
        }

        double resultado = a / b;
        logger.log(Level.INFO, "Dvidindo {0} / {1} = {2}", new Object[] {a, b, resultado});
        return resultado;
    }
}
