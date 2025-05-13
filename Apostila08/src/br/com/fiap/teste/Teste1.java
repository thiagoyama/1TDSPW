package br.com.fiap.teste;

public class Teste1 {

    public static void main(String[] args) {
        String email = "churros@lizmacedo.com";
        String confirmacaoEmail = new String("antonella@lizmacedo.com");

        //Validar se os e-mails são iguais
        if (email.equalsIgnoreCase(confirmacaoEmail)){ //Comprar o valor ("texto") do objeto string
            System.out.println("Email confirmado!");
        } else {
            System.out.println("Emails não são iguais");
        }
        System.out.println(email);
        System.out.println(confirmacaoEmail);

        //Retonar a posição do @ do email
        System.out.println("Posição: " + email.indexOf("@"));

        //Imprimir a quantidade de caracteres do e-mail
        System.out.println("Qtd de caracteres: " + email.length());

        //Exibir o e-mail (sem o dominio)
        String qualquerCoisa = email.substring(0, email.indexOf("@"));
        System.out.println("Email sem dominio: " + qualquerCoisa);

        //Exibir o dominio do email
        String dominio = email.substring(email.indexOf("@") + 1);
        System.out.println("Dominio: " + dominio);

    }
}
