package br.com.fiap.exercicio01.model;

public class Aluno {

    public String nome;
    public double cp1;
    public double cp2;
    public double sprint1;
    public double sprint2;
    public double gs;

    public double calcularMedia(){
        double mediaCp = (cp1 + cp2)/ 2;
        double mediaChallenge = (sprint1 + sprint2) / 2;
        double mediaFinal = mediaChallenge * 0.2 + mediaCp * 0.2 + gs * 0.6;
        return mediaFinal;
    }

}
