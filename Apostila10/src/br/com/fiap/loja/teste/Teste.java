package br.com.fiap.loja.teste;

import br.com.fiap.loja.model.Produto;

public class Teste {

    public static void main(String[] args) {
        //Intanciar um produto
        Produto produto = new Produto();
        //Atribuir um valor ao produto
        produto.setPreco(100);
        //Calcular e exibir o valor do produto com 10% de desc.
        System.out.println(produto.calcularDesconto(10));
    }

}
