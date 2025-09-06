package br.com.fiap;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ExemploCadastro {

    public static void main(String[] args) {

        try {
            //Registrar o driver do banco
            Class.forName("oracle.jdbc.driver.OracleDriver");

            //Obter uma conexão com o banco de dados
            Connection conexao = DriverManager.getConnection(
                    "jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl", "pf0392", "izumi25");

            System.out.println("Conectado com sucesso!");

            //Criar o Statement
            Statement stm = conexao.createStatement();

            //Executar o comando SQL de insert, para cadastrar um produto
            stm.executeUpdate("insert into t_tdspw_produto (cd_produto, nm_produto, qt_produto, ds_produto) " +
                    "values (1, 'Mouse Gamer', 50, 'Mouse com fio para jogar')");

            //Fechar a conexão
            conexao.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }//main
}//class
