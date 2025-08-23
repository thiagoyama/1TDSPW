package br.com.fiap.model;

public class ContaCorrente {

    private double saldo;

    //Criar os métodos Sacar, Depositar e Consultar
    public void sacar(double valor){
        saldo -= valor;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public double consultarSaldo(){
        return saldo;
    }

}
