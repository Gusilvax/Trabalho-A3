package Modulo_A;

public class ValidadorRegras {

    public boolean validarCodicoes(Preposicao condicao1, Preposicao condicao2){
        return condicao1.getValor() && condicao2.getValor(); // Retorna verdadeiro se ambas as condicoees forem verdadeiraas
    }

    public boolean validarAlternativas(Preposicao condicao1, Preposicao condicao2){
        return condicao1.getValor() || condicao2.getValor(); // Retorna verdadeiro se pelo menos uma das alternativas for verdadeira
    }
    //Método para validar uma regra personalizada

    public boolean validarRegraPersonalizada (Preposicao condicao1, Preposicao condicao2){
        // Exemplo de regra personalizada: Retorna verdadeiro se a primeira condição for verdadeira e a segunda for falsa
        return condicao1.getValor() && !condicao2.getValor();
    }
}
