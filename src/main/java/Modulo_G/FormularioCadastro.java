package Modulo_G;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FormularioCadastro {

   private static final Logger logger = Logger.getLogger(FormularioCadastro.class.getName());

   public static boolean podeEnviarDados (boolean camposOK, boolean termosAceitos, boolean bloqueado){
       return camposOK && termosAceitos && !bloqueado;
   }

   public static void main (String [] args) {
       String nomeArquivo = "acoes_formulario.txt";
       DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

       try (Scanner scanner = new Scanner(System.in);
            FileWriter writer = new FileWriter(nomeArquivo, true)) {

           writer.write("=== Nova execução: " + LocalDateTime.now().format(fmt) + " ===\n");

           System.out.println("=== Cadastro de Usuário ===");

           System.out.println();
           System.out.println("Os campos estão preenchidos corretamente? (true/false)");
           boolean camposOK = scanner.nextBoolean();
           writer.write("CamposOK: " + camposOK + "\n");

           System.out.println();
           System.out.println("Os termos de uso foram aceitos? (true/false)");
           boolean termosAceitos = scanner.nextBoolean();
           writer.write("TermosAceitos: " + termosAceitos + "\n");

           System.out.println();
           System.out.println("O usuário está bloqueado? (true/false)");
           boolean bloqueado = scanner.nextBoolean();
           writer.write("Bloqueado: " + bloqueado + "\n");

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

       } catch (InputMismatchException e) {
           System.err.println("Entrada inválida. Por favor, digite 'true' ou 'false'.");
       } catch (IOException e) {
           logger.log(Level.SEVERE, "Erro ao gravar o arquivo", e);
       }
   }
}


