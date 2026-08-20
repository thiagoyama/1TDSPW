package br.com.fiap.apostila13.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Exemplo01 {

    static void main(String[] args) {
        //Conectar no banco de dados
        try {
            //Registrar o drive do banco
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conexao = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl", "pf0392", "izumi25");
            System.out.println("Conectado!");

            Statement stmt = conexao.createStatement();
            stmt.executeUpdate("insert into t_jdbc_produto (cd_produto, " +
                    "nm_produto, ds_produto, vl_produto, st_estoque) values " +
                    "(3, 'Churros Chocolate', 'Churros de Chocolate Duplo', 15, 1)");
            System.out.println("Produto cadastrado!");

            conexao.close(); //Fechar a conexão
        } catch (SQLException e){
            System.err.println("Erro no Banco " + e.getMessage());
        } catch (ClassNotFoundException e){
            System.err.println("Classe não encontrada" +e.getMessage());
        }
    }//main
}//class
