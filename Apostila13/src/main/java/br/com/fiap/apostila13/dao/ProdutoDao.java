package br.com.fiap.apostila13.dao;

import br.com.fiap.apostila13.factory.ConnectionFactory;
import br.com.fiap.apostila13.model.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

//DAO -> Data Access Object
//Resposável por realizar as ações no Banco
public class ProdutoDao {

    private Connection conexao;

    public ProdutoDao() throws SQLException, ClassNotFoundException {
        conexao = ConnectionFactory.getConnection();
    }

    //CRUD (Create, Read, Update, Delete)
    public void cadastrar(Produto produto) throws SQLException {
        //Criar o comando SQL
        PreparedStatement stmt = conexao
                .prepareStatement("insert into t_jdbc_produto (cd_produto, " +
                        "nm_produto, ds_produto, vl_produto, st_estoque) " +
                        "values (?, ?, ?, ?, ?)");
        //Setar os paramentros no comando SQL
        stmt.setInt(1, produto.getCodigo());
        stmt.setString(2, produto.getNome());
        stmt.setString(3, produto.getDescricao());
        stmt.setDouble(4, produto.getValor());
        stmt.setBoolean(5, produto.isTemEstoque());
        //Executar o comando SQL no banco
        stmt.executeUpdate();
    }

    public Produto buscar(int id){
        return null;
    }

    public List<Produto> listar(){
        return null;
    }

    public void atualizar(Produto produto){

    }

    public void apagar(int id){

    }

}
