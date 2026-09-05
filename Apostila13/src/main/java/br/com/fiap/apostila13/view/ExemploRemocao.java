package br.com.fiap.apostila13.view;

import br.com.fiap.apostila13.dao.ProdutoDao;

import java.util.Scanner;

public class ExemploRemocao {

    static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        try {
            System.out.println("Digite o código do produto que será removido");
            int codigo = leitor.nextInt();

            ProdutoDao produtoDao = new ProdutoDao();
            produtoDao.apagar(codigo);
            System.out.println("Produto removido!");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
