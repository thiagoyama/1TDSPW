package br.com.fiap.apostila12.view;

import br.com.fiap.apostila12.model.Produto;

import java.util.Scanner;

public class Exemplo02 {

    static void main(String[] args) {
        //Instanciar um produto com nome e preço
        Produto produto = new Produto("Churros", 15);
        Scanner leitor = new Scanner(System.in);
        //Perguntar quanto é o desconto
        System.out.println("Quanto será o desconto?");
        double desconto = leitor.nextDouble();
        //Calcular o desconto
        double valorFinal = produto.darDesconto(desconto);
        //Exibir o preço com desconto
        System.out.println("Valor com desconto: " + valorFinal);
        leitor.close();
    }
}
