package br.com.exercicio2;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {
        int qtdPulico = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade do publico:"));
        double valorIngresso = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do ingresso"));

        JOptionPane.showMessageDialog(null, "O valor de arrecadação do primeiro jogo de abertura da copa do mundo foi: "
                + (qtdPulico * valorIngresso));
    }
}
