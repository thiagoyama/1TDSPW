package br.com.fiap.apostila07.view;

import javax.swing.*;

public class ExemploSwitch {

    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º número"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º número"));

        String op = JOptionPane.showInputDialog("Operação? (+, -, /, *)");

        switch (op){
            case "+":
                JOptionPane.showMessageDialog(null, n1 + n2);
                break;
            case "-":
                
        }

    }
}
