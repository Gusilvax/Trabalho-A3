package Modulo_B;

public class Paginacao {

    //Método para calcular o número total de paginação
    public int  calcularTotalPaginas (int totalItens, int itensPorPagina){
        if (itensPorPagina <= 0) {
            throw new IllegalArgumentException("Itens por página deve ser maior que zero.");
        }
        return (int) Math.ceil((double) totalItens / itensPorPagina);
    }
    //Método para obter o indice inicial de um item em uma página
    public int calcularIndiceInicial (int pagina,  int itensPorPagina){
        if ( pagina <= 0 || itensPorPagina<= 0){
            throw new IllegalArgumentException("Página e itens por página devem ser maiores que zero.");
        }
        return (pagina - 1) * itensPorPagina;
    }
}
