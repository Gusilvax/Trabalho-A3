package Modulo_D;

public class Conjunto {

//Método para calcular o fatorial deum número
    public int fatorial(int n){
        if (n < 0 ){
            throw new IllegalArgumentException("O número deve ser não negativo.");
        }
        return ( n == 0 || n == 1) ? 1: n * fatorial (n-1);
    }
        public int fibonacci(int n){
        if (n < 0) {
            throw new IllegalArgumentException("O índice deve ser não negativo");
        }
        return (n == 0) ? 0 : (n == 1) ? 1 : fibonacci(n - 1) + fibonacci (n - 2);
        }
        public String calcularFatorial( int numero) {

        return null;
        }


}
