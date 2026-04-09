package br.com.restaurante.view;

import br.com.restaurante.model.Funcionario;

public class Terminal {

    public static void main(String[] args) {
        //Criar um objeto Funcionario
        Funcionario f = new Funcionario();
        f.setNome("Nicolas"); //Alterar o nome do funcionario
        f.setId(45);
        f.setSexo('M');
        f.setAtivo(true);
        f.setSalario(15000);

        System.out.println(f.getNome()); //Recuperar o nome do funcionario
        System.out.println(f.getId());
        System.out.println(f.getSalario());
        System.out.println(f.getSexo());
        System.out.println(f.isAtivo());
    }
}
