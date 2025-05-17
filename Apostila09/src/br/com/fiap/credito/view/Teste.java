package br.com.fiap.credito.view;

import br.com.fiap.credito.model.Endereco;
import br.com.fiap.credito.model.PessoaFisica;

public class Teste {

    public static void main(String[] args) {
        //Intanciar uma pessoa fisica
        PessoaFisica pf = new PessoaFisica("Lucas", "12313131313");

        //Atribuir valores aos atributos do objeto (fixo)
        pf.setRg("456465465");
        pf.setIdade(19);

        Endereco endereco = new Endereco();
        endereco.setRua("Av Paulista");
        endereco.setNumero("1100");
        pf.setEndereco(endereco);

        //Exibir os valores
        System.out.println(pf.getNome());
        System.out.println(pf.getCpf());
        System.out.println(pf.getRg());
        System.out.println(pf.getIdade());
        System.out.println(pf.getEndereco().getRua() + ", " + pf.getEndereco().getNumero());

    }
}
