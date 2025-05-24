package br.com.fiap.loja.teste;

import br.com.fiap.loja.model.Eletronico;
import br.com.fiap.loja.model.Produto;
import br.com.fiap.loja.model.Vestuario;

public class Teste {

    public static void main(String[] args) {
        //Intanciar um produto
        Produto produto = new Produto("Churros", 100, 100);

        //Calcular e exibir o valor do produto com 10% de desc.
        System.out.println(produto.calcularDesconto(10));

        //Calcular e exibir o valor do produto com o cupom de BEMVINDO
        System.out.println(produto.calcularDesconto("bemvindo"));

        //Calcular e exibir o valor de 5 itens pagos a vista
        System.out.println(produto.calcularDesconto(6,false));

        //Instanciar um Vestuario
        Vestuario camisa = new Vestuario("Camisa Branca", 50, 10, "M");

        System.out.println(camisa.calcularDesconto(3, false));

        //Instanciar um Eletronico
        Eletronico eletronico = new Eletronico("Play5", 3000, 10, 127);

        System.out.println(eletronico.calcularDesconto("eletro15"));

        System.out.println(produto);
        System.out.println(camisa);
        System.out.println(eletronico);

    }
}
