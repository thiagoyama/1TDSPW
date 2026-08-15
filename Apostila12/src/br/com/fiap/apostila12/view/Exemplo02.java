package br.com.fiap.apostila12.view;

import br.com.fiap.apostila12.exception.CupomInvalidoException;
import br.com.fiap.apostila12.exception.DescontoAcimaDoPrecoException;
import br.com.fiap.apostila12.model.Produto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo02 {

    static void main(String[] args) {
        //Instanciar um produto com nome e preço
        Produto produto = new Produto("Churros", 15);
        Scanner leitor = new Scanner(System.in);
        try {
            //Perguntar quanto é o desconto
            System.out.println("Quanto será o desconto?");
            double desconto = leitor.nextDouble();
            //Calcular o desconto
            double valorFinal = produto.darDesconto(desconto);
            //Exibir o preço com desconto
            System.out.println("Valor com desconto: " + valorFinal);

            //Ler um cupom
            System.out.println("Digite um cupom");
            String cupom = leitor.next();
            //Dar o desconto com o cupom
            System.out.println(produto.darDesconto(cupom));

            //Aumentar preço

        } catch (CupomInvalidoException e){
            System.err.println(e.getMessage() + " CUPOM INVALIDO");
        } catch (InputMismatchException e){
            System.err.println("O desconto deve ser um número");
        } catch (DescontoAcimaDoPrecoException e) {
            System.err.println(e.getMessage());
            System.err.println("O desconto deve ser menor do que " + produto.getPreco());
        } catch (RuntimeException  e) {
            System.err.println(e.getMessage());
        } finally {
            leitor.close();
        }
    }//main
}//class
