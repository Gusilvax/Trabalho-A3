package org;

import Modulo_A.Preposicao;
import Modulo_A.ValidadorRegras;
import Modulo_B.Calculadora;
import Modulo_C.Funcao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        executarCalculadora(scanner);
        executarFuncao();
        executarValidadorRegras();
    }

    private static void executarCalculadora(Scanner scanner) {

            System.out.println("=== Calculadora ===");
            Calculadora calculadora = new Calculadora();

            System.out.println("Digite o primeiro número: ");
            double a = scanner.nextDouble();
            System.out.println("Digite o segundo número: ");
            double b = scanner.nextDouble();

            System.out.println();
            System.out.println("Soma: " + calculadora.somar(a, b));
            System.out.println();
            System.out.println("Subtração: " + calculadora.subtrair(a, b));
            System.out.println();
            System.out.println("Multiplicação: " + calculadora.multiplicar(a, b));
            System.out.println();
            System.out.println("Divisão: " + calculadora.dividir(a, b));

    }
     private static void executarFuncao() {
            System.out.println("=== Função ===");
            Funcao funcao = new Funcao();
            double a = 2, b= 3, c = 1, x = 4;

            System.out.println();
            System.out.println("Função Linear (f(x) = ax + b): " + funcao.calcularFuncaoLinear(a, b, x));
            System.out.println();
            System.out.println("Função Quadrática (f(x) = ax^2 + bx + c) " + funcao.calcularFuncaoQuadratica(a, b, c, x));

        }

        private static void executarValidadorRegras(){

            System.out.println("=== Validador de Regras ===");
            Preposicao condicao1 = new Preposicao();
            Preposicao condicao2 = new Preposicao();
            condicao1.setValor(true);
            condicao2.setValor(false);

            ValidadorRegras validador = new ValidadorRegras();
            System.out.println();
            System.out.println("Ambas condições são verdadeiras: "  + validador.validarCodicoes(condicao1, condicao2));
            System.out.println();
            System.out.println("Pelo menos uma condição é verdadeira:" + validador.validarAlternativas(condicao1, condicao2));
            System.out.println();
            System.out.println("Regra Personalizada: " + validador.validarRegraPersonalizada(condicao1, condicao2));
    }
}
