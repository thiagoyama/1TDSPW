package br.com.fiap.apostila08.view;

import javax.swing.*;

public class TesteString2 {

    public static void main(String[] args) {
        String email = JOptionPane.showInputDialog("Digite o email");
        //Validar se é um e-mail válido (possui @ e .)
        //email.contains("@") verifica se contém uma String
        if (email.indexOf("@") == -1 || email.indexOf(".") == -1){
            System.out.println("Não é um e-mail válido");
        } else {
            System.out.println("É um e-mail válido");
            //Exibir o email (sem o dominio ->ex. thiago@fiap.com.br, quero exibir thiago)
            String emailSemDominio = email.substring(0, email.indexOf("@"));
            System.out.println(emailSemDominio);

            //Exibir o domininio (ex. thiago@fiap.com.br, quero exibir fiap.com.br)
            String dominio = email.substring(email.indexOf("@") + 1);
            System.out.println(dominio);
        }
    }
}
