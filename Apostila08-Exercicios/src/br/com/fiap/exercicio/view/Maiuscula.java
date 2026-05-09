package br.com.fiap.exercicio.view;

import javax.swing.*;

//Faça uma classe teste chamada Maiuscula que solicite ao usuário uma
//palavra e em seguida a exiba em maiúsculo. Por exemplo, se o usuário
//digitar “cadeira”, o programa deverá retornar “CADEIRA”.
public class Maiuscula {

    public static void main(String[] args) {
        String palavra = JOptionPane.showInputDialog("Insira uma palavra abaixo:");
        System.out.println(palavra.toUpperCase());
    }

}
