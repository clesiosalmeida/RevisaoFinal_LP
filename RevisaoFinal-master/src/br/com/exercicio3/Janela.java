package br.com.exercicio3;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.Container;
import java.awt.event.ActionEvent;

public class Janela extends JFrame implements ActionListener {
  private JButton btnOk;

  public void exibeJanela() throws ParseException {
    Container janela = getContentPane();
    setLayout(null);

    JLabel lbNome = new JLabel("Nome: ");
    JLabel lbEmail = new JLabel("Email: ");
    JLabel lbTelefone = new JLabel("Telefone: ");
    lbNome.setBounds(50, 40, 50, 20);
    lbEmail.setBounds(50, 80, 50, 20);
    lbTelefone.setBounds(50, 120, 70, 20);

    JTextField txtNome = new JTextField();
    JTextField txtEmail = new JTextField();
    MaskFormatter mascaraTelefone = new MaskFormatter("(##) #####-####");
    JTextField txtTelefone = new JFormattedTextField(mascaraTelefone);
    txtNome.setBounds(90, 40, 200, 20);
    txtEmail.setBounds(90, 80, 200, 20);
    txtTelefone.setBounds(110, 120, 180, 20);

    btnOk = new JButton("Ok");
    btnOk.setBounds(90, 160, 50, 20);
    btnOk.addActionListener(this);

    janela.add(lbNome);
    janela.add(lbEmail);
    janela.add(lbTelefone);
    janela.add(txtNome);
    janela.add(txtEmail);
    janela.add(txtTelefone);
    janela.add(btnOk);
    setSize(350, 350);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocation(500, 200);
    setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    JOptionPane.showMessageDialog(rootPane, "Cadastro realizado com sucesso!");
  }
}