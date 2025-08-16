package br.com.fiap.exercicio.view;

import br.com.fiap.exercicio.model.Aluno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {
        //Lista para armazenar os alunos
        List<Aluno> alunos = new ArrayList<>();

        Scanner leitor = new Scanner(System.in);

        do {
            //Ler os dados do aluno
            System.out.println("Digite o RM");
            int rm = leitor.nextInt();

            System.out.println("Digite o nome");
            String nome = leitor.next() + leitor.nextLine();

            System.out.println("Digite a idade");
            int idade = leitor.nextInt();

            System.out.println("Digite a nota 1");
            double nota1 = leitor.nextDouble();

            System.out.println("Digite a nota 2");
            double nota2 = leitor.nextDouble();

            //Instanciar o aluno com dados
            Aluno aluno = new Aluno(rm, nome, idade, nota1, nota2);

            //Cadastrar o aluno na lista
            alunos.add(aluno);

            //Perguntar se o usuario deseja cadastrar mais 1 aluno S-Sim N-Não...
            System.out.println("Deseja cadastrar mais um aluno? S-Sim N-Não");
        } while (!leitor.next().equalsIgnoreCase("N"));

        //Exibir a quantidade de alunos
        System.out.println("Quantidade de alunos: " + alunos.size());

        //Exibir os alunos registrados
        for (Aluno a : alunos){
            System.out.println(a);
        }

    }//main
}//class
