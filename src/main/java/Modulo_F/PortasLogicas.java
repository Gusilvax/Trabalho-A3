package Modulo_F;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PortasLogicas {
    // Operações lógicas básicas (métodos utilitários)
    public static boolean and(boolean cond1, boolean cond2) { return cond1 && cond2; }
    public static boolean or(boolean cond1, boolean cond2) { return cond1 || cond2; }
    public static boolean not(boolean cond) { return !cond; }
    public static boolean nand(boolean cond1, boolean cond2) { return !(cond1 && cond2); }
    public static boolean nor(boolean cond1, boolean cond2) { return !(cond1 || cond2); }
    public static boolean xor(boolean cond1, boolean cond2) { return cond1 ^ cond2; }

    // Texto explicativo para cada porta (em português BR)
    private static final String TEXTO_AND = "AND (E): retorna verdadeiro apenas se todas as entradas são verdadeiras." +
            "\nQuando usar: validar várias condições que todas precisam ser verdadeiras.\nExemplo: " +
            "" +
            "Permitir acesso somente se (senhaCorreta AND usuarioAtivo).";

    private static final String TEXTO_OR = "OR (OU): retorna verdadeiro se pelo menos uma das entradas for verdadeira." +
            "\nQuando usar: aceitar quando uma de várias condições permitir.\nExemplo: Permitir login se (tokenValido OR senhaCorreta).";

    private static final String TEXTO_NOT = "NOT (NÃO): inverte o valor lógico." +
            "\nQuando usar: negar uma condição ou aplicar lógica inversa.\nExemplo: bloquear ação se (NOT usuarioAdmin).";

    private static final String TEXTO_NAND = "NAND: negação do AND (verdadeiro, exceto quando todas as entradas são verdadeiras)." +
            "\nQuando usar: otimizar certas verificações ou em circuitos digitais; pode ser útil para regras de exceção.\nExemplo: " +
            "permitir ação salvo quando (regra1 AND regra2) forem ambas verdadeiras -> usar NAND para detectar isso.";

    private static final String TEXTO_NOR = "NOR: negação do OR (verdadeiro somente quando todas as entradas são falsas)." +
            "\nQuando usar: detectar ausência completa de condições; em automação, pode significar 'nenhum sensor ativado'.\nExemplo: " +
            "disparar alarme se (sensorA NOR sensorB) -> nenhum sensor disparado?";

    private static final String TEXTO_XOR = "XOR (OU exclusivo): retorna verdadeiro se exatamente uma das entradas for verdadeira." +
            "\nQuando usar: detectar diferença entre duas condições.\nExemplo: habilitar modo especial se (opcaoA XOR opcaoB) -> apenas uma opção pode estar ativa.";

    // Cria a interface gráfica com botões para cada porta e uma área de texto para explicação
    private static void criarEExibirGUI() {
        JFrame frame = new JFrame("Portas Lógicas - Explicações");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 350);
        frame.setLocationRelativeTo(null);

        JPanel botoesPanel = new JPanel(new GridLayout(2, 3, 8, 8));
        JTextArea textoArea = new JTextArea();
        textoArea.setEditable(false);
        textoArea.setLineWrap(true);
        textoArea.setWrapStyleWord(true);
        textoArea.setFont(new Font("SansSerif", Font.PLAIN, 14));

        // Cria botões
        JButton btnAnd = new JButton("AND");
        JButton btnOr = new JButton("OR");
        JButton btnNot = new JButton("NOT");
        JButton btnNand = new JButton("NAND");
        JButton btnNor = new JButton("NOR");
        JButton btnXor = new JButton("XOR");

        // Configura ações dos botões para mostrar o texto correspondente
        btnAnd.addActionListener(e -> textoArea.setText(TEXTO_AND));
        btnOr.addActionListener(e -> textoArea.setText(TEXTO_OR));
        btnNot.addActionListener(e -> textoArea.setText(TEXTO_NOT));
        btnNand.addActionListener(e -> textoArea.setText(TEXTO_NAND));
        btnNor.addActionListener(e -> textoArea.setText(TEXTO_NOR));
        btnXor.addActionListener(e -> textoArea.setText(TEXTO_XOR));

        botoesPanel.add(btnAnd);
        botoesPanel.add(btnOr);
        botoesPanel.add(btnNot);
        botoesPanel.add(btnNand);
        botoesPanel.add(btnNor);
        botoesPanel.add(btnXor);

        JPanel container = new JPanel(new BorderLayout(10, 10));
        container.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        container.add(botoesPanel, BorderLayout.NORTH);
        container.add(new JScrollPane(textoArea), BorderLayout.CENTER);

        frame.setContentPane(container);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Executa a criação da GUI na Event Dispatch Thread
        SwingUtilities.invokeLater(PortasLogicas::criarEExibirGUI);
    }
}

