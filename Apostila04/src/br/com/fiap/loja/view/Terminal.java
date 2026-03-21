package br.com.fiap.loja.view;

import br.com.fiap.loja.model.Produto;
import java.util.Scanner;

//Responsável por interagir com o usuário
public class Terminal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Ler as informações do Produto (sem fornecedor por enquanto)
        System.out.println("Digite o nome do produto");
        String nomeProduto = entrada.next() + entrada.nextLine();

        System.out.println("Digite o valor do produto");
        double valor = entrada.nextDouble();

        System.out.println("Digite o código do produto");
        int codigo = entrada.nextInt();

        System.out.println("O produto está disponível? (true/false)");
        boolean disponivel = entrada.nextBoolean();

        //Instanciar a classe produto
        Produto product = new Produto();

        //Colocar as informações no objeto produto
        product.nome = nomeProduto;
        product.preco = valor;
        product.codigo = codigo;
        product.disponivel = disponivel;

        //Exibir as informações do objeto produto
        System.out.println(product.nome);

    }
}
