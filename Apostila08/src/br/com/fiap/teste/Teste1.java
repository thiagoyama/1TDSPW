package br.com.fiap.teste;

public class Teste1 {

    public static void main(String[] args) {
        String email = "Antonella@lizmacedo.com";
        String confirmacaoEmail = new String("antonella@lizmacedo.com");

        //Validar se os e-mails são iguais
        if (email.equalsIgnoreCase(confirmacaoEmail)){ //Comprar o valor ("texto") do objeto string
            System.out.println("Email confirmado!");
        } else {
            System.out.println("Emails não são iguais");
        }
        System.out.println(email);
        System.out.println(confirmacaoEmail);

    }
}
