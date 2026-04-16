package br.com.fiap.exercicio01.view;

import br.com.fiap.exercicio01.model.Aviao;
import br.com.fiap.exercicio01.model.Cor;

public class Terminal {

    public static void main(String[] args) {
        //Criar um objeto Cor
        Cor azul = new Cor();
        //Atribuir os valores para os atributos da cor
        azul.alterarCor( 0,0,255, "Azul");

        //Criar um objeto aviao
        Aviao aviao = new Aviao();
        //Atribuir os valores para os atributos do aviao
        aviao.setAnoFabricacao(2015);
        aviao.setComprimento(80);
        aviao.setModelo("Boeing");
        aviao.setPrefixo("FIAP26");
        aviao.setCor(azul);
        aviao.setQuantidadeLugares(250);
        aviao.setQuantidadeTurbinas(2);

        //Exibir os valores do aviao (incluindo a cor)
        System.out.println(aviao.getModelo() + " " + aviao.getPrefixo());
        System.out.println("Comprimento: " + aviao.getComprimento());
        System.out.println("Lugares: " + aviao.getQuantidadeLugares());
        System.out.println("Turbinas: " + aviao.getQuantidadeTurbinas());
        System.out.println("Ano: " + aviao.getAnoFabricacao());
        System.out.println("Cor: " + aviao.getCor().getNome());

    }
}
