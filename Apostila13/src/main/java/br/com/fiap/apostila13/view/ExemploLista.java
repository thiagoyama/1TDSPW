package br.com.fiap.apostila13.view;

import br.com.fiap.apostila13.dao.ProdutoDao;
import br.com.fiap.apostila13.model.Produto;

import java.sql.SQLException;
import java.util.List;

public class ExemploLista {

    static void main(String[] args) {
        try {
            ProdutoDao produtoDao = new ProdutoDao();
            List<Produto> lista = produtoDao.listar();
            for (Produto p : lista){
                System.out.println(p);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
