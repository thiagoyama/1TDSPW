package br.com.fiap.loja.model;

public class Eletronico extends Produto{

    private float voltagem;

    public Eletronico(String nome, double preco, int quantidade, float voltagem) {
        super(nome, preco, quantidade);
        this.voltagem = voltagem;
    }

    @Override
    public String toString() {
        return super.toString() + ", Voltagem: " + voltagem;
    }

    @Override
    public double calcularDesconto(String cupom){
        if (cupom.equalsIgnoreCase("eletro15")){
            return calcularDesconto(15);
        }
        return super.calcularDesconto(cupom); //chama o calcular desconto do produto
    }

    public float getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(float voltagem) {
        this.voltagem = voltagem;
    }
}
