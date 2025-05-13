package br.com.fiap.credito.model;

public class PessoaJuridica extends Pessoa {

    private String cnpj;

    private boolean ativo;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
