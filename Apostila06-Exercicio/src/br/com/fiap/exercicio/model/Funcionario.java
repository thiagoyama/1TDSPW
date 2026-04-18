package br.com.fiap.exercicio.model;

public class Funcionario {

    private String nome;
    private long matricula;
    private Profissao profissao;
    private double salario;

    //Construtor padrão (vazio)
    public Funcionario(){}

    //Construtor com a matricula
    public Funcionario(long matricula){
        this.matricula = matricula;
    }

    //Construtor com a matricula e nome
    public Funcionario(long matricula, String nome){
        this(matricula);
        //this.matricula = matricula;
        this.nome = nome;
    }

    //Construtor com a matricula, nome e profissao
    public Funcionario(long matricula, String nome, Profissao profissao){
        this(matricula, nome);
        //this.matricula = matricula;
        //this.nome = nome;
        this.profissao = profissao;
    }

    public String exibirDados(){
        return "Nome: " + nome + ", matricula: " + matricula + ", salario: " + salario + ", profissão: " + profissao.getNome();
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public Profissao getProfissao() {
        return profissao;
    }

    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
