public class Tenis {

    //Atributos
    String cor;
    String modelo;
    int tamanho;
    double preco;
    boolean disponivel;

    //Atributo de referencia (outra classe que iremos criar)
    Marca marca;

    //Métodos
    //Método para aumentar o preço do tenis em porcentagem (10, 20)
    void aumentarPreco(float porcentagem) {
        preco += preco * porcentagem / 100; // preco = preco + preco*porcentagem/100;
    }

    double aplicarDesconto(float porcentagem){
        double valorComDesconto;
        valorComDesconto = preco - (preco*porcentagem)/100;
        return valorComDesconto;
    }

}
