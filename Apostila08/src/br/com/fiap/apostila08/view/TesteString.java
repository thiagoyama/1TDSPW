package br.com.fiap.apostila08.view;

import javax.swing.*;

public class TesteString {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o nome");
        System.out.println(nome + " é aluno da \"FIAP\".\nVamos no Evento!");

        //Verificar se o nome é "Jose" "jose" "jOSe"
        if (nome.equalsIgnoreCase("JOSE")){
            System.out.println("Nome é Jose");
        } else {
            System.out.println("Não é o Jose");
        }

        //Exibir a quantidade de caracteres do nome
        System.out.println("Qtd de caracteres: " + nome.length());

        //Imprimir o nome na vertical
        for (int i = 0; i < nome.length(); i++){
            System.out.println(nome.charAt(i));
        }

    }//main
}//class
