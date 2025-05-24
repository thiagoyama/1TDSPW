package br.com.fiap.loja.model;

public class Vestuario extends Produto {

    private String tamanho;

    public Vestuario(String nome, double preco, int quantidade, String tamanho) {
        super(nome, preco, quantidade);
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tamanho: " + tamanho;
    }

    //Se a quantidade for maior do que 2, desconto de 30% de desconto
    //Pagamento a vista tem 10% de desconto
    @Override
    public double calcularDesconto(int quantidade, boolean parcelado){
        int desconto = 0;
        if (quantidade > 2)
            desconto = 30;
        if (!parcelado)
            desconto += 10;
        return calcularDesconto(desconto);
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
}
