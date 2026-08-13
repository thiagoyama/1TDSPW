package br.com.fiap.apostila12.model;

public class Produto {

    private String nome;
    private double preco;

    public double darDesconto(double desconto){
        //validar se o desconto eh maior que o preco
        if (desconto > preco){
             throw new RuntimeException("Desconto não pode ser maior que preço");
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
