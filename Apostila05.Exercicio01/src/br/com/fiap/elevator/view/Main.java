package br.com.fiap.elevator.view;

import br.com.fiap.elevator.model.Elevador;

public class Main {
    public static void main(String[] args) {
        Elevador elevator = new Elevador();
        elevator.init(10, 22);
        elevator.sobe();
        elevator.sobe();
        elevator.sobe();
        elevator.sobe();
        elevator.entra();
        System.out.printf("Total de pessoas: %s\n",elevator.getPessoasNoElevador());
        elevator.entra();
        System.out.printf("Total de pessoas: %s\n",elevator.getPessoasNoElevador());
        elevator.desce();
        System.out.printf("Andar atual: %s\n",elevator.getAndarAtual());
        elevator.entra();
        System.out.printf("Total de pessoas: %s\n",elevator.getPessoasNoElevador());
        elevator.sai();
        System.out.printf("Total de pessoas: %s\n",elevator.getPessoasNoElevador());
        elevator.sobe();
        System.out.printf("Andar atual: %s\n",elevator.getAndarAtual());
    }
}
