package br.com.fiap.portal.view;

import br.com.fiap.portal.model.Aluno;
import br.com.fiap.portal.model.Endereco;

import javax.swing.*;
import java.util.Scanner;

public class Terminal {

    public static void main(String[] args) {
        //Ler os dados do aluno
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o nome:");
        String nome = leitor.next() + leitor.nextLine();

        System.out.println("Informe o cpf");
        String cpf = leitor.next() + leitor.nextLine();

        System.out.println("Informe a idade");
        int idade = leitor.nextInt();

        System.out.println("Informe o rm");
        int rm = leitor.nextInt();

        System.out.println("Informe o turma:");
        String turma = leitor.next() + leitor.nextLine();

        //Ler os dados do endereço
        System.out.println("Digite o logradouro");
        String logradouro = leitor.next() + leitor.nextLine();

        System.out.println("Digite o complemento");
        String complemento = leitor.next() + leitor.nextLine();

        //Criar o endereço e setar os dados
        Endereco end = new Endereco(logradouro, complemento);
        //Criar o objeto aluno e atribuir os valores nos atributos
        Aluno aluno = new Aluno(nome, cpf, idade, end, rm, turma);
//        aluno.setRm(rm);
//        aluno.setIdade(idade);
//        aluno.setNome(nome);
//        aluno.setTurma(turma);
//        aluno.setCpf(cpf);
        //Setar o endereço no aluno
//        aluno.setEndereco(end);

        //Exibir os valores do objeto
        System.out.println(aluno.getNome() + ", rm: " + aluno.getRm() + ", cpf: " + aluno.getCpf());
        System.out.println(aluno.getTurma() + ", idade: " + aluno.getIdade());
        //Exibir os dados do endereço do aluno
        System.out.println(aluno.getEndereco().getLogradouro() + ", " + aluno.getEndereco().getComplemento());

    }//main
}//class
