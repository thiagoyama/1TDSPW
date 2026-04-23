package br.com.fiap.apostila07.view;

import javax.print.attribute.standard.JobSheets;
import javax.swing.*;

public class ExemploCondicional {

    public static void main(String[] args) {
        //Ler a média final do aluno
        double media = Double.parseDouble(JOptionPane.showInputDialog("Digite a média"));

        //Dizer se ele aprovado >=6, //retido <4 ou de exame  >=4 e < 6
        if (media >= 6){
            JOptionPane.showMessageDialog(null, "Aprovado!");
        } else if (media >= 4) {
            JOptionPane.showMessageDialog(null, "Exame");
        } else{
            JOptionPane.showMessageDialog(null, "Retido");
        }

    }
}
