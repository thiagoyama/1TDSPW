package br.com.fiap.veiculos.teste;

import br.com.fiap.veiculos.model.Aviao;
import br.com.fiap.veiculos.model.Cor;

public class AviaoTeste {

    public static void main(String[] args) {
        //Instanciar um Aviao
        Aviao aviao = new Aviao();

        //Colocar informações no avião
        aviao.setModelo("14 BIS");
        aviao.setComprimento(9.6);

        Cor cor = new Cor();
        cor.alterarCor(255,255,255, "Branco");

        aviao.setCor(cor);
        aviao.setAnoFabricacao(1906);
        aviao.setQuantidadeLugares(1);
        aviao.setQuantidadeTurbinas(0);
        aviao.setPrefixo("BIS");

        //Exibir as informações do avião
        System.out.println(aviao.getModelo());
        System.out.println(aviao.getAnoFabricacao());
        System.out.println(aviao.getComprimento());
        System.out.println(aviao.getPrefixo());
        System.out.println(aviao.getQuantidadeTurbinas());
        System.out.println(aviao.getCor().getNome());

    }
}
