package br.com.fiap.apostila07.view;

import java.util.Scanner;

public class TesteEleitores {

    //Crie uma classe TesteEleitores que leia a idade de 3 pessoas e informe a sua
    //classe eleitoral:
    //• não eleitor (abaixo de 16 anos)
    //• eleitor obrigatório (entre 18 e 65 anos)
    //• eleitor facultativo (16 , 17 anos ou maior que 65 anos)
    //Ao final da execução exibir o total de eleitores obrigatórios.
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int qtd = 0;
        for (int churros = 1; churros < 4; churros++) {
            System.out.println("Digite a idade da pessoa " + churros);
            int idade = leitor.nextInt();
            if (idade < 16) {
                System.out.println("Não eleitor");
            } else if (idade >= 18 && idade <= 65) {
                System.out.println("Eleitor obrigatório");
                qtd++;
            } else {
                System.out.println("Eleitor facultativo");
            }
        }//for
        System.out.println("Quantidade de eleitores obrigatórios: " + qtd);
    }//main
}//class
