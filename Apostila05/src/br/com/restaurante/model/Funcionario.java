package br.com.restaurante.model;

public class Funcionario {

    private String nome;
    private int id;
    private boolean ativo;
    private double salario;
    private char sexo;

    public String retornarSalario(){
        return formatarReal(salario);
    }

    public String retornarPlr(){
        double plr = calcularPlr();
        return formatarReal(plr);
    }

    private String formatarReal(double valor){
        return "R$ " + valor;
    }

    public double calcularPlr(){
        return salario * 3;
    }

    public void colocarEmFerias(){
        this.ativo = false;
    }

    //Getters e Setters
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
