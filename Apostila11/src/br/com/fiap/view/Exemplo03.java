package br.com.fiap.view;

import java.util.HashSet;
import java.util.Set;

public class Exemplo03 {

    static void main(String[] args) {
        //Criar um conjunto de numeros
        Set<Integer> sorteios = new HashSet<>();

        //Adicionar 3 numeros
        sorteios.add(34);
        sorteios.add(5);
        sorteios.add(6);
        sorteios.add(34); //Adicionei um numero repetido

        //Exibir a quantidade de números
        System.out.println("Números sorteados: " + sorteios.size());

        //Exibir os numéros
        System.out.println(sorteios);

        //Exibir os números com o foreach
        for (Integer churros : sorteios){
            System.out.println(churros);
        }

    }
}
