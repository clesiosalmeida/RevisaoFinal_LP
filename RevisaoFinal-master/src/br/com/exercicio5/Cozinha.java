package br.com.exercicio5;

import java.util.ArrayList;

public class Cozinha {
  private String tipo;
  ArrayList<Prato> pratos = new ArrayList<>();

  public Cozinha(String tipo) {
    this.tipo = tipo;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public void addPrato(Prato prato) {
    pratos.add(prato);
  }

  public double calculaValorTotal() {
    double valorTotal = 0;

    for (Prato prato : pratos) {
      valorTotal += prato.getValor();
    }

    return valorTotal;
  }
}
