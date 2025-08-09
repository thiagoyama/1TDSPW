package br.com.fiap.view;

import br.com.fiap.model.Disciplina;

import javax.swing.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Exemplo02 {

    public static void main(String[] args) {
        //Criar uma lista de disciplina
        List<Disciplina> disciplinas = new ArrayList<>();

        int opcao = -1;
        while (opcao != 0) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha: \n1-Cadastrar \n2-Listar \n0-Sair"));
            if (opcao == 1) {
                //Ler do usuário os valores dos atributos da disciplina
                String nome = JOptionPane.showInputDialog("Digite o nome da disciplina");
                String categoria = JOptionPane.showInputDialog("Digite a categoria da disciplina");
                int cargaHoraria = Integer.parseInt(JOptionPane.showInputDialog("Digite a carga horária"));

                //Instanciar uma disciplina com os valores informados
                Disciplina disciplina = new Disciplina(nome, cargaHoraria, categoria);

                //Adicionar uma disciplina na lista
                disciplinas.add(disciplina);
            } else if (opcao == 2) {
                //Exibir todas as disciplinas da lista
                System.out.println("********** DISCIPLINAS *************");
                for (int i = 0; i < disciplinas.size(); i++) {
                    //JOptionPane.showMessageDialog(null, disciplinas.get(i));
                    System.out.println(disciplinas.get(i));
                }//for
            }//else
        }//while
        JOptionPane.showMessageDialog(null, "Finalizando o sistema");
    }//main
}//class
