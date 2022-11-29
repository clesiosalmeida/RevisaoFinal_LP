package br.com.exercicio5;

import java.util.Random;

public class Pedido {
  private int codigo;
  private double valorTotal;
  private Cozinha[] cozinhas = new Cozinha[1];

  public Pedido() {
    this.codigo = new Random().nextInt(999999);
  }

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public void addCozinha(Cozinha cozinha) {
    cozinhas[0] = cozinha;
  }

  public void calculaValorPedido() {
    valorTotal = cozinhas[0].calculaValorTotal();
  }

  public String detalhesPedido() {
    return "Detalhes do Pedido: \nNº: " + this.codigo + "\nValor Total: " + this.valorTotal;
  }
}
