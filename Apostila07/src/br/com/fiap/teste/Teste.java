package br.com.fiap.teste;

import javax.swing.*;

public class Teste {

    //Criar uma "calculadora" com as operações +, -, / e *
    //Usuário informa um número, a operação que será realizada e o outro número
    public static void main(String[] args) {
        //Ler o 1 número
        String valor = JOptionPane.showInputDialog("Digite um número"); //Lê uma String
        double n1 = Double.parseDouble(valor); //converte a String em um double
        //Ler o operador
        String operador = JOptionPane.showInputDialog("Digite a operação (+,-,/,*)");
        //Ler o segundo número
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro número"));

        //Calcular o resultado
        double resultado = 0;
        switch (operador){
            case "+" :
                resultado = n1 + n2;
                break;
            case "-":
                resultado = n1 - n2;
                break;
            case "/":
                resultado = n1 / n2;
                break;
            case "*":
                resultado = n1 * n2;
                break;
            default:
                System.out.println("Operador inválido");
        }
        System.out.println("Resultado: " + resultado);
    }
}
