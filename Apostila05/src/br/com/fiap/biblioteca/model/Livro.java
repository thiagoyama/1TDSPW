package br.com.fiap.biblioteca.model;

public class Livro {

    // atributos
    private String titulo;
    private int paginas;
    private boolean disponivel;

    // métodos
    void emprestar() {
        disponivel = false;
    }

    //Getters e Setters
    //Leitura
    public String getTitulo() {
        return titulo;
    }

    public int getPaginas(){
        return paginas;
    }
    //Quando for boolean, pode ser getXXXX ou isXXXX
    public boolean isDisponivel(){
        return disponivel;
    }

    //Escrita
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setPaginas(int paginas){
        this.paginas = paginas;
    }

    public void setDisponivel(boolean disponivel){
        this.disponivel = disponivel;
    }

}

