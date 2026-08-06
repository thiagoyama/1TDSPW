package br.com.fiap.model;

import java.security.cert.PolicyNode;

public class Pokemon {

    //Atributos
    private String tipo;
    private String nome;
    private int nivel;

    //Construtores
    public Pokemon(){}

    public Pokemon(String tipo, String nome, int nivel) {
        this.tipo = tipo;
        this.nome = nome;
        this.nivel = nivel;
    }

    //Getters e Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
