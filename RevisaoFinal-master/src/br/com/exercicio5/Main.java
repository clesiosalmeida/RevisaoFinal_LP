package br.com.exercicio5;

import javax.swing.JOptionPane;

public class Main {
  public static void main(String[] args) {
    int opcaoPrato = 0;
    Cozinha cozinha;
    Prato prato;
    Pedido pedido;
    int opcaoCozinha = Integer
        .parseInt(JOptionPane
            .showInputDialog(null, "Escolha uma cozinha: \n1) Árabe \n2) Italiana \n3) Mineira"));

    switch (opcaoCozinha) {
      case 1:
        cozinha = new Cozinha("Árabe");

        while (opcaoPrato != 4) {
          opcaoPrato = Integer
              .parseInt(JOptionPane.showInputDialog(null,
                  "Escolha um prato: \n1) Tabule \n2) Kafta \n3) Esfiha \n4) Fechar pedido"));
          switch (opcaoPrato) {
            case 1:
              prato = new Prato("Tabule", 23.50);
              cozinha.addPrato(prato);
              break;
            case 2:
              prato = new Prato("Kafta", 50.00);
              cozinha.addPrato(prato);
            case 3:
              prato = new Prato("Esfiha", 3.50);
              cozinha.addPrato(prato);
              break;
            default:
              opcaoPrato = 4;
              break;
          }
        }
        pedido = new Pedido();
        pedido.addCozinha(cozinha);
        pedido.calculaValorPedido();
        JOptionPane.showMessageDialog(null, pedido.detalhesPedido());
        break;
      case 2:
        cozinha = new Cozinha("Italiana");

        while (opcaoPrato != 4) {
          opcaoPrato = Integer
              .parseInt(JOptionPane.showInputDialog(null,
                  "Escolha um prato: \n1) Lasanha \n2) Pizza Gigante \n3) Macarrão à Bolonhesa \n4) Fechar pedido"));
          switch (opcaoPrato) {
            case 1:
              prato = new Prato("Lasanha", 23.50);
              cozinha.addPrato(prato);
              break;
            case 2:
              prato = new Prato("Pizza Gigante", 50.00);
              cozinha.addPrato(prato);
            case 3:
              prato = new Prato("Macarrão à Bolonhesa", 33.50);
              cozinha.addPrato(prato);
              break;
            default:
              opcaoPrato = 4;
              break;
          }
        }
        pedido = new Pedido();
        pedido.addCozinha(cozinha);
        pedido.calculaValorPedido();
        JOptionPane.showMessageDialog(null, pedido.detalhesPedido());
        break;
      case 3:
        cozinha = new Cozinha("Mineira");
        opcaoPrato = Integer
            .parseInt(JOptionPane.showInputDialog(null,
                "Escolha um prato: \n1) Tropeiro \n2) Vaca Atolada \n3) Frango com quiabo"));
        switch (opcaoPrato) {
          case 1:
            prato = new Prato("Tropeiro", 23.50);
            cozinha.addPrato(prato);
            break;
          case 2:
            prato = new Prato("Vaca Atolada", 20.00);
            cozinha.addPrato(prato);
          case 3:
            prato = new Prato("Frango com quiabo", 33.50);
            cozinha.addPrato(prato);
            break;
          default:
            opcaoPrato = 4;
            break;
        }
        pedido = new Pedido();
        pedido.addCozinha(cozinha);
        pedido.calculaValorPedido();
        JOptionPane.showMessageDialog(null, pedido.detalhesPedido());
        break;
      default:
        JOptionPane.showMessageDialog(null, "Opção Inválida");
        break;
    }

  }
}
