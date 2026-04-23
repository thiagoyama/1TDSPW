package br.com.fiap.apostila07.view;

import javax.swing.*;

public class ExemploConversao {

    public static void main(String[] args) {
        //Calcular a area do retangulo
        String baseStr = JOptionPane.showInputDialog("Digite a base do retangulo");
        //Converter para double
        double base = Double.parseDouble(baseStr);

        String churros = JOptionPane.showInputDialog("Digite a altura do retangulo");
        double altura = Double.parseDouble(churros);

        double area = base * altura;

        JOptionPane.showMessageDialog(null, area);
    }

}
