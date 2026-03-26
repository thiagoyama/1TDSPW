package br.com.fiap.loja.view;

import br.com.fiap.loja.model.Fornecedor;
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

        //Ler os dados (nome e cnpj) do fornecedor
        System.out.println("Digite o cnpj do fornecedor");
        String cnpj = entrada.next() + entrada.nextLine();

        System.out.println("Digite o nome do fornecedor");
        String nomeFornecedor = entrada.next() + entrada.nextLine();

        //Instanciar o fornecedor
        Fornecedor f = new Fornecedor();

        //Adicionar os valores no fornecedor
        f.cnpj = cnpj;
        f.nome = nomeFornecedor;

        //Colocar o fornecedor no produto
        product.fornecedor = f;

        //Exibir os dados do fornecedor do produto
        System.out.println("Nome fornecedor: " + product.fornecedor.nome);
        System.out.println("CNPJ fornecedor: " + product.fornecedor.cnpj);

        //Exibir as informações do objeto produto
        System.out.println(product.nome);
        System.out.println(product.preco);
        System.out.println(product.codigo);
        System.out.println(product.disponivel);

        double promocao = product.calcularDesconto();
        System.out.println("Desconto: " + promocao);

        System.out.println("Qual a % de aumento?");
        double porcentagem = entrada.nextDouble();

        product.aumentarPreco(porcentagem);

        System.out.println("Novo preço: " + product.preco);
    }
}
