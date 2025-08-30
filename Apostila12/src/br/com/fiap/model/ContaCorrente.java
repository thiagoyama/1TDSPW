package br.com.fiap.model;

public class ContaCorrente {

    private double saldo;

    //Criar os métodos Sacar, Depositar e Consultar
    public void sacar(double valor) throws Exception {
        validarValor(valor);
        if (valor > saldo)
            throw new Exception("Saldo insuficiente, saldo atual " + saldo);
        saldo -= valor;
    }

    public void depositar(double valor) throws Exception {
        validarValor(valor);
        saldo += valor;
    }

    private void validarValor(double valor) throws Exception {
        if (valor < 0)
            throw new Exception("Valor não pode ser negativo");
    }

    public double consultarSaldo(){
        return saldo;
    }

}
