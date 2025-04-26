package br.com.fiap.loja.view;

import br.com.fiap.loja.model.Cliente;


public class Principal {

    public static void main(String[] args) {
        //Instanciar o Cliente
        Cliente cliente = new Cliente("Carlos", 19, "11 556465-84546", true);

        //Exibir os dados do cliente
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Telefone: " + cliente.getTelefone());
        System.out.println("Idade: " + cliente.getIdade());
        System.out.println("VIP: " + cliente.isVip());
    }
}
