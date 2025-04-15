package br.com.fiap.veiculos.model;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Data date = new Data();
        System.out.println("Coloque o dia");
        date.setDia(reader.nextInt());

        System.out.println("Coloque o mês");
        date.setMes(reader.nextInt());

        System.out.println("Coloque o ano");
        date.setAno(reader.nextInt());

        System.out.println(date.returnDate());
        System.out.printf(date.resturnDateMonth());
    }
}
