package br.com.exercicio6;

import java.io.IOException;

import javax.swing.JOptionPane;

public class Main {
  public static void main(String[] args) throws IOException {
    String path = "./src/br/com/exercicio6/lista-jogadores.txt";
    String jogadores[] = new String[5];

    for (int i = 0; i < 5; i++) {
      jogadores[i] = JOptionPane.showInputDialog(null, "Informe o nome do jogador");
    }
    Jogador jogador = new Jogador();
    jogador.setNome(jogadores);
    jogador.escreverNoArquivo(path);
    JOptionPane.showMessageDialog(null, jogador.lerJogadores(path));
  }
}
