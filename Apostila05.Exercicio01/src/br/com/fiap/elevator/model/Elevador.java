package br.com.fiap.elevator.model;

public class Elevador {
    private int andarAtual = 0;
    private int totalAndares;
    private int capacidade;
    private int pessoasNoElevador;

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getPessoasNoElevador() {
        return pessoasNoElevador;
    }

    public void setPessoasNoElevador(int pessoasNoElevador) {
        this.pessoasNoElevador = pessoasNoElevador;
    }

    public void init(int capacidade, int totalAndares) {
        setCapacidade(capacidade);
        setTotalAndares(totalAndares);
    }

    public void entra() {
        setPessoasNoElevador(pessoasNoElevador += 1);
    }

    public void sai() {
        setPessoasNoElevador(pessoasNoElevador -= 1);
    }

    public void sobe() {
        setAndarAtual(andarAtual += 1);
    }

    public void desce() {
        setAndarAtual(andarAtual -= 1);
    }
}
