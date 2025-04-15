package br.com.fiap.veiculos.view;

import br.com.fiap.veiculos.model.Aviao;
import br.com.fiap.veiculos.model.Cor;

public class Main {
    public static void main(String[] args) {
        Aviao aviao = new Aviao();
        Cor cor = new Cor("Carbono",15,15,15 );
        aviao.setModelo("14 Bis");
        aviao.setAnoFabricacao(1958);
        aviao.setComprimento(10);
        aviao.setQuantidadeLugares(200);
        aviao.setQuantidadeTurbinas(2);
        aviao.setPrefixo("Av - ");
        aviao.setCor(cor);

        System.out.println(aviao.getModelo());
        System.out.println(aviao.getAnoFabricacao());
        System.out.println(aviao.getComprimento());
        System.out.println(aviao.getPrefixo());
        System.out.println(aviao.getQuantidadeTurbinas());
        System.out.println(aviao.getCor().getNome());
    }
}
