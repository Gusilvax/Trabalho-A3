package Modulo_G;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FormularioCadastro {

   public static boolean podeEnviarDados (boolean camposOK, boolean termosAceitos, boolean bloqueado){
       return camposOK && termosAceitos && !bloqueado; // Verifica se os dados podem ser enviados com base nas condições fornecidas
   }

   public static void main (String [] args) {
       // Nome do arquivo onde serão registradas as ações (modo append)
       String nomeArquivo = "acoes_formulario.txt";
       DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

       // try-with-resources garante fechamento de Scanner e FileWriter
       try (Scanner scanner = new Scanner(System.in);
            FileWriter writer = new FileWriter(nomeArquivo, true)) {

           writer.write("=== Nova execução: " + LocalDateTime.now().format(fmt) + " ===\n");

           System.out.println("=== Cadastro de Usuário ===");

           // Pergunta 1
           System.out.println();
           System.out.println("Os campos estão preenchidos corretamente? (true/false)");
           boolean camposOK = scanner.nextBoolean();
           writer.write("CamposOK: " + camposOK + "\n");

           // Pergunta 2
           System.out.println();
           System.out.println("Os termos de uso foram aceitos? (true/false)");
           boolean termosAceitos = scanner.nextBoolean();
           writer.write("TermosAceitos: " + termosAceitos + "\n");

           // Pergunta 3
           System.out.println();
           System.out.println("O usuário está bloqueado? (true/false)");
           boolean bloqueado = scanner.nextBoolean();
           writer.write("Bloqueado: " + bloqueado + "\n");

           // Resultado
           boolean enviar = podeEnviarDados(camposOK, termosAceitos, bloqueado);

           System.out.println("=== Resultado do Cadastro ===");
           System.out.println();
           String resultado;

           if (enviar) {
               resultado = "Dados enviados com sucesso!";
               System.out.println(resultado);
               writer.write("Resultado: " + resultado + "\n");
           } else {
               resultado = "Erro: Não foi possível enviar os dados.";
               System.out.println(resultado);
               writer.write("Resultado: " + resultado + "\n");
           }

           writer.write("\n");
           writer.flush();

       } catch (IOException e) {
           System.err.println("Erro ao gravar o arquivo: " + e.getMessage());
           e.printStackTrace();
       }
   }
}


