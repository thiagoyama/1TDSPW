package br.com.fiap.apostila13.view;

import br.com.fiap.apostila13.dao.ProdutoDao;
import br.com.fiap.apostila13.model.Produto;

import java.util.Scanner;

public class ExemploAtualizacao {

    static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        try {
            //Ler os dados do produto
            System.out.println("Digite o código do produto");
            int codigo = leitor.nextInt();

            System.out.println("Digite o nome do produto");
            String nome = leitor.next() + leitor.nextLine();

            System.out.println("Digite a descrição do produto");
            String descricao = leitor.next() + leitor.nextLine();

            System.out.println("Digite o valor do produto");
            double valor = leitor.nextDouble();

            System.out.println("Digite se tem estoque (true/false)");
            boolean estoque = leitor.nextBoolean();
            //Instanciar o produto com os dados
            Produto produto = new Produto(codigo, nome, descricao, valor, estoque);
            //Instanciar o ProdutoDao
            ProdutoDao dao = new ProdutoDao();
            //Chamar o método do DAO para atualizar
            dao.atualizar(produto);
            System.out.println("Produto atualizado!");
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }//main
}//class
