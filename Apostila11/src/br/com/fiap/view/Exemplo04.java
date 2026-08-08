package br.com.fiap.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Exemplo04 {

    static void main(String[] args) {
        //Chave é o nome e o valor é o ano de nascimento
        Map<String, Integer> registro = new HashMap<>();

        //Adicionar 3 registros
        registro.put("Juliana", 1999);
        registro.put("Rodrigo", 2000);
        registro.put("Gabriel", 1999);
        registro.put("Gabriel", 2025); //Substituir o valor

        //Exibir a quantidade de registros
        System.out.println("Quantidade de registros: " + registro.size());

        //Recuperar o ano de nascimento da Juliana
        System.out.println("Ano de nascimento da Juliana: " + registro.get("Juliana"));

        //Recuperar o ano de nascimento do Adalto
        System.out.println("Ano de nascimento do Adalto: " + registro.get("Adalto"));

        //Exibir todos os nomes e anos de nascimento (for)
        Set<String> chaves = registro.keySet(); //Recupera as chaves do mapa
        //Percorrer as chaves
        for (String chave : chaves ){
            //Exibe a chave e o valor que está no mapa da chave
            System.out.println(chave + " - " + registro.get(chave));
        }
    }
}
