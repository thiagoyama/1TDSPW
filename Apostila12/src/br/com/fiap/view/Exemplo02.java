package br.com.fiap.view;

import java.util.Scanner;

public class Exemplo02 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //Menu: 1-Depositar 2-Sacar 3-Exibir Saldo 0-Sair
        int opcao;
        do {
            System.out.println("Escolha: \n1-Depositar \n2-Sacar \n3-Saldo \n0-Sair");
            opcao = leitor.nextInt();

            

        } while(opcao != 0);

    }//main
}//class
