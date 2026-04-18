package br.com.fiap.exercicio.view;

import br.com.fiap.exercicio.model.Funcionario;
import br.com.fiap.exercicio.model.Profissao;

import java.util.Scanner;

public class Terminal {

    public static void main(String[] args) {
        //Ler os dados do funcionário
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome");
        String nome = leitor.next() + leitor.nextLine();

        System.out.println("Digite a matricula");
        long matricula = leitor.nextLong();

        System.out.println("Digite o salario");
        double salario = leitor.nextDouble();

        System.out.println("Digite o nome da profissao");
        String nomeProfissao = leitor.next() + leitor.nextLine();

        //Criar o objeto funcionario com os dados
        Profissao p = new Profissao(nomeProfissao);
        Funcionario f = new Funcionario(matricula, nome, p);
        f.setSalario(salario);

        //Exibir os dados do funcionário
        System.out.println(f.exibirDados());

    }
}
