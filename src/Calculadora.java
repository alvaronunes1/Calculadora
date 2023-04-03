import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculadora extends JFrame implements ActionListener {
    private JTextField display;
    private JButton botao0, botao1, botao2, botao3, botao4, botao5, botao6, botao7, botao8, botao9, botaoMais, botaoMenos, botaoMultiplicar, botaoDividir, botaoIgual, botaoLimpar;
    private int valor1 = 0, valor2 = 0, resultado = 0;
    private char operador;

    public Calculadora() {
        super("Calculadora");

        display = new JTextField(10);
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);

        botao0 = new JButton("0");
        botao1 = new JButton("1");
        botao2 = new JButton("2");
        botao3 = new JButton("3");
        botao4 = new JButton("4");
        botao5 = new JButton("5");
        botao6 = new JButton("6");
        botao7 = new JButton("7");
        botao8 = new JButton("8");
        botao9 = new JButton("9");
        botaoMais = new JButton("+");
        botaoMenos = new JButton("-");
        botaoMultiplicar = new JButton("*");
        botaoDividir = new JButton("/");
        botaoIgual = new JButton("=");
        botaoLimpar = new JButton("C");

        JPanel painelNumeros = new JPanel(new GridLayout(4, 3));
        painelNumeros.add(botao1);
        painelNumeros.add(botao2);
        painelNumeros.add(botao3);
        painelNumeros.add(botao4);
        painelNumeros.add(botao5);
        painelNumeros.add(botao6);
        painelNumeros.add(botao7);
        painelNumeros.add(botao8);
        painelNumeros.add(botao9);
        painelNumeros.add(botaoLimpar);
        painelNumeros.add(botao0);
        painelNumeros.add(botaoIgual);

        JPanel painelOperadores = new JPanel(new GridLayout(4, 1));
        painelOperadores.add(botaoMais);
        painelOperadores.add(botaoMenos);
        painelOperadores.add(botaoMultiplicar);
        painelOperadores.add(botaoDividir);

        JPanel painel = new JPanel(new BorderLayout());
        painel.add(display, BorderLayout.NORTH);
        painel.add(painelNumeros, BorderLayout.CENTER);
        painel.add(painelOperadores, BorderLayout.EAST);

        add(painel);

        botao0.addActionListener(this);
        botao1.addActionListener(this);
        botao2.addActionListener(this);
        botao3.addActionListener(this);
        botao4.addActionListener(this);
        botao5.addActionListener(this);
        botao6.addActionListener(this);
        botao7.addActionListener(this);
        botao8.addActionListener(this);
        botao9.addActionListener(this);
        botaoMais.addActionListener(this);
        botaoMenos.addActionListener(this);
        botaoMultiplicar.addActionListener(this);
        botaoDividir.addActionListener(this);
        botaoIgual.addActionListener(this);
        botaoLimpar.addActionListener(this);

        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Calculadora();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botao0) {
            display.setText(display.getText() + "0");
        }
        if (e.getSource() == botao1) {
            display.setText(display.getText() + "1");
        }
        if (e.getSource() == botao2) {
            display.setText(display.getText() + "2");
        }
        if (e.getSource() == botao3) {
            display.setText(display.getText() + "3");
        }
        if (e.getSource() == botao4) {
            display.setText(display.getText() + "4");
        }
        if (e.getSource() == botao5) {
            display.setText(display.getText() + "5");
        }
        if (e.getSource() == botao6) {
            display.setText(display.getText() + "6");
        }
        if (e.getSource() == botao7) {
            display.setText(display.getText() + "7");
        }
        if (e.getSource() == botao8) {
            display.setText(display.getText() + "8");
        }
        if (e.getSource() == botao9) {
            display.setText(display.getText() + "9");
        }
        

    }
}