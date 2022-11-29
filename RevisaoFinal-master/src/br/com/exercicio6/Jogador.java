package br.com.exercicio6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Jogador {
  private String nome[] = new String[5];

  public String[] getNome() {
    return nome;
  }

  public void setNome(String[] nome) {
    this.nome = nome;
  }

  public void escreverNoArquivo(String path) throws IOException {
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
    for (int i = 0; i < this.nome.length; i++) {
      bufferedWriter.append(nome[i] + "\n");
    }
    bufferedWriter.close();
  }

  public String lerJogadores(String path) throws IOException {
    BufferedReader bufferReader = new BufferedReader(new FileReader(path));
    String str = "";
    for (int i = 0; i < this.nome.length; i++) {
      if (bufferReader.readLine().equals("Neymar")) {
        str = "Neymar é um dos jogadores preferidos.";
      }
    }
    bufferReader.close();
    return str;
  }
}
