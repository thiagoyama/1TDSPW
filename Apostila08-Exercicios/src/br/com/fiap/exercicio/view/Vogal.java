package br.com.fiap.exercicio.view;

import javax.swing.*;

//Crie uma classe teste chamada Vogal que solicite ao usuário uma String e
//em seguida exiba o conteúdo desta String de forma que todas as vogais
//(a,e,i,o,u) sejam representadas por * (asterisco). Por exemplo, se o usuário
//digitar "cadeira", o programa deverá exibir "c*d**r*".
public class Vogal {

    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Digite um texto");

        //Substituir as vogais por *
        String vogais = "aeiouAEIOU";

        //Laço para percorrer as vogais
        for (int i=0; i< vogais.length(); i++) {
            //Para cada volta, substituir por *
            texto = texto.replace(vogais.charAt(i), '*');
        }
        //Exibir a palavra
        System.out.println(texto);
    }//main
}//class
