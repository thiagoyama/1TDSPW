package br.com.fiap.apostila12.model;

import br.com.fiap.apostila12.exception.CupomInvalidoException;
import br.com.fiap.apostila12.exception.DescontoAcimaDoPrecoException;

public class Produto {

    private String nome;
    private double preco;

    public double darDesconto(String cupom) throws CupomInvalidoException {
        //O cupom não pode ser vazio, (null, "") e tem que conter mais de 5 caracteres
        if (cupom.isBlank() || cupom.length() < 5) {
            //Lançar a exceção CupomInvalidoException (Filha de Exception -> checked)
            throw new CupomInvalidoException("Cupom inválido");
        }
        //Validar o cupom FIAP20 -> 20% de desconto
        if (cupom.equals("FIAP20")) {
            return preco * 0.8;
        }
        return preco;
    }

//    public double aumentarPreco(int porcentagem){
//        //A % não pode ser negativa
//        //Se for negativa, lança a exception PorcentagemNegativaException (filha de exception)
//        //Aumenta o preço do produto
//    }

    public double darDesconto(double desconto){
        //validar se o desconto eh maior que o preco
        if (desconto > preco){
             throw new DescontoAcimaDoPrecoException("Desconto não pode ser maior que preço");
        }
        //validar se o desconto eh positivo
        if (desconto < 0) {
            throw new RuntimeException("Desconto não pode ser negativo");
        }
        return preco - desconto;
    }

    public Produto(){}

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
