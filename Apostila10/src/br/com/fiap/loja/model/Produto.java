package br.com.fiap.loja.model;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public double calcularDesconto(int porcentagem){
        double valor = preco - ((preco/100)*porcentagem);
        return valor;
    }

    //Se a quantidade for maior do que 5, desconto de 20% senão 5% de desconto
    //A vista tem mais 5% de desconto
    public double calcularDesconto(int quantidade, boolean parcelado){
        int porcentagem = 0;
        if (quantidade > 5){
            porcentagem = 20;
        } else{
            porcentagem = 5;
        }
        if (!parcelado){
            porcentagem += 5;
        }
        return calcularDesconto(porcentagem);
    }

    //Calcula o desconto com cupom FIAP30 -> 30%, BEMVINDO -> 25%
    

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

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
