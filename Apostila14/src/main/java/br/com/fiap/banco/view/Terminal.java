package br.com.fiap.banco.view;

import br.com.fiap.banco.dao.FuncionarioDao;
import br.com.fiap.banco.model.Funcionario;

import java.util.List;
import java.util.Scanner;

public class Terminal {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        try {
            //Criar um FuncionarioDao
            FuncionarioDao dao = new FuncionarioDao();
            int opcao;
            do {
                //Menu com as opções do CRUD 1-Cadastrar 2-Atualizar 3-Pesquisar por Id 4-Listar 5-Remover 0-Sair
                System.out.println("Escolha: \n1-Cadastrar\n2-Atualizar \n3-Pesquisar por Id \n4-Listar \n5-Remover \n0-Sair");
                opcao = leitor.nextInt();
                switch (opcao) {
                    case 1:
                        //Cadastro de funcionario
                        Funcionario funcionario = lerFuncionario(leitor);
                        dao.cadastrar(funcionario);
                        System.out.println("Funcionario cadastrado com sucesso!");
                        break;
                    case 2:
                        //Atualizar funcionario
                        funcionario = lerFuncionario(leitor);
                        dao.atualizar(funcionario);
                        System.out.println("Funcinario atualizado com sucesso!");
                        break;
                    case 4:
                        List<Funcionario> lista = dao.listar();
                        for (Funcionario f : lista){
                            System.out.println(f);
                        }
                        break;
                    case 0:
                        System.out.println("Finalizando o sistema");
                        break;
                    default:
                        System.out.println("Opção inválida");
                }
            } while (opcao != 0);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//main

    private static Funcionario lerFuncionario(Scanner leitor) {
        System.out.println("Digite o código do funcionario");
        int codigo = leitor.nextInt();
        System.out.println("Digite o nome do funcionario: ");
        String nome = leitor.next() + leitor.nextLine();
        System.out.println("Digite o salario do Funcionario: ");
        double salario = leitor.nextDouble();
        System.out.println("Digite o email do Funcionario: ");
        String email = leitor.next() + leitor.nextLine();
        System.out.println("O funcionário está ativo? (true/false)");
        boolean ativo = leitor.nextBoolean();
        Funcionario funcionario = new Funcionario(codigo, nome, salario, ativo, email);
        return funcionario;
    }
}//class
