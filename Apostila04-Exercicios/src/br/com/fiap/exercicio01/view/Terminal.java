package br.com.fiap.exercicio01.view;

import br.com.fiap.exercicio01.model.Aluno;
import java.util.Scanner;

public class Terminal {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Aluno aluno = new Aluno();

        //Ler os dados do aluno
        System.out.println("Digite o nome");
        aluno.nome = leitor.next() + leitor.nextLine();

        System.out.println("Digite a nota da cp1");
        aluno.cp1 = leitor.nextDouble();

        System.out.println("Digite a nota da cp2");
        aluno.cp2 = leitor.nextDouble();

        System.out.println("Digite a nota da sprint 1");
        aluno.sprint1 = leitor.nextDouble();

        System.out.println("Digite a nota da sprint 2");
        aluno.sprint2 = leitor.nextDouble();

        System.out.println("Digite a nota da GS");
        aluno.gs = leitor.nextDouble();

        //Calcular a média
        double media = aluno.calcularMedia();

        //Exibir a média
        System.out.println("A média do " + aluno.nome + " é " + media);
    }
}
