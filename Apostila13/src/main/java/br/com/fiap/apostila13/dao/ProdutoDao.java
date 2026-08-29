package br.com.fiap.apostila13.dao;

import br.com.fiap.apostila13.exception.EntidadeNaoEncontradaException;
import br.com.fiap.apostila13.factory.ConnectionFactory;
import br.com.fiap.apostila13.model.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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

    public Produto buscar(int id) throws SQLException, EntidadeNaoEncontradaException {
        //Criar o Comando SQL
        PreparedStatement stmt = conexao.prepareStatement(
                "select * from t_jdbc_produto where cd_produto = ?");
        //Setar o valor no comando SQL
        stmt.setInt(1, id);
        //Executar o comando SQL
        ResultSet resultSet = stmt.executeQuery(); //Executa comandos de pesquisa
        //Validar se existe um produto no resultado, se não existir lança uma exception
        if (!resultSet.next()){
            throw new EntidadeNaoEncontradaException("Produto não encontrado");
        }
        //Recuperar as informações do ResulSet (codigo, nome, descrição, valor, estoque)
        int codigo = resultSet.getInt("cd_produto");
        String nome = resultSet.getString("nm_produto");
        String descricao = resultSet.getString("ds_produto");
        double valor = resultSet.getDouble("vl_produto");
        boolean temEstoque = resultSet.getBoolean("st_estoque");
        //Cria o produto com os dados do banco e retorna no método
        return new Produto(codigo, nome, descricao, valor, temEstoque);
    }

    public List<Produto> listar(){
        return null;
    }

    public void atualizar(Produto produto){

    }

    public void apagar(int id){

    }

}
