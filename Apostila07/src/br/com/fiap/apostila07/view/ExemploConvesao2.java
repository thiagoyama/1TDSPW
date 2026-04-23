package br.com.fiap.apostila07.view;

public class ExemploConvesao2 {

    public static void main(String[] args) {
        int rm = 123;
        //short x = rm; não permite pq o int é maior que short
        long y = rm;
        short x = (short) rm; //cast para forçar o int ser um short
    }
}
