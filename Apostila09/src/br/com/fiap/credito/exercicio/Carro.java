package br.com.fiap.credito.exercicio;

public class Carro extends Veiculo {

    private int quantidadePortas;
    private String placa;
    private float motor = 1;

    public Carro(String modelo, Cor cor, String placa){
        super(modelo, cor);
        this.placa = placa;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public float getMotor() {
        return motor;
    }

    public void setMotor(float motor) {
        this.motor = motor;
    }
}
