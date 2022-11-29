package br.com.exercicio1;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {
        String jogador = JOptionPane.showInputDialog(null, "Informe o nome do jogador:");
        String selecao = JOptionPane.showInputDialog(null, "Informe a seleção do jogador " + jogador);

        JOptionPane.showMessageDialog(null, "O jogador " + jogador + " é da seleção " + selecao + ".");
    }
}
