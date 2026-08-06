package br.com.fiap.view;

import java.util.ArrayList;
import java.util.List;

public class Exemplo01 {

    static void main(String[] args) {
        //criar uma variavel para armazenar o nome da turma
        String turma = "1TDSPW";

        //criar uma variável para armazenar o nome dos alunos da turma
        List<String> alunos = new ArrayList();
        //Adicionar dois nomes na lista
        alunos.add("Gabriel");
        alunos.add("Alexandre");
        alunos.add(1, "Julia"); //Adicionar na posição
        alunos.set(2,"Adalto"); //Substituir

        //Exibir quantos alunos tem na lista
        System.out.println("Quantidade de alunos: " + alunos.size());

        //Verificar se o "Gabriel" está na lista
        System.out.println("Gabriel está na lista? " + alunos.contains("Gabriel"));

        //Verificar se a lista está vazia
        if (alunos.isEmpty())
            System.out.println("A lista está vazia");
        else
            System.out.println("A lista possui nomes");

        //Recuperar o aluno da posição 2
        System.out.println(alunos.get(2));

        //Exibir todos os alunos
        System.out.println(alunos);
    }
}
