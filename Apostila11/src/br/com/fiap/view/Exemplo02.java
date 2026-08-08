package br.com.fiap.view;

import br.com.fiap.model.Pokemon;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Exemplo02 {

    static void main(String[] args) {
        //Criar uma lista de Pokemons (pokedex)
        List<Pokemon> pokedex = new ArrayList<>();

        //Instanciando 3 pokemons
        Pokemon zubat = new Pokemon("Sombrio", "Zubat", 5);
        Pokemon pigeot = new Pokemon("Voador", "Pigeout", 8);
        Pokemon miau = new Pokemon("Normal", "Miau", 5);

        //Adicionar os pokemons na lista
        pokedex.add(zubat); //0
        pokedex.add(pigeot); //1
        pokedex.add(miau); //2

        //Exibir a quantide de pokemons
        System.out.println("Pokedex possui " + pokedex.size() + " pokemons");

        //Exibir os dados dos pokemons
        System.out.println("Utilizando for");
        for (int i=0; i< pokedex.size(); i++){
            System.out.println((i + 1) + " - " + pokedex.get(i));
        }

        System.out.println("Utilizando foreach");
        for (Pokemon churros : pokedex){
            System.out.println(churros);
        }

    }
}
